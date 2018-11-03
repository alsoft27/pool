package com.alsoft.pool.domain;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Creator {

	@Id
	private String id;

	private String name;

	private String email;

}
