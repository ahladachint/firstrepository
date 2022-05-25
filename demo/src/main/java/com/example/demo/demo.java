package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class demo {
	@Id
	private int id;
	@Column(name = "name")
	private String name;
}
