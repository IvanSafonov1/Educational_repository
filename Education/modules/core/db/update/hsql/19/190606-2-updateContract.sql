update EDUCATION_CONTRACT set DESCRIPTION = '' where DESCRIPTION is null ;
alter table EDUCATION_CONTRACT alter column DESCRIPTION set not null ;
