package com.company.education.web.screens.physical_person;

import com.haulmont.cuba.gui.screen.*;
import com.company.education.entity.Physical_person;

@UiController("education_Physical_person.edit")
@UiDescriptor("physical_person-edit.xml")
@EditedEntityContainer("physical_personDc")
@LoadDataBeforeShow
public class Physical_personEdit extends StandardEditor<Physical_person> {
}