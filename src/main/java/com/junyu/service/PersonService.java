package com.junyu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junyu.dao.PersonDao;
import com.junyu.enity.Person;

@Service
public class PersonService {
	
	@Autowired
	PersonDao personDao;
	
	public Person queryPersonById(int id){
		return personDao.queryPersonById(id);
	}
	
	public void insertPerson(Person person){
		personDao.insertPerson(person);
	}
}
