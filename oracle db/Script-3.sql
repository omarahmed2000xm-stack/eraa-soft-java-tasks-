create TABLE  My_EMPOLYEES(
EmployeeID NUMBER ,
FirstName varchar2(50) ,
Last_Name varchar2(50),
Department varchar2(50), 
Salary NUMBER 
); 

--creating TABLE empolyees here  AND AFTER this i will INSERT the DATA 
INSERT INTO MY_EMPOLYEES  VALUES (101  ,         'John1'    ,  'Doe1' ,    'HR' ,           20000);

INSERT  INTO MY_EMPOLYEES VALUES (102         ,   'John2'    ,  'Doe2',     'IT'            ,50000);
INSERT  INTO MY_EMPOLYEES VALUES (103    ,        'John3'  ,    'Doe3'  ,   'CS'       ,     40000);
INSERT  INTO MY_EMPOLYEES VALUES (104            ,'John4'   ,   'Doe4'   ,  'IT'     ,       10000);
INSERT  INTO MY_EMPOLYEES VALUES (105     ,       'John5'    ,  'Doe5'  ,  'ZX'      ,      30000);

UPDATE MY_EMPOLYEES
SET salary =600000
WHERE EmployeeID=101;
DELETE FROM MY_EMPOLYEES
WHERE EmployeeID=101;

SELECT * FROM MY_EMPOLYEES WHERE Department='IT';

SELECT 'the full name is : '|| FirstName|| ' '||Last_Name FROM MY_EMPOLYEES ;