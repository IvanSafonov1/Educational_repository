package com.company.education.web.screens.bank;

import com.haulmont.cuba.gui.screen.*;
import com.company.education.entity.Bank;

@UiController("education_Bank.edit")
@UiDescriptor("bank-edit.xml")
@EditedEntityContainer("bankDc")
@LoadDataBeforeShow
public class BankEdit extends StandardEditor<Bank> {
}