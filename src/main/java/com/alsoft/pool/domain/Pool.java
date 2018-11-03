package com.alsoft.pool.domain;

import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pool {

	@Id
	private String id;

	private String name;

	private String description;

	private Creator creator;

	private List<Option> options;

}
