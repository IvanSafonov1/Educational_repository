package com.company.education.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.education.entity.Customer;

@UiController("education_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}