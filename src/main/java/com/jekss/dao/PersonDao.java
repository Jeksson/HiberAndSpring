package com.jekss.dao;

import com.jekss.model.Person;

import java.util.List;

/**
 * Created by Жека on 28.05.2015.
 */
public interface PersonDao {
    public void addPerson(Person person);
    public void updatePerson(Person person);
    public List<Person> listPersons();
    public Person getPersonById(int id);
    public void removePerson(int id);
}
