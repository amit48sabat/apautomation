package com.incture.accpay.services;

import java.util.List;

import javax.ejb.Local;

import com.incture.accpay.entities.Person;

@Local
public interface PersonBean2Local {

	List<Person> getAllPersons();

	void addPerson(Person person);

}
