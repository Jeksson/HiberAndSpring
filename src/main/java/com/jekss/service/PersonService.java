package com.jekss.service;

import com.jekss.model.Person;

import java.util.List;

/**
 * Created by Жека on 28.05.2015.
 */
public interface PersonService {
    public void addPerson(Person person);
    public void updatePerson(Person person);
    public List<Person> listPerson();
    public Person getPersonById(int id);
    public void removePerson(int id);
}
