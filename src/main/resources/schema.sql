
create table student(
student_id int auto_increment not null primary key,
first_name varchar(200) not null,
last_name varchar(200) not null,
age int not null
);

create table teacher(
teacher_id int auto_increment not null primary key,
first_name varchar(200) not null,
last_name varchar(200) not null
);

create table course(
course_id int auto_increment primary key,
name_course varchar(200),
teacherId int,
FOREIGN KEY (teacherId) REFERENCES teacher(teacher_id)
);

create table student_and_course(
course_id int ,
student_id int,
primary key(course_id, student_id),
FOREIGN KEY (course_id) REFERENCES course(course_id),
FOREIGN KEY (student_id) REFERENCES student(student_id)
);


