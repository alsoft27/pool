package com.alsoft.pool.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pool {

	@Id
	private String id;

	private String name;

	private String description;

	@DBRef
	private Creator creator;

	private List<Option> options;

}
