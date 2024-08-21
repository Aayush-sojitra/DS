-----A-----

--1. Combine information from student and result table using cross join or Cartesian product.
select * from Stu_info
cross join RESULT

--2. Perform inner join on Student and Result tables.
select * from Stu_info s
inner join RESULT r
on s.RNO=r.RNO

--3. Perform the left outer join on Student and Result tables.
select * from Stu_info s
left join RESULT r
on s.RNO=r.RNO

--4. Perform the right outer join on Student and Result tables.
select * from Stu_info s
right join RESULT r
on s.RNO=r.RNO

--5. Perform the full outer join on Student and Result tables.
select * from Stu_info s
full outer join RESULT r
on s.RNO=r.RNO

--6. Display Rno, Name, Branch and SPI of all students.
select s.RNO,s.NAME,s.BRANCH,r.SPI from Stu_info s
left join RESULT r
on s.RNO=r.RNO

--7. Display Rno, Name, Branch and SPI of CE branch’s student only.
select s.RNO,s.NAME,s.BRANCH,r.SPI from Stu_info s
left join RESULT r
on s.RNO=r.RNO
where s.BRANCH='ce'

--8. Display Rno, Name, Branch and SPI of other than EC branch’s student only.
select s.RNO,s.NAME,s.BRANCH,r.SPI from Stu_info s
left join RESULT r
on s.RNO=r.RNO
where s.BRANCH<>'ec'

--9. Display average result of each branch.
select avg(r.SPI),s.BRANCH from Stu_info s
left join RESULT r
on s.RNO=r.RNO
group by s.BRANCH

--10. Display average result of CE and ME branch.
select avg(r.SPI),s.BRANCH from Stu_info s
left join RESULT r
on s.RNO=r.RNO
where s.BRANCH='ce' or s.BRANCH='me'
group by s.BRANCH



-----B-----

--1. Display average result of each branch and sort them in ascending order by SPI.
select avg(r.SPI),s.BRANCH from Stu_info s
left join RESULT r
on s.RNO=r.RNO
group by s.BRANCH
order by avg(r.spi) 

--2. Display highest SPI from each branch and sort them in descending order.
select max(r.SPI),s.BRANCH from Stu_info s
left join RESULT r
on s.RNO=r.RNO
group by s.BRANCH
order by max(r.spi) desc 

-----C-----

--1. Retrieve the names of employee along with their manager’s name from the Employee table
select e1.name as emp_name, e2.name as Manager_name from Emp_Master e1
inner join Emp_Master e2
on e1.Emp_No = e2.ManagerNo

 