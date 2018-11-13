package com.alsoft.pool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alsoft.pool.domain.Pool;
import com.alsoft.pool.repository.PoolRepository;

@Service
public class PoolServiceImpl implements PoolService {

	@Autowired
	private PoolRepository poolRepository;

	public Pool createPool(Pool pool) {
		return poolRepository.save(pool);
	}

	public List<Pool> findAll() {
		return poolRepository.findAll();
	}

}
