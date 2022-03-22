

create table NewuserLogin(
	FullName varchar(25) Not Null,
	GmailId varchar(100) primary key,
	password varchar(20),
	confirmPassword varchar(20),
	PhoneNo int,
	Gender char(7) Not null,
	check(GENDER in ('Male', 'Female')),
	Age Int,
	check(Age >= 15)
);

create table ExistingUser(
	GmailId varchar,
	password varchar(20),
	FOREIGN KEY(GmailId) REFERENCES NewuserLogin(GmailId)
);

drop table Existinguser
drop table NewuserLogin
DELETE FROM NewuserLogin WHERE GmailId = 'ajay@gmail.com'

INSERT INTO NewuserLogin (FullName, GmailId, password, confirmpassword, PhoneNo, Gender, Age)
VALUES
('ajay','ajay@gmail.com','qwert','qwert',334556677,'Male',25),
('abay','abay@gmail.com','12345','12345',234567892,'Male',18),
('abhi','abhi@gmail.com','54321','54321',876543321,'Male',45),
('karthik','karthik@gmail.com','qazxsw','qazxsw',988712367,'Male',22),
('rajesh','rajesh@gmail.com','asdfg','asdfg',865423349,'Male',17),
('laxmi','laxmi@gmail.com','zxcvb','zxcvb',785465432,'Female',27),
('varsha','varsha@gmail.com','mnbvc','mnbvc',567834234,'Female',30);

INSERT INTO ExistingUser (GmailId, password)
VALUES
('ajay@gmail.com','qwert'),
('abay@gmail.com','12345'),
('abhi@gmail.com','54321'),
('karthik@gmail.com','qazxsw'),
('rajesh@gmail.com','asdfg'),
('laxmi@gmail.com','zxcvb'),
('varsha@gmail.com','mnbvc')
