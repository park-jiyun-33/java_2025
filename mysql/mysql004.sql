use mbasic;
show tables;
select * from emp;
#[Q1] 
select * from emp  where deptno = 30 and ename like '%E%' and  sal not between 1000 and 2000;

#[Q2] 
select * from emp  where comm is null and mgr is not null and job in('MANAGER', 'CLERK') and ename not like '_L%'; 


## ■ 1. order by + limit
/* 
	select   필드1, 필드2 
    from	 테이블명
    where	 조건식
    order by 기준필드 [asc(1,2,3오름차순) | desc(3,2,1 내림차순)]
    limit	 몇개
*/
-- 1-1 테이블준비
desc select_userinfo;
delete from select_userinfo  where no = 7;
select * from select_userinfo;

-- 1-2 정렬
select * from select_userinfo;

select * from select_userinfo  order by age desc; -- 내림차순
select * from select_userinfo  order by age asc;  -- 오름차순

-- 나이 많은 3명
select * from select_userinfo order by age desc limit 3;
select * from select_userinfo order by age desc limit 2;

-- no가 높은순으로 4명
select * from select_userinfo order by no desc limit 4;

-- no가 두번쨰로 높은순으로 2명(limit 1,2)   limit 어디서부터, 몇개
select * from select_userinfo order by no desc limit 0,2; -- 6,5
select * from select_userinfo order by no desc limit 1,2; -- 5,4

-- 1-3 연습문제
delete from select_emp_ where empno = 7935;

#1
select * from select_emp_;
#2
select * from select_emp_  where job = 'SALESMAN';
#3
select ename , mgr, sal from select_emp_;
#4
select ename, mgr, sal from select_emp_ where job = 'SALESMAN';
#5
select * from select_emp_ order by sal desc;
#6
select * from select_emp_ order by job asc, sal desc;
#7 - 별명아니어도 나옴
select ename, sal, empno`select_empno` from select_emp_ where sal > 2000 order by empno desc;
#8
select distinct job from select_emp_;
#9
select empno`사원번호`, ename`이름`, job`담당 업무` from select_emp_;
#10
select * from select_emp_ order by sal asc;
#11
select * from select_emp_ order by sal desc;
#12
select * from select_emp_ order by deptno asc, sal desc;
#13
select empno `select_empLOYEE_NO`, ename `select_empLOYEE_NAME`, job `JOB`, mgr `MANAGER`, hiredate `HIREDATE`, sal `SALARY`, comm `CONNISSION`, deptno`DEPARTNENT_NO` 
from select_emp_ 
order by deptno desc, ename asc;


