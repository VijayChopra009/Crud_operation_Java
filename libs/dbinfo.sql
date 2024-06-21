create table emp_register(id number primary key ,name varchar(255),email varchar(255) unique ,address varchar(255),desig varchar(255),doj varchar(255),mobno long  ,salary float,gender varchar(255));

create table login_emp(id number primary key ,username  varchar(255) unique,password varchar(255) );
desc login_emp