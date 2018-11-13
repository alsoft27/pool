package com.alsoft.pool.service;

import java.util.List;

import com.alsoft.pool.domain.Pool;

public interface PoolService {

	public Pool createPool(Pool pool);

	public List<Pool> findAll();

}
