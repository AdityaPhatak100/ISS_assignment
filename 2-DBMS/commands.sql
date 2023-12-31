# DB queries
create database student_data;
use student_data;
drop database student_data;

# Table queries + constraints (PK, FK, Default, Check, Unique, Not Null, Auto_increment)
## create table
create table Students (
	studentid int primary key not null,
    fname varchar(50) not null,
    lname varchar(50) not null,
    dateofbirth date not null ,
    gender char(1),
    email varchar(100)
);

create table Courses (
	courseid int primary key not null,
    coursename varchar(50) not null,
    coursetutor varchar(50) not null,
    credits int default 3,
    check (credits>=3)
);

create table Enrollments (
	enrollmentid int primary key auto_increment,
    studentid int,
    courseid int,
    enrollment date,
    foreign key (studentid) references Students(studentid),
    foreign key (courseid) references Courses(courseid)
);

## alter table + Unique
alter table Students
rename column dateofbirth to dob;

alter table Courses
add constraint unique (coursename);

## create index
create index idx_fname
on Students (fname);

## drop index
drop index idx_fname
on Students;

## drop table
drop table Students;

## insert into query
INSERT INTO Students VALUES 
(1, 'Aayush', 'Kumar', '2002-03-25', 'M', 'aayush.kumar@temp.com'),
(2, 'Abhinav', 'Sharma', '2001-07-12', 'M', 'abhinav.sharma@temp.com'),
(3, 'Amita', 'Patel', '2000-11-08', 'F', 'amita.patel@temp.com'),
(4, 'Arjun', 'Singh', '1999-04-18', 'M', 'arjun.singh@temp.com'),
(5, 'Ashwini', 'Gupta', '1998-09-30', 'F', 'ashwini.gupta@temp.com');

INSERT INTO Courses VALUES 
(301, 'Database Management', 'Prof. Reddy', 3),
(302, 'Data Analysis', 'Dr. Banerjee', 4),
(303, 'Web Development', 'Prof. Deshmukh', 3);

INSERT INTO Enrollments VALUES 
(null, 1, 301, '2023-02-05'),
(null, 2, 302, '2023-02-10'),
(null, 3, 303, '2023-02-15'),
(null, 4, 302, '2023-02-20'),
(null, 5, 301, '2023-02-25');


## select query
select * from Students;
select * from Courses;
select * from Enrollments;

## in-built functions
select count(distinct credits) from Courses;

select * from Enrollments
where courseid = 302;

select * from Students
order by dob;

update Students
set fname = "Aayush", email = "aayush.singh@gmail.com"
where studentid = 4;

## and + like
select * from Courses
where coursename like "Data%" and credits = 3;

## or
select * from Enrollments
where courseid = 302 or enrollment >= "2023-02-20";

## select into equivalent for MySQL
create table BackupStudents as select * from Students;

## delete query
delete from Enrollments
where enrollmentid = 1;

insert into Enrollments
values (null, 1, 301, "2023-02-05");

## Injection
select * from Students
where fname = "Aayush" or 1=1;

## TOP does not work in MySQL therefore LIMIT is used
select * from Students
limit 3;

## Wildcard
select * from Courses
where coursetutor LIKE "Prof%";

## IN
select * from Students
where fname in ("Aayush", "Amita");

## Between
select * from Enrollments
where enrollment between "2023-02-14" and "2023-02-26";

## Aliases
select fname as FirstName, lname as LastName from Students;

## Null Values
select * from Courses 
where credits is null;

## Group by
select courseid, count(*) from Enrollments
group by courseid;

## Having function
select courseid, count(*) as total from Enrollments
group by courseid
having count(courseid) > 1;

# Joins
## Inner Join
select * from Enrollments
inner join Students on Students.studentid = Enrollments.studentid;

## Left Join
select * from Enrollments
left join Courses on Courses.courseid = Enrollments.courseid;

## Right Join
select * from Courses
right join Enrollments on Courses.courseid = Enrollments.courseid;

## There is no full join in MySQL, but can be simulated using UNION
SELECT * FROM Students
LEFT JOIN Enrollments ON Students.studentid = Enrollments.studentid
UNION
SELECT * FROM Students
RIGHT JOIN Enrollments ON Students.studentid = Enrollments.studentid;


## Stored Procedure
delimiter //
create procedure ThreeCreditCourses ()
begin
select * from Courses where Courses.credits = 3;
end //

## deleting the stored procedure
drop procedure ThreeCreditCourses;

## calling the stored procedure
call ThreeCreditCourses;

## callable statment covered in JDBC working