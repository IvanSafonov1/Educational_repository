package com.company.education.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "EDUCATION_PHYSICAL_PERSON")
@Entity(name = "education_PhysicalPerson")
public class PhysicalPerson extends StandardEntity {
    private static final long serialVersionUID = -3127182255724693579L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "LAST_NAME", nullable = false)
    protected String last_name;

    @NotNull
    @Column(name = "MIDDLE_NAME", nullable = false)
    protected String middle_name;

    @NotNull
    @Column(name = "PERSONAL_ACCOUNT", nullable = false, unique = true, length = 10)
    protected String personal_account;

    @NotNull
    @Column(name = "AGE", nullable = false, length = 3)
    protected String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPersonal_account() {
        return personal_account;
    }

    public void setPersonal_account(String personal_account) {
        this.personal_account = personal_account;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}