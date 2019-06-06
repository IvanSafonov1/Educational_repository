package com.company.education.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

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

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinTable(name = "EDUCATION_LEGAL_PERSON_BANK_LINK",
            joinColumns = @JoinColumn(name = "BANK_ID"),
            inverseJoinColumns = @JoinColumn(name = "LEGAL_PERSON_ID"))
    @ManyToMany
    protected List<LegalPerson> legalPersons;

    public List<LegalPerson> getLegalPersons() {
        return legalPersons;
    }

    public void setLegalPersons(List<LegalPerson> legalPersons) {
        this.legalPersons = legalPersons;
    }

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