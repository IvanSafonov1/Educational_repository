package com.company.education.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "EDUCATION_CONTRACT")
@Entity(name = "education_Contract")
public class Contract extends StandardEntity {
    private static final long serialVersionUID = 7753655191035057149L;

    @NotNull
    @Column(name = "NUMBER_", nullable = false, unique = true)
    protected Long number;

    @OnDeleteInverse(DeletePolicy.DENY)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUSTOMER_ID")
    protected Customer customer;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "CONCLUSION_DATE", nullable = false)
    protected Date conclusionDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "PERFORMANCE_DATE")
    protected Date performanceDate;

    public void setNumber(Long number) {
        this.number = number;
    }

    public Long getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPerformanceDate() {
        return performanceDate;
    }

    public void setPerformanceDate(Date performanceDate) {
        this.performanceDate = performanceDate;
    }

    public Date getConclusionDate() {
        return conclusionDate;
    }

    public void setConclusionDate(Date conclusionDate) {
        this.conclusionDate = conclusionDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}