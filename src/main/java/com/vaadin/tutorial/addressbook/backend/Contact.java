package com.vaadin.tutorial.addressbook.backend;

import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * A simple DTO for the address book example.
 *
 * Serializable and cloneable Java Object that are typically persisted
 * in the database and can also be easily converted to different formats like JSON.
 */
// Backend DTO class. This is just a typical Java backend implementation
// class and nothing Vaadin specific.
public class Contact implements Serializable, Cloneable {

    private Long id;

    private String firstName = "";
    private String lastName = "";
    private Date startDate ;
    private Date expectedEndDate ;
    private String task;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date sartDate) {
        this.startDate = sartDate;
    }
    
    public Date getExpectedEndDate() {
        return expectedEndDate;
    }

    public void setExpectedEndDate(Date expectedEndDate) {
        this.expectedEndDate = expectedEndDate;
    }

    @Override
    public Contact clone() throws CloneNotSupportedException {
        try {
            return (Contact) BeanUtils.cloneBean(this);
        } catch (Exception ex) {
            throw new CloneNotSupportedException();
        }
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + ", Task=" + task + ", StartDate=" + startDate + ", EndDate="
                + expectedEndDate +  '}';
    }

}
