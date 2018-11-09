package com.alsoft.pool;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alsoft.pool.domain.Creator;
import com.alsoft.pool.domain.Option;
import com.alsoft.pool.domain.Pool;
import com.alsoft.pool.repository.CreatorRepository;
import com.alsoft.pool.repository.PoolRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PoolApplicationTests {

	@Autowired
	private PoolRepository poolRepository;

	@Autowired
	private CreatorRepository creatorRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createPool() {
		Pool pool = new Pool();
		pool.setName("Test pool");
		pool.setDescription("test description pool");
		Creator creator = new Creator();
		creator.setName("userTest");
		creator.setEmail("alsoft27@mail.com");
		creatorRepository.save(creator);

		pool.setCreator(creator);
		List<Option> options = new ArrayList<Option>();
		Option option = new Option();
		option.setQuestion("¿quedamos?");
		options.add(option);
		pool.setOptions(options);
		poolRepository.save(pool);

		System.out.println("Pool --> " + poolRepository.findAll().get(0));
	}

}
