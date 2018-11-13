package com.alsoft.pool;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alsoft.pool.domain.Answer;
import com.alsoft.pool.domain.Creator;
import com.alsoft.pool.domain.Guest;
import com.alsoft.pool.domain.Option;
import com.alsoft.pool.domain.Pool;
import com.alsoft.pool.repository.AnswerRepository;
import com.alsoft.pool.repository.CreatorRepository;
import com.alsoft.pool.repository.GuestRepository;
import com.alsoft.pool.repository.PoolRepository;
import com.alsoft.pool.service.PoolService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PoolApplicationTests {

	@Autowired
	private PoolRepository poolRepository;

	@Autowired
	private CreatorRepository creatorRepository;

	@Autowired
	private GuestRepository guestRepository;

	@Autowired
	private AnswerRepository answerRepository;

	@Autowired
	private PoolService poolService;

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
		Option optionA = new Option();
		optionA.setRefOption("1");
		optionA.setQuestion("¿comida?");
		options.add(optionA);
		Option optionB = new Option();
		optionB.setRefOption("2");
		optionB.setQuestion("¿cena?");
		options.add(optionB);
		pool.setOptions(options);
		poolRepository.save(pool);

		System.out.println("Pool --> " + poolService.findAll().get(0));

		List<Answer> answers = new ArrayList<Answer>();
		Answer answerA = new Answer();
		answerA.setAnswer(false);
		answerA.setRefOption("1");
		answers.add(answerA);
		Answer answerB = new Answer();
		answerB.setAnswer(true);
		answerB.setRefOption("2");
		answers.add(answerB);
		answerRepository.saveAll(answers);
		Guest guest = new Guest();
		guest.setName("pepe");
		guest.setAnswers(answers);
		guestRepository.save(guest);

	}

}
