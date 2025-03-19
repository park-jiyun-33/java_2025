use mbasic;
show tables;
desc milk;
alter table milk drop mnum;
alter table milk drop mtotal;
insert into milk values(1, 'white', 1000);
insert into milk values(2, 'choco', 1200);
insert into milk values(3, 'banana', 1800);

-- 여러줄 실행ctrl + shift + enter

#[Q1]
insert into milk values(4, 'melon', 5000);
#[Q2]
update milk set mprice=1500  where mno=4;
#[Q3]
delete from milk where mno=4 and mname='melon';
#[Q4]
select * from milk;


## part1
# 테이블 복사
use mbasic;
create table userinfo_ex  select * from userinfo;
desc userinfo_ex;
select * from userinfo_ex;

#[Q1]
insert into userinfo_ex values(5, 'fifth', 55);
insert into userinfo_ex (no, name, age) values(5, 'fifth', 55);
#[Q2]
set sql_safe_updates=0;
update userinfo_ex set age=10;
#[Q3]
update userinfo_ex set name='third', age=33  where no=3 and age=10;
#[Q4]
delete from userinfo_ex where no=3 and age=10;
#[Q5]
delete from userinfo_ex;
select * from userinfo_ex;


## part2
-- 구조 + 데이터값 복사
create table select_userinfo select * from userinfo;

-- 구조 수정
alter table select_userinfo modify no int not null primary key auto_increment;
alter table select_userinfo modify name varchar(100); 
alter table select_userinfo modify age int; 
desc select_userinfo;

-- 데이터값 추가
insert into select_userinfo values(5, 'first', 55);
insert into select_userinfo values(6, 'third', 66);

#2-2 검색
-- 1. 전체검색
select * from select_userinfo;
-- 2. 부분검색
select name, age from select_userinfo;
-- 3. 중복 제거
select distinct name from select_userinfo;
-- 4. 별명짓기
select name as `이름`, age as `나이` from select_userinfo;
select name    `이름`, age    `나이` from select_userinfo;

-- 5. where 조건  ( = 같다  /  != , <> 다르다 )
select * from select_userinfo  where name = 'second';
select * from select_userinfo  where name != 'second';
select * from select_userinfo  where name <> 'second';

select * from select_userinfo  where age < 33;
select * from select_userinfo  where age <= 33;
select * from select_userinfo  where age > 33;
select * from select_userinfo  where age >= 33;

-- 6. 모든조건 : and , between and  / 조건중에 : or , in
select * from select_userinfo  where age>=22 and age <=33;
select * from select_userinfo  where age between 22 and 33;

select * from select_userinfo  where age = 22  or  age = 33;
select * from select_userinfo  where age in (22, 33);

-- 7. null 검색 ( is null , is not null , not in , not between )
desc select_userinfo;
alter table select_userinfo modify name varchar(100) not null;

select * from select_userinfo;
insert into select_userinfo (name) values('seven');

## null 값이 비워있다라는 상태
select * from select_userinfo  where age =null; -- (x)
select * from select_userinfo  where age!=null; -- (x) 

select * from select_userinfo  where age is     null;
select * from select_userinfo  where age is not null;

select * from select_userinfo  where age not between 22 and 33;
select * from select_userinfo  where age not in (22, 33);

-- 8. like 문자열검색 ( like  'a%' , '%a' , '%a%', '_a%' )
select * from select_userinfo  where name = 'first';
select * from select_userinfo  where name like 'f%';  -- f로 시작
select * from select_userinfo  where name like '%t';  -- t로 끝남
select * from select_userinfo  where name like '%i%'; -- i포함
select * from select_userinfo  where name like '_e%'; -- 두번째 글자가 e


##
create table select_emp select * from emp;
create table select_emp_ select * from emp;
alter table select_emp_ modify empno int not null primary key auto_increment;
desc select_emp;
insert into select_emp_ values(7521 , 'WARD' , 'SALESMAN', 7698, '1981-02-22', 1250, 500, 30, null);

# [1]
select * from select_emp_;
# [2]
select * from select_emp_  where deptno = 30;
# [3]
select * from select_emp_  where deptno = 30 and job = 'SALESMAN';
# [4]
select * from select_emp_  where deptno = 30 or job = 'CLERK';
# [5] 
select * from select_emp_  where (sal*12) = 36000;
# [6]
select * from select_emp_  where sal >= 3000;
# [7]
select * from select_emp_  where ename >= 'F';
# [8]
select * from select_emp_  where ename <= 'FORD';
# [9]
select * from select_emp_  where  sal != 3000;
# [10]
select * from select_emp_  where  sal <> 3000;

# [11]
select * from select_emp_  where not (sal = 3000);
# [12]
select * from select_emp_  where job = 'MANAGER' or job = 'SALESMAN' or job = 'CLERK';
# [13]
select * from select_emp_  where job in ('MANAGER', 'SALESMAN', 'CLERK');
# [14]
select * from select_emp_  where job != 'MANAGER' and job <> 'SALESMAN' and job <> 'CLERK';
# [15]
select * from select_emp_  where  job not in ('MANAGER', 'SALESMAN', 'CLERK');
# [16]
select * from select_emp_  where sal >= 2000 and sal <= 3000;
# [17]
select * from select_emp_  where sal between 2000 and 3000;
# [18]
select * from select_emp_  where sal not between 2000 and 3000;
# [19]
select * from select_emp_  where not (sal >= 2000 and sal <= 3000);
# [20]
select * from select_emp_  where empno = 7499 and deptno = 30;

# [21]
select * from select_emp_  where deptno = 20 or job = 'SALESMAN';
# [22]
select * from select_emp_  where sal >= 2500 and job = 'ANALYST';
# [23]
select * from select_emp_  where deptno in (10, 20);
# [24]
select * from select_emp_  where deptno not in (10, 20);
# [25]
select * from select_emp_  where ename like 's%';
# [26]
select * from select_emp_  where ename like '_l%';
# [27]
select * from select_emp_  where ename like '%am%';
# [28]
select * from select_emp_  where ename not like '%am%';
# [29] 숫자 + null 계산 안됨
select ename, sal, sal*12+comm `ANNSAL`, comm  from select_emp_  where ename like '%am%'; 
# [30]
select * from select_emp_  where comm = null;

# [31]
select * from select_emp_  where comm is null;
# [32]
select * from select_emp_  where mgr is not null; 
# [33]
select * from select_emp_  where sal > null;
# [34]                               null           true       > true
select * from select_emp_  where sal > null or comm is null;
# [35]
select * from select_emp_  where ename like '%s';
# [36]
select empno, ename, job, sal, deptno from select_emp_  where deptno = 30 and job = 'SALESMAN';
# [37]
select empno, ename, job, sal, deptno from select_emp_  where deptno in(20, 30) and sal > 2000;
# [38]
select empno, ename, job, sal, deptno from select_emp_  where sal < 2000 or sal > 3000;
# [39]
select empno, ename, job, sal, deptno from select_emp_  where deptno = 30 and ename like '%e%' and sal not between 1000 and 2000;
#[40]
select * from select_emp_  where comm is null and mgr is not null and job in ('MANAGER', 'CLERK') and ename not like '_l%';


