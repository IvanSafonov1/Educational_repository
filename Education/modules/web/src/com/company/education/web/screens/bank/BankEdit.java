package com.company.education.web.screens.bank;

import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.components.ValidationErrors;
import com.haulmont.cuba.gui.screen.*;
import com.company.education.entity.Bank;

import javax.inject.Inject;

@UiController("education_Bank.edit")
@UiDescriptor("bank-edit.xml")
@EditedEntityContainer("bankDc")
@LoadDataBeforeShow
public class BankEdit extends StandardEditor<Bank> {

    @Inject
    private TextField<String> bikField;

    @Override
    protected void validateAdditionalRules(ValidationErrors errors) {
        super.validateAdditionalRules(errors);
        if (!(bikField.getValue() == null)) {
            if (!bikField.getValue().matches("[0-9]*")) {
                errors.add("Поле БИК должно содержать только цифры");
            }
        }
    }
}
