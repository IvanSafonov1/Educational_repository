-- begin EDUCATION_LEGAL_PERSON
create table EDUCATION_LEGAL_PERSON (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME_OF_COMPANY varchar(255) not null,
    INN varchar(12) not null,
    PERSONAL_ACCOUNT varchar(10) not null,
    --
    primary key (ID)
)^
-- end EDUCATION_LEGAL_PERSON
-- begin EDUCATION_CONTRACT
create table EDUCATION_CONTRACT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_ bigint not null,
    CUSTOMER_ID varchar(36) not null,
    DESCRIPTION longvarchar not null,
    CONCLUSION_DATE date not null,
    PERFORMANCE_DATE date,
    --
    primary key (ID)
)^
-- end EDUCATION_CONTRACT
-- begin EDUCATION_CUSTOMER
create table EDUCATION_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PERSONAL_ACCOUNT varchar(10) not null,
    --
    primary key (ID)
)^
-- end EDUCATION_CUSTOMER
-- begin EDUCATION_BANK
create table EDUCATION_BANK (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    BIK varchar(9) not null,
    --
    primary key (ID)
)^
-- end EDUCATION_BANK
-- begin EDUCATION_PHYSICAL_PERSON
create table EDUCATION_PHYSICAL_PERSON (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    LAST_NAME varchar(255) not null,
    MIDDLE_NAME varchar(255) not null,
    PERSONAL_ACCOUNT varchar(10) not null,
    AGE varchar(3) not null,
    --
    primary key (ID)
)^
-- end EDUCATION_PHYSICAL_PERSON
-- begin EDUCATION_LEGAL_PERSON_BANK_LINK
create table EDUCATION_LEGAL_PERSON_BANK_LINK (
    BANK_ID varchar(36) not null,
    LEGAL_PERSON_ID varchar(36) not null,
    primary key (BANK_ID, LEGAL_PERSON_ID)
)^
-- end EDUCATION_LEGAL_PERSON_BANK_LINK
