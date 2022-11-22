package com.xworkz.krawardeesEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name ="kr_awardees")


public class KRAwardeesEntity {
	
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "year")
	private int year;
	@Column(name = "achievement")
	private String achievement;
	@Column(name = "alive")
	private boolean alive;
	@Column(name = "age")
	private int age;
	@Column(name = "place")
	private String place;


}
