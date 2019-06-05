package com.company.education.web.screens.contract;

import com.haulmont.cuba.gui.screen.*;
import com.company.education.entity.Contract;

@UiController("education_Contract.browse")
@UiDescriptor("contract-browse.xml")
@LookupComponent("contractsTable")
@LoadDataBeforeShow
public class ContractBrowse extends StandardLookup<Contract> {
}