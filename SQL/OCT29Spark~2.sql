SELECT * FROM EMPLOYEE;


SELECT * FROM EMPLOYEE 
WHERE LASTNAME LIKE 'King';


SELECT * FROM EMPLOYEE WHERE FIRSTNAME 
LIKE 'Andrew' AND REPORTSTO IS NULL;


SELECT * FROM ALBUM ORDER BY 
TITLE DESC;


SELECT FIRSTNAME FROM CUSTOMER 
ORDER BY CITY;


INSERT INTO GENRE (GENREID, NAME) 
VALUES (26, 'RAP');
INSERT INTO GENRE (GENREID, NAME) 
VALUES (27, 'INDIE');


INSERT INTO EMPLOYEE (EMPLOYEEID, LASTNAME, FIRSTNAME) 
VALUES (9, 'UMANZOR', 'RYAN');


INSERT INTO EMPLOYEE (EMPLOYEEID, LASTNAME, FIRSTNAME) 
VALUES (10, 'John', 'Doe');


INSERT INTO CUSTOMER (CUSTOMERID, FIRSTNAME, LASTNAME, EMAIL) 
VALUES (60, 'Michael', 'Scott','ryanumanzor@ryanumanzor.com');


INSERT INTO CUSTOMER (CUSTOMERID, FIRSTNAME, LASTNAME, EMAIL) 
VALUES (61, 'Dwight', 'Schrute','ryanumanzor@ryanumanzor.com');


UPDATE CUSTOMER SET FIRSTNAME = 'ROBERT', LASTNAME = 'WALTER'
WHERE CUSTOMERID = 32;

UPDATE ARTIST SET NAME = 'CCR' 
WHERE ARTISTID = 76;


SELECT * FROM INVOICE 
WHERE BILLINGADDRESS LIKE 'T%';


SELECT * FROM INVOICE
WHERE TOTAL BETWEEN '1' AND '15';

SELECT * FROM EMPLOYEE WHERE HIREDATE 
BETWEEN TO_DATE('01/06/2003','DD-MM-YYYY') 
AND TO_DATE('01/3/2004','DD-MM-YYYY');

COMMIT;






