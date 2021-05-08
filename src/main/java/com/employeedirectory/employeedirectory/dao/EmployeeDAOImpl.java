package com.employeedirectory.employeedirectory.dao;

import com.employeedirectory.employeedirectory.model.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

//implements methods for DAO interface

//EntityManager API process queries and transactions on the objects against the database
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    EntityManager entityManager;
    @Override
    public List<Employee> get() {
        //Session is used to get a physical connection with a database
        //They are not open for a long time
        Session currSession = entityManager.unwrap(Session.class);
        Query<Employee> query = currSession.createQuery("from Employee", Employee.class);
        return query.getResultList();
    }

    @Override
    public Employee get(int id) {
        Session currSession = entityManager.unwrap(Session.class);
        return currSession.get(Employee.class, id);
    }

    @Override
    public void save(Employee employee) {
        Session currSession = entityManager.unwrap(Session.class);
        currSession.saveOrUpdate(employee);

    }

    @Override
    public void delete(int id) {
        Session currSession = entityManager.unwrap(Session.class);
        Employee emp = currSession.get(Employee.class, id);
        currSession.delete(emp);

    }
}
