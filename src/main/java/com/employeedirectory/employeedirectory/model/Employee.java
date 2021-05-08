package com.employeedirectory.employeedirectory.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tb_empl")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String department;

    @Column
    private String gender;

    @Column
    private Date dob;

    @Override
    public String toString() {
        return "Employee [id= " + id + ", name=" + name + ", department=" + department + ", dob=" + dob + ", gender="
                + gender + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    public int getId() {
        return id;
    }
}
