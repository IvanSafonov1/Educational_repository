package com.company.education.web.screens.physical_person;

import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.components.ValidationErrors;
import com.haulmont.cuba.gui.screen.*;
import com.company.education.entity.PhysicalPerson;

import javax.inject.Inject;

@UiController("education_PhysicalPerson.edit")
@UiDescriptor("physical_person-edit.xml")
@EditedEntityContainer("physical_personDc")
@LoadDataBeforeShow
public class physicalPersonEdit extends StandardEditor<PhysicalPerson> {


    @Inject
    private TextField<String> personalAccountField;

    @Override
    protected void validateAdditionalRules(ValidationErrors errors) {
        super.validateAdditionalRules(errors);
        if (!(personalAccountField.getValue() == null)) {
            if (!personalAccountField.getValue().matches("[0-9]*")) {
                errors.add("Поле лицевой счет должно содержать только цифры");
            }
        }

    }
}