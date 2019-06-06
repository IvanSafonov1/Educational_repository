package com.company.education.web.screens.customer;

import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.components.ValidationErrors;
import com.haulmont.cuba.gui.screen.*;
import com.company.education.entity.Customer;

import javax.inject.Inject;

@UiController("education_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {

    @Inject
    private TextField<String> personal_accountField;

    @Override
    protected void validateAdditionalRules(ValidationErrors errors) {
        super.validateAdditionalRules(errors);
        if (!(personal_accountField.getValue() == null)){
            if (!personal_accountField.getValue().matches("[0-9]*")) {
                errors.add("Поле лицевой счет должно содержать только цифры");
            }
        }
    }
}