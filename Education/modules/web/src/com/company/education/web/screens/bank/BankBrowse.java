package com.company.education.web.screens.bank;

import com.haulmont.cuba.gui.screen.*;
import com.company.education.entity.Bank;

@UiController("education_Bank.browse")
@UiDescriptor("bank-browse.xml")
@LookupComponent("banksTable")
@LoadDataBeforeShow
public class BankBrowse extends StandardLookup<Bank> {
}