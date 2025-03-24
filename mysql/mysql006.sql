use mbasic;
#[Q1]
create table join_userban(
no int not null primary key auto_increment,
name varchar(20) not null,
ban char(2)
);
desc join_userban;
#[Q2]
insert into join_userban values(1, 'first', 'A');
insert into join_userban values(2, 'second', 'B');
insert into join_userban values(3, 'third', 'A');
insert into join_userban values(4, 'fourth', 'C');
insert into join_userban values(5, 'fifth', 'B');
insert into join_userban values(6, 'sixth', 'C');
insert into join_userban values(7, 'fifth', 'B');
insert into join_userban values(8, 'sixth', 'C');
#[Q3]
update join_userban set ban='D' where no>7;
#[Q4]
delete from join_userban where no>=7;
#[Q5]
select count(*)`학생수`, ban`반` from join_userban group by ban;

select * from join_userban;


## 데이터베이스언어 ★
# DDL : create, alter, drop
# DML : insert, select #, delete, update
# DCL : grant, revoke

# e(entity:테이블들이)r(relation:관계) 속성: pk, fk
# join ★
-- 두개이상의 테이블들을 연결해서 데이터를 조회
-- 테이블간의 연결고리 (pk, fk)

# 종류 : inner join, outer join

create table join_userinfo(
no int not null default(0),
name varchar(100) not null,
age int
);
alter table join_userinfo modify no int not null default(0) auto_increment;

insert into join_userinfo values(1, 'first', 11);
insert into join_userinfo values(2, 'second', 22);
insert into join_userinfo values(3, 'third', 33);
insert into join_userinfo values(4, 'fourth', 44);
desc join_userinfo;
select * from join_userinfo order by no asc;

## 1.
select a.no, a.name, a.age, b.ban
from join_userinfo a, join_userban b
where a.no = b.no;

## 2. join on
select a.no, a.name, a.age, b.ban
from join_userinfo a join join_userban b on(a.no = b.no);

## 3. join using
select a.no, a.name, a.age, b.ban
from join_userinfo a join join_userban b using(no);

## 4. natural join  -  natural join 알아서 join연결할 부위 찾아서 연결해줌.
select no, name, age, ban
from join_userinfo natural join join_userban;

##
#1
select a.no, a.name, a.age, b.ban
from join_userinfo a , join_userban b
where a.no = b.no and age >= 20 and age <= 40
order by no;
#2
select a.no, a.name, a.age, b.ban
from join_userinfo a join join_userban b on(a.no = b.no)
where age between 20 and 40
order by no;
#3
select a.no, a.name, a.age, b.ban
from join_userinfo a join join_userban b using(no)
where age between 20 and 40
order by no;
#4
select no, name, age, ban
from join_userinfo natural join join_userban
where age between 20 and 40
order by no;


# outer join
## right join은 오른쪽값 보장
select a.no, a.name, b.ban, a.age
from join_userinfo a right join join_userban b on a.no = b.no;

# left join은 왼쪽값 보장
select a.no, a.name, b.ban, a.age
from join_userban b left join join_userinfo a on a.no = b.no;

# right join
select b.no, b.name, b.ban, a.age
from join_userban b left join join_userinfo a on a.no = b.no;
# left join


#1 
-- emp 14 / dept 4  14*4 = 56
-- join 연결부위!!
select * from emp, dept order by empno;
#2
select * 
from emp , dept 
where emp.deptno = dept.deptno 
order by empno;
#3
select * from emp e , dept d where e.deptno = d.deptno order by empno;
select * from emp e join dept d on e.deptno = d.deptno order by empno;
select * from emp e join dept d using(deptno) order by e.empno;
#4 error 1052 : 소속 적기
select empno, ename, deptno, dname, loc
from emp e , dept d
where e.deptno = d.deptno;
#5
select empno, ename, d.deptno, dname, loc
from emp e, dept d
where e.deptno = d.deptno; 
#6
select empno, ename, sal , d.deptno, dname, loc
from emp e , dept d where e.deptno = d.deptno and sal >= 3000;

select empno, ename, sal , d.deptno, dname, loc
from emp e join dept d on e.deptno = d.deptno 
where sal >= 3000;

select empno, ename, sal , e.deptno, dname, loc
from emp e join dept d using(deptno)
where sal >= 3000;

select empno, ename, sal , deptno, dname, loc
from emp e natural join dept d 
where sal >= 3000;
#7
select * from emp e , salgrade s
where e.sal between s.losal and s.hisal
order by s.grade asc, e.sal asc;

select * from emp e join salgrade s
where e.sal between s.losal and s.hisal
order by s.grade asc, e.sal asc;
#8
-- emp1 사원정보, emp2 매니저 정보, salgrade 급여정보
-- 사원정보의 mgr = 매니저정보 empno, 사원정보의 최대, 최소값
-- 정렬 매니저정보의 사원번호기준으로 오름차순
select e1.empno, e1.ename, e1.mgr, e2.empno `mgr_empno`, e2.ename `mar_ename` 
from emp e1 , emp e2, salgrade s
where e1.mgr = e2.empno and e1.sal between s.losal and s.hisal
order by e2.empno asc;
#9
select e1.empno, e1.ename, e1.mgr, e2.empno `mgr_empno`, e2.ename `mar_ename` 
from emp e1 left join emp e2 on( e1.mgr = e2.empno);
#10
select e1.empno, e1.ename, e1.mgr, e2.empno `mgr_empno`, e2.ename `mar_ename` 
from emp e1 right join emp e2 on( e1.mgr = e2.empno);
-- right join은 rigth 쪽의 테이블 값 보장

#11
select empno, ename, job, mgr, hiredate, sal, comm, deptno, dname, loc
from emp e natural join dept d
order by deptno, empno;
#12
select empno, ename, job, mgr, hiredate, sal, comm, e.deptno, dname, loc 
from emp e join dept d using(deptno)
where sal >= 3000
order by deptno;
#13
select * 
from emp e join dept d on(e.deptno = d.deptno)
where sal <= 3000; 
#14
select d.deptno, dname, empno, ename, sal
from emp e, dept d 
where e.deptno = d.deptno and sal > 2000;
#15
select deptno, dname, empno, ename, sal
from emp e natural join dept d
where sal > 2000;
#16
select d.deptno, d.dname, 
		avg(sal)`avg_sal`, 
        max(sal)`max_sal`, 
        min(sal)`min_sal`, 
        count(*)`cnt`
from emp e, dept d
where e.deptno = d.deptno
group by d.deptno, d.dname
order by d.deptno, d.dname;
#17
select d.deptno, dname, 
		avg(sal)`avg_sal`, 
        max(sal)`max_sal`, 
        min(sal)`min_sal`, 
        count(*)`cnt`
from emp e join dept d using(deptno)
group by d.deptno, d.dname
order by d.deptno, d.dname;
#18
select d.deptno, dname, empno, ename, job, sal
from dept d left join emp e using(deptno)
order by d.deptno, ename; 
#19
select d.deptno, dname, empno, ename, job, sal
from emp e right join dept d using(deptno)
order by d.deptno, ename; 
#20
select  d.deptno, dname, 
		e.empno, e.ename, e.mgr, e.sal, e.deptno, 
		s.losal, s.hisal, s.grade, 
		e2.empno`mgr_empno`, e2.ename`mgr_ename`
from  emp e right join dept d    using(deptno) 
			left join salgrade s on(e.sal between s.losal and s.hisal) 
            left join emp e2     on(e.mgr=e2.empno)
order by d.deptno , e.empno;