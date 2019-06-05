package com.company.education.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "EDUCATION_BANK")
@Entity(name = "education_Bank")
public class Bank extends StandardEntity {
    private static final long serialVersionUID = 6886510743098474257L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    protected String name;

    @NotNull
    @Column(name = "BIK", nullable = false, unique = true, length = 9)
    protected String bik;

    public String getBik() {
        return bik;
    }

    public void setBik(String bik) {
        this.bik = bik;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}