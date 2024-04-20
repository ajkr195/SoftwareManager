create table app_software (
id NUMBER GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1) NOT NULL,
softwarename VARCHAR(150) NOT NULL,
softwareprovider VARCHAR(150) NOT NULL,
softwareprovidercontactemail VARCHAR(150) NOT NULL,
created_by VARCHAR(150) NOT NULL,
created_date TIMESTAMP NOT NULL,
modified_by VARCHAR(150) NOT NULL,
modified_date TIMESTAMP NOT NULL,
CONSTRAINT app_software_pk PRIMARY KEY (id), UNIQUE (softwarename));