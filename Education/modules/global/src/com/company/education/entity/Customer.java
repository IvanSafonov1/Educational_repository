package com.company.education.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "EDUCATION_CUSTOMER")
@Entity(name = "education_Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = 2526165953448832759L;

    @NotNull
    @Column(name = "PERSONAL_ACCOUNT", nullable = false, unique = true, length = 10)
    protected String personal_account;

    public String getPersonal_account() {
        return personal_account;
    }

    public void setPersonal_account(String personal_account) {
        this.personal_account = personal_account;
    }
}