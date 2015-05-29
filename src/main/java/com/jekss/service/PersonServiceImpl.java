package com.jekss.service;

import com.jekss.dao.PersonDao;
import com.jekss.model.Person;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Жека on 28.05.2015.
 */
@Service
public class PersonServiceImpl implements PersonService {

    private PersonDao personDao;

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    @Transactional
    public void addPerson(Person person) {
        personDao.addPerson(person);
    }

    @Override
    @Transactional
    public void updatePerson(Person person) {
        personDao.updatePerson(person);
    }

    @Override
    @Transactional
    public List<Person> listPerson() {

        return personDao.listPersons();
    }

    @Override
    @Transactional
    public Person getPersonById(int id) {
        return personDao.getPersonById(id);
    }

    @Override
    @Transactional
    public void removePerson(int id) {
            personDao.removePerson(id);
    }
}
