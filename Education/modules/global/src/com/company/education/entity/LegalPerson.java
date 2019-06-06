package com.company.education.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NamePattern("%s|name_of_company")
@Table(name = "EDUCATION_LEGAL_PERSON")
@Entity(name = "education_LegalPerson")
public class LegalPerson extends StandardEntity {
    private static final long serialVersionUID = -255844484957261276L;

    @NotNull
    @Column(name = "NAME_OF_COMPANY", nullable = false, unique = true)
    protected String name_of_company;

    @NotNull
    @Column(name = "INN", nullable = false, unique = true, length = 12)
    protected String inn;

    @NotNull
    @Column(name = "PERSONAL_ACCOUNT", nullable = false, unique = true, length = 10)
    protected String personal_account;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinTable(name = "EDUCATION_LEGAL_PERSON_BANK_LINK", joinColumns = @JoinColumn(name = "LEGAL_PERSON_ID"), inverseJoinColumns = @JoinColumn(name = "BANK_ID"))
    @ManyToMany
    protected List<Bank> bank;

    public void setBank(List<Bank> bank) {
        this.bank = bank;
    }

    public List<Bank> getBank() {
        return bank;
    }

    public String getPersonal_account() {
        return personal_account;
    }

    public void setPersonal_account(String personal_account) {
        this.personal_account = personal_account;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getName_of_company() {
        return name_of_company;
    }

    public void setName_of_company(String name_of_company) {
        this.name_of_company = name_of_company;
    }
}