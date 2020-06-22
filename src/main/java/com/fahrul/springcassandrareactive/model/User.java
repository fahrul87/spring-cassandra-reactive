package com.fahrul.springcassandrareactive.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class User {
	
	@PrimaryKey
	private int id;
	private String name;
	private String address;
	private int age;

}
