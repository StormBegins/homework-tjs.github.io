use master 
go
create database TJS
go
use TJS
go
create table iPhone
(
	id int primary key,
	name nvarchar(10) not null,
	[datetime] nvarchar(20) not null,
	color nvarchar(8) not null,
	price int not null,
	stock int not null,
	firm nvarchar(10) not null
)
insert into iPhone values
(0012,'��Ϊ��ҫ10','2018-8-8','�Ź���',6666.6,100,'��Ϊ��˾')
select * from iPhone
drop table iPhone