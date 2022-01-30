REM   Script: Session 01
REM   Create
Select

CREATE TABLE sales_Man ( 
	 
    salesman_id int, 
	 
    salesman_name varchar2(32), 
	 
    salesman_city varchar2(32), 
	 
    commission int 
	 
);

INSERT INTO sales_Man 
VALUES (1000, 'Soniya', 'HYD',10);

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

