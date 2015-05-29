package com.jekss.dao;

import com.jekss.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Жека on 28.05.2015.
 */
@Repository
public class PersonDaoImpl implements PersonDao {


    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addPerson(Person person) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(person);
    }

    @Override
    public void updatePerson(Person person) {
        Session session = sessionFactory.getCurrentSession();
        session.update(person);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Person> listPersons() {
        Session session = sessionFactory.getCurrentSession();
        List<Person> personList = session.createQuery("from Person").list();
        return personList;
    }

    @Override
    public Person getPersonById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Person p = (Person)session.load(Person.class, id);
        return p;
    }

    @Override
    public void removePerson(int id) {
        Session session = sessionFactory.getCurrentSession();
        Person p = (Person)session.load(Person.class, id);
        if (null != p){
            session.delete(p);
        }

    }
}
