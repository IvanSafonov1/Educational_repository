package com.company.education.web.screens.physical_person;

import com.haulmont.cuba.gui.screen.*;
import com.company.education.entity.Physical_person;

@UiController("education_Physical_person.browse")
@UiDescriptor("physical_person-browse.xml")
@LookupComponent("physical_personsTable")
@LoadDataBeforeShow
public class Physical_personBrowse extends StandardLookup<Physical_person> {
}