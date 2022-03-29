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

create table SearchTrain(
	froom varchar (150),
	Too varchar (150),
	Departdate date,
	ArrivalDate date,
	AvailableTrain varchar(500),
	DepartTime time,
	ArrivalTime time,
	Quota varchar(100),
	Classs varchar(30)
);

create table SeatBookings(
	TrainName varchar(300),
	Classs varchar(30),
	Quota varchar(100),
	NoofSeatsAvailable int,
	waitinglist int,
	NumberofPassengers int,
	ticketprice int,
	tax int default 100
	totalcost int
);


drop table SearchTrain;
drop table NewuserLogin
DELETE FROM NewuserLogin WHERE GmailId = 'ajay@gmail.com'

INSERT INTO NewuserLogin (FullName, GmailId, password, confirmpassword, 
						  PhoneNo, Gender, Age)VALUES
('ajay','ajay@gmail.com','qwert','qwert',334556677,'Male',25),
('abay','abay@gmail.com','12345','12345',234567892,'Male',18),
('abhi','abhi@gmail.com','54321','54321',876543321,'Male',45),
('karthik','karthik@gmail.com','qazxsw','qazxsw',988712367,'Male',22),
('rajesh','rajesh@gmail.com','asdfg','asdfg',865423349,'Male',17),
('laxmi','laxmi@gmail.com','zxcvb','zxcvb',785465432,'Female',27),
('varsha','varsha@gmail.com','mnbvc','mnbvc',567834234,'Female',30);

INSERT INTO ExistingUser (GmailId, password)VALUES
('ajay@gmail.com','qwert'),
('abay@gmail.com','12345'),
('abhi@gmail.com','54321'),
('karthik@gmail.com','qazxsw'),
('rajesh@gmail.com','asdfg'),
('laxmi@gmail.com','zxcvb'),
('varsha@gmail.com','mnbvc');

INSERT INTO SearchTrain (froom, too, Departdate, Arrivaldate AvilableTrain, 
						  DepartTime, ArrivalTime,Quota, Classs)VALUES
('Karunagapalli(KPY)','Begumpet(BMT)','2022-04-14','2022-04-15','Rajdhani Expres(15219)', 
 '14:00:00','13:00:00','General','3A(3 tier)'),
 ('Karunagapalli(KPY)','Begumpet(BMT)','2022-04-14','2022-04-15','Rajdhani Expres(15219)', 
 '14:00:00','13:00:00','General','Sleeper'),
('Karunagapalli(KPY)','Begumpet(BMT)','2022-04-14','2022-04-15','Rajdhani Expres(15219)', 
 '14:00:00','13:00:00','Ladies','Sleeper'),
 ('Karunagapalli(KPY)','Begumpet(BMT)','2022-04-4', '2022-04-5','haveli Express(31223)', 
 '8:00:00','7:00:00','General','Sleeper'),
 ('Ernakulam(ERS)', 'Begumpet(BMT)','2022-04-1', '2022-04-2',  'haveli Express(31223)', 
 '8:00:00','7:00:00','General','2A(2 tier)'),
('Ernakulam(ERS)', 'Begumpet(BMT)','2022-04-1', '2022-04-2',  'haveli Express(31223)', 
 '8:00:00','7:00:00','General','3A(3 tier)'),
('Ernakulam(ERS)', 'Begumpet(BMT)','2022-04-1', '2022-04-2',  'haveli Express(31223)', 
 '8:00:00','7:00:00','Tatkal','Sleeper'),
('Begumpet(BMT)', 'Karunagapalli(KPY)','2022-04-3','2022-04-4','Dhannbad express(21367)', 
 '10:00:00','13:00:00','General','Sleeper'),
('Begumpet(BMT)', 'Secundrabad(SC)','2022-04-5', '2022-04-5','charminar express(23456)', 
 '10:00:00','13:00:00','General','Sleeper'),
 ('Begumpet(BMT)', 'Kacheguda(KCG)' , '2022-04-8', '2022-04-8','Taj express(23345)', 
 '12:00:00','19:00:00','General','Sleeper'),
 ('Begumpet(BMT)', 'Kacheguda(KCG)' , '2022-04-10', '2022-04-10',  'Taj express(23345)', 
 '12:00:00','19:00:00','General','Sleeper'),
 ('Kollam(QLN)', 'Secundrabad(SC)' , '2022-04-8', '2022-04-9',  'hawah express(13434)', 
 '10:00:00','13:00:00','General','Sleeper'),
 ('Kollam(QLN)', 'Kayankulam(KYJ)' , '2022-04-10', '2022-04-10',  'wah express(23456)', 
 '8:00:00','13:00:00','General','Sleeper'),
 ('Kollam(QLN)', 'Kayankulam(KYJ)' , '2022-04-10', '2022-04-10',  'wah express(23456)', 
 '8:00:00','13:00:00','General','3A(3 tier)'),
  ('Kollam(QLN)', 'Kayankulam(KYJ)' , '2022-04-10', '2022-04-10',  'wah express(23456)', 
 '8:00:00','13:00:00','Ladies','Sleeper'),
 'Kollam(QLN)', 'Kayankulam(KYJ)' , '2022-04-1', '2022-04-1',  'wah express(23456)', 
 '8:00:00','13:00:00','General','Sleeper');


 


 
 



