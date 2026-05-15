CREATE TABLE students(
id NUMBER PRIMARY KEY ,
name VARCHAR2(50)NOT NULL ,
age NUMBER


);
INSERT INTO students(id,name,age)
VALUES (1567,'ali',15);
INSERT INTO STUDENTS (id,name,age)
VALUES (34234,'abdallah',18);
INSERT INTO STUDENTS (id,name,age)
VALUES (3243241,'shimaa',13);
INSERT  INTO STUDENTS (id ,name,age)
VALUES (3322434,'sanna',70);
SELECT * FROM STUDENTS 
WHERE name ='ali';
UPDATE STUDENTS 
SET age=30
WHERE  name='shimaa';

UPDATE STUDENTS 
SET name ='abdallahe mohamed'
WHERE name ='abdallah';

UPDATE STUDENTS 
SET age =18
WHERE age >17.9;


SELECT * FROM STUDENTS ;
DROP TABLE STUDENTS ;