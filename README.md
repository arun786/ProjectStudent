# Project Student using Spring Boot

## steps to create 

### Step 1 : Create database and tables using the below query

    create database projectdb;
    
    use projectdb;
    
    create table studenttab(
    id int primary key auto_increment,
    sname varchar(20),
    scourse varchar(30),
    sfee int);
