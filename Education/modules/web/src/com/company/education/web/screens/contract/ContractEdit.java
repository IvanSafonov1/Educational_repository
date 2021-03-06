package com.company.education.web.screens.contract;

import com.haulmont.cuba.core.app.UniqueNumbersService;
import com.haulmont.cuba.core.global.PersistenceHelper;
import com.haulmont.cuba.core.global.TimeSource;
import com.haulmont.cuba.gui.components.DateField;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.TextArea;
import com.haulmont.cuba.gui.components.ValidationErrors;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.education.entity.Contract;

import javax.inject.Inject;
import java.util.Date;

@UiController("education_Contract.edit")
@UiDescriptor("contract-edit.xml")
@EditedEntityContainer("contractDc")
@LoadDataBeforeShow
public class ContractEdit extends StandardEditor<Contract> {
    @Inject
    private UniqueNumbersService uniqueNumbersService;
    @Inject
    private InstanceContainer<Contract> contractDc;
    @Inject
    private DateField<Date> conclusionDateField;
    @Inject
    private TimeSource timeSource;
    @Inject
    private DateField<Date> performanceDateField;
    @Inject
    private TextArea<String> descriptionField;


    @Subscribe
    private void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        Contract item = contractDc.getItem();
        if (PersistenceHelper.isNew(item)) {
            item.setNumber(uniqueNumbersService.getNextNumber("Contract"));

        }
    }

    @Subscribe
    private void onInitEntity(InitEntityEvent<Contract> event) {
         event.getEntity().setConclusionDate(timeSource.currentTimestamp());
    }
    @Override
    protected void validateAdditionalRules(ValidationErrors errors) {
        super.validateAdditionalRules(errors);

        if (conclusionDateField.getValue().after(performanceDateField.getValue())) {
            errors.add("Дата заключения не может быть меньше даты исполнения.");
        }
    }

}

