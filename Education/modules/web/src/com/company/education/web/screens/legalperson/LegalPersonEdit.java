package com.company.education.web.screens.legalperson;

import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.components.ValidationErrors;
import com.haulmont.cuba.gui.screen.*;
import com.company.education.entity.LegalPerson;

import javax.inject.Inject;
import javax.validation.constraints.Null;

@UiController("education_LegalPerson.edit")
@UiDescriptor("legal-person-edit.xml")
@EditedEntityContainer("legalPersonDc")
@LoadDataBeforeShow
public class LegalPersonEdit extends StandardEditor<LegalPerson> {
    @Inject
    private TextField<String> innField;
    @Inject
    private TextField<String> personal_accountField;
    @Inject
    private TextField<String> name_of_companyField;

    @Override
    protected void validateAdditionalRules(ValidationErrors errors) {
        super.validateAdditionalRules(errors);

        if (!(innField.getValue() == null)){
            if (!innField.getValue().matches("[0-9]*")){
                errors.add("Поле ИНН должно содержать только цифры");
            }
        }
        if (!(personal_accountField.getValue() == null)){
            if (!personal_accountField.getValue().matches("[0-9]*")){
                errors.add("Поле лицевой счет должно содержать только цифры");
            }
        }


    }
}