create Database CSE_A5_194

create table STUDENT(
	StuID INT,
	FirstName VARCHAR(25),
	LastName VARCHAR(25),
	Website VARCHAR(50),
	City VARCHAR(25),
	Address VARCHAR(100)
);

insert into STUDENT values (1011,'Keyur','Patel', 'techonthenet.com','Rajkot',' A-303 ''Vasant Kunj'' Rajkot')
insert into STUDENT values (1022,'Hardik', 'Shah', 'digminecraft.com','Ahmedabad','"Ram Krupa", Raiya Road')
insert into STUDENT values (1033 ,'Kajal' ,'Trivedi' ,'bigactivities.com' ,'Baroda',' Raj bhavan plot, near garden')
insert into STUDENT values (1044 ,'Bhoomi' ,'Gajera' , 'checkyourmath.com ' ,'Ahmedabad','"Jig''s Home", Narol' )
insert into STUDENT values (1055, 'Harmit', 'Mitel', '@me.darshan.com', 'Rajkot',' B-55, Raj Residency')
insert into STUDENT values (1066, 'Ashok','Jani', NULL,'Baroda' ,'A502, Club House Building')
select * from STUDENT
drop table STUDENT

--1. Display the name of students whose name starts with ‘k’.

Select firstname from STUDENT
where FirstName like 'k%'

--2. Display the name of students whose name consists of five characters.

Select firstname from STUDENT
where FirstName like '_____'

--3. Retrieve the first name & last name of students whose city name ends with a & contains six characters.

Select firstname,LastName from STUDENT
where City like '_____a'

--4. Display all the students whose last name ends with ‘tel’.

Select * from STUDENT
where LastName like '%tel'

--5. Display all the students whose first name starts with ‘ha’ & ends with‘t’.

Select * from STUDENT
where FirstName like 'ha%t'

--6. Display all the students whose first name starts with ‘k’ and third character is ‘y’.

Select * from STUDENT
where FirstName like 'k_y%'

--7. Display the name of students having no website and name consists of five characters.

Select FirstName from STUDENT
where FirstName like '_____' and Website is null

--8. Display all the students whose last name consist of ‘jer’.

Select * from STUDENT
where LastName like '%jer%'

--9. Display all the students whose city name starts with either ‘r’ or ‘b’.

Select * from STUDENT
where City like '[r,b]%'

--10. Display all the name students having websites.

Select * from STUDENT
where not Website is null

--11. Display all the students whose name starts from alphabet A to H.

Select * from STUDENT
where FirstName like '[a-h]%'

--12. Display all the students whose name’s second character is vowel.

Select * from STUDENT
where FirstName like '_[a,e,i,o,u]%'

--13. Display the name of students having no website and name consists of minimum five characters.

Select FirstName from STUDENT
where FirstName like '_____%' and Website is null

--14. Display all the students whose last name starts with ‘Pat’.

Select * from STUDENT
where LastName like 'pat%'

--15. Display all the students whose city name does not starts with ‘b’

Select * from STUDENT
where City not like 'B%'


------B------


--1. Display all the students whose name starts from alphabet A or H.


Select * from STUDENT
where FirstName like '[a-h]%'

--2. Display all the students whose name’s second character is vowel and of and start with H.


Select * from STUDENT
where FirstName like 'h[a,e,i,o,u]%'

--3. Display all the students whose last name does not ends with ‘a’.

Select * from STUDENT
where lastname not like '%a'

--4. Display all the students whose first name starts with consonant.

Select * from STUDENT
where FirstName not like '[a,e,i,o,u]%'

--5. Display all the students whose website contains .net

Select * from STUDENT
where website like '%.net%'


-----C-----

--1. Display all the students whose address consist of -.

Select * from STUDENT
where address like '%-%'

--2. Display all the students whose address contains single quote or double quote.

Select * from STUDENT
where address like '%''%''%' or address like '%"%"%'

--3. Display all the students whose website contains @.

Select * from STUDENT
where website like '%@%'

--4. Display all the names those are either four or five characters.

Select * from STUDENT
where firstname like '____' or firstname like '_____'
