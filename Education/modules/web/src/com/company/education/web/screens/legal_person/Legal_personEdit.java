package com.company.education.web.screens.legal_person;

import com.haulmont.cuba.gui.screen.*;
import com.company.education.entity.Legal_person;

@UiController("education_Legal_person.edit")
@UiDescriptor("legal_person-edit.xml")
@EditedEntityContainer("legal_personDc")
@LoadDataBeforeShow
public class Legal_personEdit extends StandardEditor<Legal_person> {
}