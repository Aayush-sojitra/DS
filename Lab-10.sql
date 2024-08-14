create table Student_Info(
RNo int,
Name varchar(30),
Branch varchar(20),
SPI decimal(4,2),
Bklog int
);

insert into Student_Info values (101, 'Raju' ,'CE', 8.80, 0),
								(102, 'Amit' ,'CE' ,2.20, 3),
								(103, 'Sanjay', 'ME', 1.50, 6),
								(104, 'Neha', 'EC', 7.65, 1),								(105, 'Meera' ,'EE', 5.52, 2),								(106,'Mahesh', 'EC', 4.50, 3)select * from Student_Info--1. Create a view Personal with all columns.
create view Personal as
select * from Student_Info

select * from Personal

--2. Create a view Student_Details having columns Name, Branch & SPI.
Create view Student_Details as
select Name,Branch,SPI from Student_Info
select * from Student_Details

--3. Create a view AcademicData having columns RNo, Name, Branch.
Create view AcademicData as
select Rno,Name,Branch from Student_Info
select * from AcademicData

--4. Create a view Student_bklog having all columns but students whose bklog more than 2.
Create view Student_bklog as
select * from Student_Info
where Bklog>2
select * from Student_bklog

--5. Create a view Student_Pattern having RNo, Name & Branch columns in which Name consists of four
--letters.
Create view Student_Pattern as
select RNo, Name,Branch from Student_Info
where name like '____'
select * from Student_Pattern

--6. Insert a new record to AcademicData view. (107, Meet, ME)
insert into AcademicData values(107,'Meet','ME')
select * from AcademicData

--7. Update the branch of Amit from CE to ME in Student_Details view.
update Student_Details
set Branch='ME'
where name='Amit'
select * from Student_Details

--8. Delete a student whose roll number is 104 from AcademicData view.delete from AcademicDatawhere RNo=104------B-------1. Create a view that displays information of all students whose SPI is above 8.5
create view Information as
select * from Student_Info
where SPI>8.5

--2. Create a view that displays 0 backlog students.
create view Temp as
select * from Student_Info
where Bklog=0
select * from temp

--3. Create a view Computerview that displays CE branch data only.create view Computerview as
select * from Student_Info
where Branch='CE'
select * from Computerview-----C-------1. Create a view Result_EC that displays the name and SPI of students with SPI less than 5 of branch EC.
create view Result_EC as
select name,spi from Student_Info
where Branch='EC' and SPI<5

--2. Update the result of student MAHESH to 4.90 in Result_EC view.
update Result_EC 
set spi=4.90
where name='mahesh'

--3. Create a view Stu_Bklog with RNo, Name and Bklog columns in which name starts with ‘M’ and having
--bklogs more than 5.
create view Stu_Bklog as
select rno,name,Bklog from Student_Info
where name like 'M%' and Bklog>5

--4. Drop Computerview form the database.drop view Computerview