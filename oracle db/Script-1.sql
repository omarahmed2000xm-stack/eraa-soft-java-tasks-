CREATE TABLE Manager2(
id NUMBER PRIMARY KEY ,
name varchar2(50),
age NUMBER,
birth_date DATE,
address varchar2(50)

);

ALTER TABLE  Manager2  DROP COLUMN  address;
ALTER  TABLE Manager2 ADD (
city_address varchar2(50),
street varchar2(50)
);

ALTER TABLE Manager2 RENAME COLUMN  name TO full_name;
ALTER  TABLE Manager2 READ ONLY ;

CREATE TABLE owner AS SELECT id ,FULL_name,birth_date  FROM
Manager2 ;
ALTER TABLE  Manager2 READ WRITE ;
ALTER TABLE Manager2 RENAME TO Master;
DROP TABLE owner ;
 DROP TABLE Master ;