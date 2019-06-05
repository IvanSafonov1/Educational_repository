package com.company.education.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "EDUCATION_CUSTOMER")
@Entity(name = "education_Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = 2526165953448832759L;
}