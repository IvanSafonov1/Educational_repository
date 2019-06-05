package com.company.education.web.screens.legal_person;

import com.haulmont.cuba.gui.screen.*;
import com.company.education.entity.LegalPerson;

@UiController("education_Legal_person.browse")
@UiDescriptor("legal_person-browse.xml")
@LookupComponent("legal_personsTable")
@LoadDataBeforeShow
public class Legal_personBrowse extends StandardLookup<LegalPerson> {
}