## ■ 2. 집계함수
/* 
	select   필드1, 필드2 
    from	 테이블명
    where	 조건식
    group by 그룹핑
    having   조건식
    order by 기준필드 [asc(1,2,3오름차순) | desc(3,2,1 내림차순)]
    limit	 몇개
    
    avg(컬럼명) 평균, max 최대값, min 최소값, sum 합계, count 갯수
*/
-- 2-1 테이블준비
create table group_userinfo2(
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

insert into  group_userinfo2 (name, age, sns, kor, eng, math, ban) values('first', 11,  'n', 100, 100, 99, 'A');
insert into  group_userinfo2 (name, age, sex, kor, eng, math, ban) values('second', 22,  'm', 89, 93, 78, 'B');
insert into  group_userinfo2 (name, age, sex, kor, eng, math, ban) values('third', 33,  'm', 90, 92, 97, 'A');
insert into  group_userinfo2 (name, age, sex, kor, eng, math, ban) values('fourth', 44,  'f', 40, 42, 67, 'C');
insert into  group_userinfo2 (name, age, sex, kor, eng, math, ban) values('fifth', 55,  'f', 89, 86, 99, 'B');
insert into  group_userinfo2 (name, age, sex, sns, kor, eng, math, ban) values('sixth', 66, 'm', 'n',10 , 20, 44, 'C');

set    sql_safe_updates=0;
update group_userinfo2 set eng = 92  where name = 'second';

desc group_userinfo2;
select * from group_userinfo2;

-- 2-2 기본
select * from group_userinfo2 group by ban;  -- 1
select @@sql_mode; -- 2
set  SESSION sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION'; -- 3

select * from group_userinfo2;
select * from group_userinfo2 group by ban;  -- 4

-- 나이 평균
select avg(age) from group_userinfo2;

-- 반별 몇명있는지
select ban, count(*) from group_userinfo2 group by ban;

-- 반별 국, 영, 수 총점 확인
select ban, sum(kor)`국어총합`, sum(eng)`영어총합`, sum(math)`수학총합`
from group_userinfo2
group by ban;

-- 반별 국영수의 평균 확인
select ban, avg(kor)`국어 평균`, avg(eng)`영어 평균`, avg(math)`수학 평균` 
from group_userinfo2 
group by ban;

-- 반별 나이의 총합 나이평균 확인
select ban, sum(age)`나이총합`, avg(age)`나이총합`, max(age)`최고나이`, min(age)`최저나이`
from group_userinfo2
group by  ban;

-- 반별 국영수의 평균 확인후 '국어'평균점수가 89 이상인 데이터만 고르기
select ban, avg(kor)`국어평균`
from group_userinfo2
group by ban
having avg(kor) >= 89;

-- 반별 나이의 총합과 나이 평균 확인후 
-- 그중에서 나이의 평균이 35세 이상인 데이터 추출후
-- 평균 나이의 내림차순으로 정렬하시오.
select ban, sum(age)`나이의 총합`, avg(age)`나이의 평균` 
from group_userinfo2
group by ban
having avg(age) >= 35
order by avg(age) desc;

-- 2-3 연습문제
desc emp;
update emp set comm=null where empno=7566;

insert into emp values(7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250, 500, 30);
select * from emp;
#1
select sum(sal)`급여합계` from emp; 
#2
select sum(comm)`추가수당` from emp;
#3
select sum(distinct sal), sum(all sal), sum(sal) from emp;
#4
select count(*)`데이터 갯수` from emp;
select count(empno)`데이터 갯수` from emp; -- 모든필드가 값 다 있는 필드 14 
select count(comm)`데이터 갯수` from emp;  -- null값이 있는 필드는 제외 4
#5
select sum(deptno>=30)`부서30 직원수` from emp;
#6
select count(distinct sal), count(all sal), count(sal) from emp;
#7
select count(comm)`추가수당을 받는 사원수` from emp;
#8
select count(comm)`추가수당을 받는 사원수` from emp where comm is not null;
#9
select max(sal) from emp where deptno = 10;
#10
select min(sal) from emp where deptno = 10 ;

#11
select max(hiredate)`부서20 최근 입사일` from emp where deptno = 20;
#12
select min(hiredate)`부서20 제일오래 된 입사일` from emp where deptno = 20;
#13
select avg(sal)`부서30 급여평균` from emp where deptno = 30;
#14
select avg(distinct sal)`부서30 중복제거 급여평균` from emp where deptno = 30;
#15
select deptno, avg(sal)`평균급여` from emp group by deptno order by  deptno asc;
#16
select deptno, job, avg(sal)`평균급여` 
from emp 
group by deptno, job 
order by deptno ,job;
#17
select deptno, job, avg(sal)`평균급여` 
from emp 
group by deptno, job 
having avg(sal)>=2000 
order by deptno,job;
#18
-- having avg(sal) >= 2000
#19
select deptno, job, avg(sal)`평균급여` 
from emp 
where sal <= 3000 
group by deptno, job
having  avg(sal)>=2000
order by deptno ,job;
#20
select deptno, job, count(*)`사원수`, max(sal)`최고급여`, sum(sal)`급여합`, avg(sal)
from emp
group by deptno, job
order by deptno, job;



##
desc milk_order;

-- Q1. milk_order 값 삽입
insert into milk_order (oname, onum, oip) values('white', 2, '127.0.0.1');
desc milk_order;
-- Q2. milk_order no가 1인 데이터 조회
select * from milk_order where ono = 1;

-- Q3.  milk_order 전체데이터조회
select * from milk_order;

-- Q4.  milk_order 해당번호의 이름과 갯수 수정
update milk_order set oname = 'choco', onum = 1 where ono=1;

-- Q5.  milk_order 해당번호의 데이터 삭제
delete from milk_order where ono = 1;
