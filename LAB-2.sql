--1
SELECT *FROM Deposit

--2
SELECT *FROM Borrow

--3
SELECT *FROM Customers

--4
SELECT ACTNO,CNAME,AMOUNT FROM Deposit

--5
SELECT LOANNO,AMOUNT FROM Borrow

--6
SELECT *FROM Borrow
WHERE BNAME='ANDHERI'

--7
SELECT ACTNO,AMOUNT FROM Deposit
WHERE ACTNO=106

--8
SELECT CNAME,BNAME FROM Borrow
WHERE AMOUNT>5000

--9
SELECT CNAME FROM Deposit
WHERE ADATE>'1996-12-1'

--10
SELECT CNAME FROM Deposit
WHERE ACTNO<105
