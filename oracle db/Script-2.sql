DROP TABLE doctor;
CREATE TABLE doctor (
    id NUMBER PRIMARY KEY,
    salary NUMBER,
    name VARCHAR2(50),
    address VARCHAR2(50),
    phone_number VARCHAR2(50)
);
INSERT INTO doctor VALUES (1000, 2500, 'omar', 'zharaa nasr city', '01011009436');
INSERT INTO doctor VALUES (204, 234, 'omar', 'zahree', '0100234875345');
INSERT INTO doctor VALUES (23, 2000, 'ali', 'ain shams', '01223440553');
INSERT INTO doctor VALUES (21, 2322, 'ahmed', 'menoufia', '32423432');
INSERT INTO doctor VALUES (2, 247, 'abdallah', 'faisal', '234234');
INSERT INTO doctor VALUES (243, 23423, 'ahmed', 'ashmon', '324223423');
INSERT INTO doctor VALUES (23123, 23424, 'yassin', 'bajour', '23423455');
COMMIT;
SELECT * FROM doctor;

SELECT id,phone_number 
FROM doctor
WHERE PHONE_NUMBER ='01011009436';
UPDATE doctor
SET salary=5000
WHERE id =23;
COMMIT;
DELETE FROM doctor 
WHERE id=2;
SELECT *FROM doctor;
COMMIT;

SELECT salary AS salary_price FROM doctor;
SELECT * FROM doctor;
SELECT 'name is : '||name ||'  id : '||id   || '  salary is : '|| salary  FROM doctor;

SELECT  'name  :'||name || 'salry is : '||salary || 'salary after increasing the taxes  : '||salary *14/100  FROM doctor;

SELECT name FROM doctor WHERE salary >5000 ;

SELECT * FROM doctor WHERE salary IN (1000,2000,3000); 

SELECT name FROM doctor WHERE name LIKE '%o';


SELECT name ,salary FROM doctor ORDER BY salary ASC ;
ALTER TABLE  doctor RENAME TO prof;

SELECT table_name FROM user_tables WHERE table_name = 'DOCTOR';

