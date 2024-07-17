create table EMP(
	EID int,
	ENAME varchar(50),
	Department varchar(50),
	Salary int,
	JoiningDate DateTime,
	City varchar(50)
);

insert into EMP values (101, 'Rahul', 'Admin', 56000, '1990-1-1', 'Rajkot'),					   (102, 'Hardik', 'IT' ,18000, '1990-9-25' ,'Ahmedabad'),					   (103 ,'Bhavin' ,'HR' ,25000, '1991-5-14' ,'Baroda'),					   (104 ,'Bhoomi' ,'Admin' ,39000 ,'1991-2-8', 'Rajkot'),					   (105 ,'Rohit' ,'IT' ,17000, '1990-7-23' ,'Jamnagar'),					   (106 ,'Priya' ,'IT' ,9000, '1990-10-18', 'Ahmedabad'),					   (107 ,'Bhoomi' ,'HR' ,34000 ,'1991-12-25', 'Rajkot')select * from EMP		--1. Display the Highest, Lowest, Label the columns Maximum, Minimum respectively.select max(salary) as Maxmium, min(salary) as Minimum from EMP

--2. Display Total, and Average salary of all employees. Label the columns Total_Sal and Average_Sal,
--respectively.
select sum(salary) as Total_sal, Avg(salary) as Avg_sal from EMP

--3. Find total number of employees of EMPLOYEE table.
select count(ENAME) from EMP

--4. Find highest salary from Rajkot city.
select max(Salary) from EMP
where city='rajkot'

--5. Give maximum salary from IT department.
select max(Salary) from EMP
where Department='it'

--6. Count employee whose joining date is after 8-feb-91.
select count(EID) from EMP
where JoiningDate>'1991-2-8'

--7. Display average salary of Admin department.
select avg(Salary) from EMP
where Department='admin'

--8. Display total salary of HR department.
select sum(Salary) from EMP
where Department='hr'

--9. Count total number of cities of employee without duplication.
select count(distinct city) from EMP

--10. Count unique departments.
select count(distinct Department) from EMP

--11. Give minimum salary of employee who belongs to Ahmedabad.
select min(Salary) from EMP
where city='Ahmedabad'

--12. Find city wise highest salary.
select city,max(Salary) as Max_sal from EMP
group by City

--13. Find department wise lowest salary.
select Department,min(Salary) as Min_sal from EMP
group by Department

--14. Display city with the total number of employees belonging to each city.
select city,count(EID) as No_of_EMP from EMP
group by City

--15. Give total salary of each department of EMP table.
select Department,sum(Salary) as Total_sal from EMP
group by Department

--16. Give average salary of each department of EMP table without displaying the respective department
--name.select avg(Salary) as Avg_sal from EMP
group by Department----B------1. Count the number of employees living in Rajkot.
select count(EID) from EMP
where city='rajkot'

--2. Display the difference between the highest and lowest salaries. Label the column DIFFERENCE.
select max(salary)-min(salary) as DIFFERENCE from EMP

--3. Display the total number of employees hired before 1st January, 1991.select count(EID) from EMP
where JoiningDate<'1991-1-1'----C------1. Count the number of employees living in Rajkot or Baroda.
select count(EID) from EMP
where city='rajkot' or city='baroda'

--2. Display the total number of employees hired before 1st January, 1991 in IT department.
select count(EID) from EMP
where JoiningDate<'1991-1-1' and Department='it'

--3. Find the Joining Date wise Total Salaries.
Select JoiningDate ,sum(salary) as total_sal from EMP
group by JoiningDate

--4. Find the Maximum salary department & city wise in which city name starts with ‘R’.select department,City,max(Salary) as Max_sal from EMP
where city like 'r%'group by Department,City-------------------------------EXTRA---------------------------------1--select department, ename, max(salary) from empwhere salary in (select max(salary) from emp group by Department)group by Department, ENAME--2--select city,avg(salary) as Avg_sal from Empgroup by city--3--select max(salary) as Second_highest_sal from empwhere Salary<(select max(Salary) from emp)--4--select count(eid) from empwhere MONTH(JoiningDate)<=6--5--