use mbasic;
/*
1. 서브쿼리
- select 구문안에 select 구문
- 서브쿼리 결과가 하나이상이 반환시 in,any, all 사용

2. 형식
select 컬럼 from 테이블명 where 컬럼 in ( select 문 ); 
*/
create table sub_userinfo(
no int not null primary key auto_increment,
name varchar(20) not null,
age int not null,
sex char(2),
kor int,
eng int,
math int,
ban char(2),
sns char(2) default 'y'
);
desc sub_userinfo;

insert into sub_userinfo values(1, 'first', 11, null, 100, 100, 99, 'A', 'n');
insert into sub_userinfo values(2, 'second', 22, 'm', 89, 92, 78, 'B', 'y');
insert into sub_userinfo values(3, 'third', 33, 'm', 90, 92, 97, 'A', 'y');
insert into sub_userinfo values(4, 'fourth', 44, 'f', 40, 42, 67, 'C', 'n');
insert into sub_userinfo values(5, 'fifth', 55, 'f', 89, 86, 99, 'B', 'y');
insert into sub_userinfo values(6, 'sixth', 66, 'm', 10, 20, 44, 'C', 'n');

select * from sub_userinfo;

#1-1 평균나이 이상인 레코드를 추출하시오.
-- select * from sub_userinfo where age >= 평균나이;
#1-2 평균나이
-- select avg(age) from sub_userinfo;
#1-3 1+2
select * from sub_userinfo where age >= (select avg(age) from sub_userinfo);

#2-1 first와 같은반친구들의 국어, 영어, 수학점수를 추출하시오
-- select ban, name, kor, eng, math from sub_userinfo where ban = first 반;
#2-2 first 반
-- select ban from sub_userinfo where name='first'
#2-3 1+2
select ban, name, kor, eng, math 
from sub_userinfo 
where ban = (select ban from sub_userinfo where name='first');

#3-1 first와 같은반친구들의  국어평균점수, 영어평균점수, 수학평균점수를 추출하시오.
-- select ban, avg(kor), avg(eng), avg(math) from sub_userinfo group by ban;
-- select ban from sub_userinfo where name = 'first';
select ban, avg(kor)`kor`, avg(eng)`eng`, avg(math)`math` 
from sub_userinfo
where ban = (select ban from sub_userinfo where name='first')
group by ban;

#1
select * from emp;
select sal from emp where ename='JONES';
#2
select * from emp where sal>2975;
#3
select * from emp where sal > (select sal from emp where ename='JONES');
#4
select * from emp where hiredate < (select hiredate from emp where ename='SCOTT');
#5
select *from dept;
select empno, ename, job, sal, deptno, dname, loc 
from emp e natural join dept d 
where deptno = 20 and sal > (select avg(sal) from emp)
order by empno desc;
#6
select * from emp where deptno in(20,30);
#7
select max(sal) from emp group by deptno order by max(sal) desc;
#8
-- 8-1
-- select * from emp where sal in (각부서별 최고급여); 
-- select max(sal) from emp group by deptno;
select * from emp where sal in(select max(sal) from emp group by deptno); 

/*
1. 다중행 연산자
-  in, any(some), all

- in  : 서브쿼리의 결과가 하나라도 일치하면 true
- any : 서브쿼리의 결과가 하나 이상이면 true
- all : 서브쿼리의 결과가 모두 만족하면 true

2. any : 하나라도 일치하면 참 (선 한개)
컬럼명 < any(1,2,3)			 ←←←|1  ←←|2  ←|3  		- 최대값보다 작다
컬럼명 > any(1,2,3)				1|→  2|→→  3|→→→  	- 최소값보다 크다

3. all : 모두가 일치히면 참 (선 3개)
컬럼명 < all(1,2,3)			 ←←←|1  ←←|2  ←|3  		- 최소값보다 작다
컬럼명 > all(1,2,3)				1|→  2|→→  3|→→→  	- 최대값보다 크다
*/
	
create table atest  as       	  select 1 num from dual
						union all select 2     from dual
						union all select 3     from dual
						union all select 4     from dual
						union all select 5     from dual
						union all select 6     from dual;
select * from atest;

select num from atest where num < any(select num from atest where num in(3,4,5)) order by num;
-- 최대값 보다 작다 - 1,2,3,4

select num from atest where num > any(select num from atest where num in(3,4,5)) order by num;
-- 최소값 보다 크다 - 4,5,6

select num from atest where num < all(select num from atest where num in(3,4,5)) order by num;
-- 최소값 보다 작다 - 1,2

select num from atest where num > all(select num from atest where num in(3,4,5)) order by num;
-- 최대값 보다 크다 - 6

#9
select * from emp where sal = any(select max(sal) from emp group by deptno);
#10
-- any = some
select * from emp where sal = some(select max(sal) from emp group by deptno);
#11
select sal from emp where deptno = 30;
#12 부서번호가 30인 사원의 최대급여보다 적게 받는 사원의 데이터 조회
-- 최대값보다 작다
select * 
from emp 
where sal < any(select sal from emp where deptno=30) 
order by sal;
#13 부서번호가 30인 사원의 최소급여보다 많이 받는 사원의 데이터 조회
-- 최소값보다 크다
select * 
from emp 
where sal > any(select sal from emp where deptno=30) 
order by sal desc;

create table member(
no int not null primary key auto_increment,
name varchar(100) not null,
pass varchar(50) not null
);
desc member;
insert into member values(1, 'first', 11);
insert into member values(2, 'second', 22);
insert into member values(3, 'third', 33);

delete from member where no=7;
select * from member;






