--Sub Queries--
CREATE TABLE Stu_Detail (
    Rno INT,
    Name VARCHAR(50),
    City VARCHAR(50),
    DID INT,
);

INSERT INTO Stu_Detail (Rno, Name, City, DID) VALUES
(101, 'Raju', 'Rajkot', 10),
(102, 'Amit', 'Ahmedabad', 20),
(103, 'Sanjay', 'Baroda', 40),
(104, 'Neha', 'Rajkot', 20),
(105, 'Meera', 'Ahmedabad', 30),
(106, 'Mahesh', 'Baroda', 10);

CREATE TABLE Academic (
    Rno INT,
    SPI DECIMAL(3, 1),
    Bklog INT
);

INSERT INTO Academic (Rno, SPI, Bklog) VALUES
(101, 8.8, 0),
(102, 9.2, 2),
(103, 7.6, 1),
(104, 8.2, 4),
(105, 7.0, 2),
(106, 8.9, 3);

CREATE TABLE Department (
    DID INT,
    DName VARCHAR(50)
);

INSERT INTO Department (DID, DName) VALUES
(10, 'Computer'),
(20, 'Electrical'),
(30, 'Mechanical'),
(40, 'Civil');

-----Part – A-----

--1. Display details of students who are from computer department.
select * from Stu_Detail
where DID in (select DID from Department
				where DName='computer' )

--2. Displays name of students whose SPI is more than 8.
select Name from Stu_Detail
where Rno in (select Rno from Academic
				where SPI>8 )

--3. Display details of students of computer department who belongs to Rajkot city.
select * from Stu_Detail
where DID in (select DID from Department
				where DName='computer' )
				and
	  City='rajkot'

--4. Find total number of students of electrical department.
select count(Name) from Stu_Detail
where DID in (select DID from Department
				where DName='electrical' )

--5. Display name of student who is having maximum SPI.
select name from Stu_Detail
where Rno in (select Rno from Academic
				where spi=(select max(SPI) from Academic) )

--6. Display details of students having more than 1 backlog
select * from Stu_Detail
where Rno in (select Rno from Academic
				where Bklog>1  )