-------ALTER------

---A---

--1. Add two more columns City VARCHAR (20) and Pincode INT. 

alter table deposit add City varchar(20), Pincode int
select * from Deposit

-- 2. Change the size of CNAME column from VARCHAR (50) to VARCHAR (35). 

Alter table deposit alter column cname varchar(35)
select * from Deposit

--3. Change the data type DECIMAL to INT in amount Column.

Alter table deposit alter column amount int

-- 4. Rename Column ActNo to ANO.

sp_rename 'deposit.Actno','ANo'

--  5. Delete Column City from the DEPOSIT table.

Alter table deposit drop column city 

--6. Change name of table DEPOSIT to DEPOSIT_DETAIL.

sp_rename 'deposit','Deposit_detail'



---B---

--1. Rename Column ADATE to AOPENDATE OF DEPOSIT_DETAIL table. 
sp_rename 'deposit_detail.adate','aopendate'

--2. Delete Column AOPENDATE from the DEPOSIT_DETAIL table.
Alter table deposit_detail drop column aopendate 

-- 3. Rename Column CNAME to CustomerName.

sp_rename 'deposit_detail.cname','customerName'
select * from Deposit_detail


--------DELETE, Truncate, Drop Operation-------

---A---

--1. Delete all the records of DEPOSIT_DETAIL table having amount greater than and equals to 4000
delete from deposit_detail
where amount>=4000

--. 2. Delete all the accounts CHANDI BRANCH. 
delete from deposit_detail
where bname='chandi'

--3. Delete all the accounts having account number (ANO) is greater than 105.
delete from deposit_detail
where ano>105

-- 4. Delete all the records of Deposit_Detail table. (Use Truncate) 
truncate table deposit_detail

--5. Remove Deposit_Detail table. (Use Drop)
drop table deposit_detail

---B---

create table EMPLOYEE_MASTER(
Empno int,
EmpName VARCHAR(25),
JoiningDate DATETIME,
Salary DECIMAL (8,2),
City  VARCHAR(20)
);

insert into EMPLOYEE_MASTER values (101,'keyur','2002-1-5',12000,'rajkot'),
								   (102,'Hardik','2004-2-15',14000.00,'Ahmedabad'),
								   (103,'Kajal','2006-3-14',15000.00,'Baroda'),
								   (104,'Bhoomi','2005-6-23',12500.00,'Ahmedabad'),
								   (105,'Harmit','2004-2-15',14000.00,'rajkot'),
								   (106,'Mitesh','2001-9-25',5000.00,'Jamnagar'),
								   (107,'Meera',null,7000.00,'Morbi'),
								   (108,'Kishan','2003-3-6',10000.00,null);
truncate table EMPLOYEE_MASTER

select * from EMPLOYEE_MASTER


--1. Delete all the records of Employee_MASTER table having salary greater than and equals to 14000.

delete from EMPLOYEE_MASTER
where salary>=14000

--2. Delete all the Employees who belongs to ‘RAJKOT’ city.

delete from EMPLOYEE_MASTER
where City='rajkot'

--3. Delete all the Employees who joined after 1-1-2007.

delete from EMPLOYEE_MASTER
where JoiningDate>'2007-1-1'

--4. Delete the records of Employees whose joining date is null and Name is not null.

delete from EMPLOYEE_MASTER
where JoiningDate is null and not EmpName is null

--5. Delete the records of Employees whose salary is 50% of 20000.

delete from EMPLOYEE_MASTER
where salary=20000*0.5

--6. Delete the records of Employees whose City Name is not empty.

delete from EMPLOYEE_MASTER
where not City is null

--7. Delete all the records of Employee_MASTER table. (Use Truncate)
truncate table EMPLOYEE_MASTER

--8. Remove Employee_MASTER table. (Use Drop)
drop table EMPLOYEE_MASTER  
 
