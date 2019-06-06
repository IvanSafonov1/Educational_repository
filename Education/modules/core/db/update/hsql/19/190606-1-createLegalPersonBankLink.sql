create table EDUCATION_LEGAL_PERSON_BANK_LINK (
    BANK_ID varchar(36) not null,
    LEGAL_PERSON_ID varchar(36) not null,
    primary key (BANK_ID, LEGAL_PERSON_ID)
);
