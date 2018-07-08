DROP TABLE IF EXISTS department;
DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS job_title;

CREATE TABLE job_title (
        id serial,
        dept_id int NOT NULL,
        proj_id int NOT NULL,
        title varchar(35),
        
        constraint pk_job_title_id primary key (id)
);

CREATE TABLE department (
        id serial,
        dept_id int NOT NULL,
        dept_name varchar(35) NOT NULL,
        
        constraint pk_department_id primary key (id),
        constraint fk_department_job_title_id foreign key (id) references job_title (id),
        constraint fk_dept_job_title_id foreign key (dept_id) references job_title (id)
);

CREATE TABLE project (
        id serial,
        proj_id int NOT NULL,
        pro_name varchar(35) NOT NULL,
        pro_start_date varchar(100) NOT NULL,
        
        constraint pk_project_id primary key (id),
        constraint fk_project_job_title_id foreign key (id) references job_title (id),
        constraint fk_pro_job_title_id foreign key (proj_id) references job_title (id)
);

CREATE TABLE employee (
        id serial,
        emp_job_title_id int NOT NULL,
        emp_first_name varchar(35) NOT NULL,
        emp_last_name varchar(35) NOT NULL,
        emp_gender varchar(10) NOT NULL,
        emp_birth_date varchar(100) NOT NULL,
        emp_hire_date varchar(100) NOT NULL,
        
        constraint pk_employee_id primary key (id),
        constraint fk_employee_job_title_id foreign key (emp_job_title_id) references job_title (id)
);


                                                                -- 4 projects       0 0 0 0             1: funky beats 2: christmas 3: run for pres 4: end apartheid
                                                                -- 3 departments    0 0 0               1: music, 2: make believe, 3: politics
                                                                -- 8 employees      0 0 0 0 0 0 0 0

-- Job Titles                   Singer, President, Queen, Kris Kringle, Rapper, Camper Scarer
INSERT INTO job_title (id, dept_id, proj_id, title) VALUES (1, 1, 1, 'Singer');
INSERT INTO job_title (id, dept_id, proj_id, title) VALUES (2, 2, 2, 'Kris Kringle');
INSERT INTO job_title (id, dept_id, proj_id, title) VALUES (3, 1, 1, 'Rapper');
INSERT INTO job_title (id, dept_id, proj_id, title) VALUES (4, 3, 4, 'Queen');
INSERT INTO job_title (id, dept_id, proj_id, title) VALUES (5, 2, 3, 'Camper Scarer');
INSERT INTO job_title (id, dept_id, proj_id, title) VALUES (6, 3, 4, 'President');

-- Departments
INSERT INTO department (id, dept_id, dept_name) VALUES (1, 1, 'Music');
INSERT INTO department (id, dept_id, dept_name) VALUES (2, 2, 'Make Believe');
INSERT INTO department (id, dept_id, dept_name) VALUES (3, 3, 'Politics');

-- Projects
INSERT INTO project (id, proj_id, pro_name, pro_start_date) VALUES (1, 1, 'Funky Beats', '1975-30-05');
INSERT INTO project (id, proj_id, pro_name, pro_start_date) VALUES (2, 2, 'Delivery Presents', '1975-30-05');
INSERT INTO project (id, proj_id, pro_name, pro_start_date) VALUES (3, 3, 'Scare Campers', '1975-30-05');
INSERT INTO project (id, proj_id, pro_name, pro_start_date) VALUES (4, 4, 'Govern', '1975-30-05');

-- 1st Employee (Bob Dylan)
INSERT INTO employee (id, emp_job_title_id, emp_first_name, emp_last_name, emp_gender, emp_birth_date, emp_hire_date)
VALUES (1, 1, 'Bob', 'Dylan', 'male', '1941-24-05', '1959-15-06');

-- 2nd Employee (Elvis Presley)
INSERT INTO employee (id, emp_job_title_id, emp_first_name, emp_last_name, emp_gender, emp_birth_date, emp_hire_date)
VALUES (2, 1, 'Elvis', 'Presley', 'male', '1935-08-01', '1953-27-03');

-- 3rd Employee (Santa Claus)
INSERT INTO employee (id, emp_job_title_id, emp_first_name, emp_last_name, emp_gender, emp_birth_date, emp_hire_date)
VALUES (3, 2, 'Santa', 'Claus', 'male', '1572-19-03', '1605-12-25');

-- 4th Employee (Jimmy Carter)
INSERT INTO employee (id, emp_job_title_id, emp_first_name, emp_last_name, emp_gender, emp_birth_date, emp_hire_date)
VALUES (4, 6, 'Jimmy', 'Carter', 'male', '1924-10-01', '1963-01-14');

-- 5th Employee (Ice Cube)
INSERT INTO employee (id, emp_job_title_id, emp_first_name, emp_last_name, emp_gender, emp_birth_date, emp_hire_date)
VALUES (5, 3, 'Ice', 'Cube', 'male', '1969-06-05', '1989-10-04');

-- 6th Employee (Queen Elizabeth)
INSERT INTO employee (id, emp_job_title_id, emp_first_name, emp_last_name, emp_gender, emp_birth_date, emp_hire_date)
VALUES (6, 4, 'Queen', 'Elizabeth', 'female', '1926-04-21', '1952-02-06');

-- 7th Employee (Big Foot)
INSERT INTO employee (id, emp_job_title_id, emp_first_name, emp_last_name, emp_gender, emp_birth_date, emp_hire_date)
VALUES (7, 5, 'Big', 'Foot', 'male', '1776-07-04', '1865-05-31');

-- 8th employee (Nelson Mandela)
INSERT INTO employee (id, emp_job_title_id, emp_first_name, emp_last_name, emp_gender, emp_birth_date, emp_hire_date)
VALUES (8, 6, 'Ice', 'Cube', 'male', '1918-07-18', '1994-05-10');


