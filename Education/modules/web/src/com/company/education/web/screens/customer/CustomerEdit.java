package com.company.education.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.education.entity.Customer;

@UiController("education_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {
}