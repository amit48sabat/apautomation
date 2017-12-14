package com.incture.accpay.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.incture.accpay.entities.Person;

/**
 * Session Bean implementation class PersonBean2
 */
@Stateless
@LocalBean
public class PersonBean2 implements PersonBean2Local {

    /**
     * Default constructor. 
     */
    public PersonBean2() {
        // TODO Auto-generated constructor stub
    }
    
    
    @PersistenceContext(name = "ACCOUNT_PAYEE_PU")
    private EntityManager em;

    /**
     * Get all persons from the table.
     */
    @Override
    public List<Person> getAllPersons() {
    	return em.createNamedQuery("AllPersons", Person.class).getResultList();
    }

    /**
     * Add a person to the table.
     */
    @Override
    public void addPerson(Person person) {
        em.persist(person);
        em.flush();
    }

}
