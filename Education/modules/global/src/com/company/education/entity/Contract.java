package com.company.education.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "EDUCATION_CONTRACT")
@Entity(name = "education_Contract")
public class Contract extends StandardEntity {
    private static final long serialVersionUID = 7753655191035057149L;

    @NotNull
    @Column(name = "NUMBER_", nullable = false, unique = true, precision = 19, scale = 0)
    protected BigDecimal number;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUSTOMER_ID")
    protected Customer customer;

    @Column(name = "DESCRIPTION", nullable = false, unique = false, length = 10)
    protected String descriptionString;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "CONCLUSION_DATE", nullable = false)
    protected Date conclusion_date;

    @Temporal(TemporalType.DATE)
    @Column(name = "PERFORMANCE_DATE")
    protected Date performance_date;

    public Date getPerformance_date() {
        return performance_date;
    }

    public void setPerformance_date(Date performance_date) {
        this.performance_date = performance_date;
    }

    public Date getConclusion_date() {
        return conclusion_date;
    }

    public void setConclusion_date(Date conclusion_date) {
        this.conclusion_date = conclusion_date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }
}