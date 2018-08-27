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
(0012,'华为荣耀10','2018-8-8','炫光蓝',6666.6,100,'华为公司')
select * from iPhone
drop table iPhone