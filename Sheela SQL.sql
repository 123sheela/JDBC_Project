create database Sheeladb;
use Sheeladb;
create table Login(username varchar(50),password varchar(20));
create table Product(productId int,productName varchar(50), minSellQuantity int,price int,quantity int);
select * from Login;
insert into Login values('root','root');