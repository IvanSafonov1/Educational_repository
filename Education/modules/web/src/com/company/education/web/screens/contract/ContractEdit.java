package com.company.education.web.screens.contract;

import com.haulmont.cuba.core.app.UniqueNumbersService;
import com.haulmont.cuba.core.global.PersistenceHelper;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.education.entity.Contract;

import javax.inject.Inject;

@UiController("education_Contract.edit")
@UiDescriptor("contract-edit.xml")
@EditedEntityContainer("contractDc")
@LoadDataBeforeShow
public class ContractEdit extends StandardEditor<Contract> {
    @Inject
    private UniqueNumbersService uniqueNumbersService;
    @Inject
    private InstanceContainer<Contract> contractDc;


    @Subscribe
    private void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        Contract item = contractDc.getItem();
        if (PersistenceHelper.isNew(item)) {
            item.setNumber(uniqueNumbersService.getNextNumber("Contract"));
        }
    }

}