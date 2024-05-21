INSERT INTO app_software (softwarename, softwareprovider, softwareprovidercontactemail, created_by, created_date, modified_by, modified_date) VALUES ('FileNet', 'IBM', 'admin@ibm.com', 'System', DATE '2000-12-31', 'System', DATE '2023-12-31');   
INSERT INTO app_software (softwarename, softwareprovider, softwareprovidercontactemail, created_by, created_date, modified_by, modified_date) VALUES ('AcrobatReater', 'ADOBE', 'admin@adobe.com', 'System', DATE '2002-12-31', 'System', DATE '2023-12-31');
INSERT INTO app_software (softwarename, softwareprovider, softwareprovidercontactemail, created_by, created_date, modified_by, modified_date) VALUES ('Office365', 'MICROSOFT', 'admin@microsoft.com', 'System', DATE '1995-12-31', 'System', DATE '2023-12-31');
INSERT INTO app_software (softwarename, softwareprovider, softwareprovidercontactemail, created_by, created_date, modified_by, modified_date) VALUES ('Android', 'GOOGLE', 'admin@google.com', 'System', DATE '2007-12-31', 'System', DATE '2023-12-31');
INSERT INTO app_software (softwarename, softwareprovider, softwareprovidercontactemail, created_by, created_date, modified_by, modified_date) VALUES ('AWS', 'AMAZON', 'admin@amazon.com', 'System', DATE '2015-12-31', 'System', DATE '2023-12-31');
INSERT INTO app_software (softwarename, softwareprovider, softwareprovidercontactemail, created_by, created_date, modified_by, modified_date) VALUES ('Microsoft Word', 'MICROSOFT', 'admin@MICROSOFT.com', 'System', DATE '2015-12-31', 'System', DATE '2023-12-31');
INSERT INTO app_software (softwarename, softwareprovider, softwareprovidercontactemail, created_by, created_date, modified_by, modified_date) VALUES ('Google Chrome', 'Google', 'admin@Google.com', 'System', DATE '2015-12-31', 'System', DATE '2023-12-31');
INSERT INTO app_software (softwarename, softwareprovider, softwareprovidercontactemail, created_by, created_date, modified_by, modified_date) VALUES ('Adobe Photoshop', 'Adobe', 'admin@Adobe.com', 'System', DATE '2015-12-31', 'System', DATE '2023-12-31');
INSERT INTO app_software (softwarename, softwareprovider, softwareprovidercontactemail, created_by, created_date, modified_by, modified_date) VALUES ('Mozilla Firefox', 'Mozilla', 'admin@Mozilla.com', 'System', DATE '2015-12-31', 'System', DATE '2023-12-31');
INSERT INTO app_software (softwarename, softwareprovider, softwareprovidercontactemail, created_by, created_date, modified_by, modified_date) VALUES ('Notepad++', 'Notepad++ Team', 'admin@Notepad.com', 'System', DATE '2015-12-31', 'System', DATE '2023-12-31');
INSERT INTO app_software (softwarename, softwareprovider, softwareprovidercontactemail, created_by, created_date, modified_by, modified_date) VALUES ('Audacity', 'Audacity Team', 'admin@Audacity.com', 'System', DATE '2015-12-31', 'System', DATE '2023-12-31');
INSERT INTO app_software (softwarename, softwareprovider, softwareprovidercontactemail, created_by, created_date, modified_by, modified_date) VALUES ('VMware Workstation', 'VMware Inc', 'admin@VMware.com', 'System', DATE '2015-12-31', 'System', DATE '2023-12-31');
INSERT INTO app_software (softwarename, softwareprovider, softwareprovidercontactemail, created_by, created_date, modified_by, modified_date) VALUES ('Skype', 'MICROSOFT', 'admin@MICROSOFT.com', 'System', DATE '2015-12-31', 'System', DATE '2023-12-31');
INSERT INTO app_software (softwarename, softwareprovider, softwareprovidercontactemail, created_by, created_date, modified_by, modified_date) VALUES ('WinRAR', 'RARLAB', 'admin@RARLAB.com', 'System', DATE '2015-12-31', 'System', DATE '2023-12-31');
INSERT INTO app_software (softwarename, softwareprovider, softwareprovidercontactemail, created_by, created_date, modified_by, modified_date) VALUES ('FileZilla', 'FileZilla Project', 'admin@FileZilla.com', 'System', DATE '2015-12-31', 'System', DATE '2023-12-31');
INSERT INTO app_software (softwarename, softwareprovider, softwareprovidercontactemail, created_by, created_date, modified_by, modified_date) VALUES ('Evernote', 'Evernote', 'admin@Evernote.com', 'System', DATE '2015-12-31', 'System', DATE '2023-12-31');
INSERT INTO app_software (softwarename, softwareprovider, softwareprovidercontactemail, created_by, created_date, modified_by, modified_date) VALUES ('Google Drive', 'Google', 'admin@Google.com', 'System', DATE '2015-12-31', 'System', DATE '2023-12-31');
INSERT INTO app_software (softwarename, softwareprovider, softwareprovidercontactemail, created_by, created_date, modified_by, modified_date) VALUES ('TeamViewer', 'TeamViewer', 'admin@TeamViewer.com', 'System', DATE '2015-12-31', 'System', DATE '2023-12-31');
INSERT INTO app_software (softwarename, softwareprovider, softwareprovidercontactemail, created_by, created_date, modified_by, modified_date) VALUES ('PuTTY', 'PuTTY', 'admin@PuTTY.com', 'System', DATE '2015-12-31', 'System', DATE '2023-12-31');
INSERT INTO app_software (softwarename, softwareprovider, softwareprovidercontactemail, created_by, created_date, modified_by, modified_date) VALUES ('Autodesk AutoCAD', 'Autodesk', 'admin@Autodesk.com', 'System', DATE '2015-12-31', 'System', DATE '2023-12-31');
INSERT INTO app_software (softwarename, softwareprovider, softwareprovidercontactemail, created_by, created_date, modified_by, modified_date) VALUES ('KeePass', 'KeePass', 'admin@KeePass.com', 'System', DATE '2015-12-31', 'System', DATE '2023-12-31');

INSERT INTO app_customer (id, name) VALUES (1, 'CUSTOMER1');
INSERT INTO app_customer (id, name) VALUES (2, 'CUSTOMER2');
INSERT INTO app_customer (id, name) VALUES (3, 'CUSTOMER3');
INSERT INTO app_customer (id, name) VALUES (4, 'CUSTOMER4');
INSERT INTO app_customer (id, name) VALUES (5, 'CUSTOMER5');

INSERT INTO app_software_customer (softwareid, customerid) VALUES (1, 1);
INSERT INTO app_software_customer (softwareid, customerid) VALUES (1, 2);
INSERT INTO app_software_customer (softwareid, customerid) VALUES (1, 3);
INSERT INTO app_software_customer (softwareid, customerid) VALUES (1, 4);
INSERT INTO app_software_customer (softwareid, customerid) VALUES (1, 5);
INSERT INTO app_software_customer (softwareid, customerid) VALUES (2, 1);
INSERT INTO app_software_customer (softwareid, customerid) VALUES (2, 2);
INSERT INTO app_software_customer (softwareid, customerid) VALUES (3, 3);
INSERT INTO app_software_customer (softwareid, customerid) VALUES (4, 4);
INSERT INTO app_software_customer (softwareid, customerid) VALUES (5, 5);