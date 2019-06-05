package com.company.education.web.screens.contract;

import com.haulmont.cuba.gui.screen.*;
import com.company.education.entity.Contract;

@UiController("education_Contract.edit")
@UiDescriptor("contract-edit.xml")
@EditedEntityContainer("contractDc")
@LoadDataBeforeShow
public class ContractEdit extends StandardEditor<Contract> {
}