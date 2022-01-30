REM   Script: Session 03
REM   Session 3 FST b22

REM   Script: Session 01 


REM   Create 


Select 
 
CREATE TABLE sales_Man (  
	  
    salesman_id int,  
	  
    salesman_name varchar2(32),  
	  
    salesman_city varchar2(32),  
	  
    commission int  
	  
);

CREATE TABLE sales_Man (  
	    salesman_id int,  
	    salesman_name varchar2(32),  
	    salesman_city varchar2(32),  
	    commission int);

INSERT INTO sales_Man VALUES (1000, 'Soniya', 'HYD',10);

INSERT INTO sales_Man VALUES (1201, 'Vinay', 'Bloe',11);

INSERT INTO sales_Man VALUES (1100, 'Rama', 'HYD',15);

INSERT INTO sales_Man VALUES (1221, 'Sushma', 'Bloe',14);

select * from sales_Man;

SELECT salesman_id, salesman_city FROM sales_Man;

SELECT * FROM sales_Man WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM sales_Man WHERE salesman_name='Paul Adam';

SELECT * FROM sales_Man WHERE salesman_city='HYD';

SELECT salesman_id, commission FROM sales_Man WHERE salesman_name='Rama';

ALTER TABLE sales_Man ADD grade int;

UPDATE sales_Man SET grade=100;

Select * from sales_Man;

SELECT * FROM sales_Man;

UPDATE sales_Man SET grade=200 WHERE salesman_city='Hyd';

SELECT * FROM sales_Man;

UPDATE sales_Man SET grade=200 WHERE salesman_city='HYD';

UPDATE sales_Man SET grade=300 WHERE salesman_name='bloe';

SELECT * FROM sales_Man;

UPDATE sales_Man SET grade=300 WHERE salesman_name='Bloe';

SELECT * FROM sales_Man;

UPDATE sales_Man SET grade=300 WHERE salesman_name='Sushma';

UPDATE sales_Man SET salesman_name='Ramakrishna' WHERE salesman_name='Rama';

SELECT * FROM sales_Man;

