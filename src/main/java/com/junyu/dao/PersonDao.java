package com.junyu.dao;

import com.junyu.enity.Person;

public interface PersonDao {
	public Person queryPersonById(int id);
	public void insertPerson(Person person);
}
