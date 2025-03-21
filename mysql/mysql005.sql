# ■ 복습문제 (집계함수)
use mbasic;
select * from emp;
select @@sql_mode; -- 2
set  SESSION sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION'; -- 3

#Q1.
select deptno, job, avg(sal)`평균급여` 
from emp 
where sal <= 3000  -- 전체 필터링
group by deptno, job  -- 집계함수 빼고 모두
having avg(sal) >= 2000
order by deptno, job;

 #Q2.
 select deptno, job, count(*)`사원수`, max(sal)`최고급여`, sum(sal)`급여합`, avg(sal)`평균급여`
 from emp
 group by deptno, job
 order by deptno, job;
 
 
 ## ■ function
 #1. Number
 #2. String
 #3. Date
 #4. id / case
 
 
 ----------------------------------------------------------------
 #1. Number ( ceil : 올림, floor : 내림, round : 반올림, mod : 나머지 )
 ----------------------------------------------------------------
--            2                  1                 2                 1
 select ceil(1.1) `올림` , floor(1.9)`내림` , round(1.5)`반올림` , mod(10, 3)`나머지`;
 
 # EX1 - round : 소숫점 몇자리까지 ( , )
 select 123.4578, round(123.4578, 0)`round1`, round(123.4578, -1)`round2`, round(123.4578, 1)`round3`, round(123.4578, 2)`round4`;
 #EX2
 select 123.4578, ceil(123.4578)`CEIL`, floor(123.4578)`FLOOR`;
 
 
 ----------------------------------------------------------------
 #2. String
-----------------------------------------------------------------
 -- 2-1. basic
 -- 1) length(문자열) 갯수
 select length('abc');
 
 -- 2) upper 대문자 / lower 소문자
 select 'abc' , upper('abc'), lower('abc');
 
 -- 3) instr(문자열, 찾을문자열) 위치 , 못찾으면 0 
 select instr('abc', 'b')`b의 위치`, instr('abc', 'ab')`ab의 위치`, instr('abc', 'ac')`ac의 위치`;
 
 -- 4) left(문자열, 몇개), rigth, substr(문자열, 시작, 몇개) 문자열 일부분
 select left('abc', 1),left('abc', 2), right('abc', 1), right('abc', 2);  -- a, bc, c, bc
 select substr('abcde', 2, 2)`bc`, substr('abcde', 2, 3)`bcd`, substr('abcde', 1, 3)`abc`;
 
 -- 5) concat(문자열1, 문자열2) 문자열연결
 select concat('hello ', 'mysql!')`hello mysql`;
 
 -- 6) trim 좌우공백제거 - ltrim, rtrim
 select trim(' a b c ')`a b c`;
 
 select concat( '#', trim(' a b c '), '#' )  `'#a b c#'`
	  , concat( '#', ltrim(' a b c '), '#' ) `'#a b c #'`
      , concat( '#', rtrim(' a b c '), '#' ) `'# a b c#'`;
 
 -- 7) replace(문자열에서, 찾아서, 바꾸기)
 select replace("hello sally !" , 'sally', 'alpha')`'hello alpha`;
 
 -- 8) repeat(뭐를, 몇개반복)
 select repeat('*' , 5)`'*****'`;
 
 -- 9) lpad(문자열, 전체자리수, 특정문자), rpad 빈칸채우기
 select lpad('abc', 10, '#')
	  , rpad('abc', 10, '#');
 
 create table userinfo_fu(
	no int not null default(0),
    name varchar(20) not null,
    age int not null,
    email varchar(20) not null
 );
 
 desc userinfo_fu;
 
 insert into userinfo_fu values(1, 'aaa', 11, 'aaa@gmail.com');
 insert into userinfo_fu values(2, 'bbb', 22, 'bbb@gmail.com');
 insert into userinfo_fu values(3, 'ccc', 33, 'ccc@gmail.com');
 insert into userinfo_fu values(4, 'ddd', 44, 'ddd@gmail.com');
 insert into userinfo_fu values(5, 'abc', 55, 'abc@gmail.com');
 insert into userinfo_fu values(6, 'bca', 66, 'bca@gmail.com');
 
 select * from userinfo_fu;
 
 #[Q1]
 select name`이름`, length(name)`갯수` from userinfo_fu;
 #[Q2]
 select name, left(name, 1)`첫번째 글자`, right(name, 1)`마지막 글자` from userinfo_fu;
 #[Q3]
 select name, replace(name, 'aaa', 'aaa 1등') from userinfo_fu;
 #[Q4]
 select concat(name, '는 개발자입니다.')`직업` from userinfo_fu;
 #[Q5]
 select upper(name) from userinfo_fu;
 #[Q6]
 select lower(name) from userinfo_fu;
 #[Q7]
 select name, instr(name, 'b') from userinfo_fu where age >= 40;
 #[Q8]
 select name, instr(name, 'b') 
 from userinfo_fu 
 where age >= 40 
 order by age desc limit 2;
 #[Q9]
 select name, concat(left(name,1), '*', right(name,1))`test` from userinfo_fu;
 #[Q10]
 set    sql_safe_updates=0; 
 
 create table userinfo_fu2 select * from userinfo_fu;
 select * from userinfo_fu2;
 update userinfo_fu2 set name = 'aaaa' where no=1;
 update userinfo_fu2 set name = 'bbaab' where no=2;
 update userinfo_fu2 set name = 'ccaac' where no=3;
 update userinfo_fu2 set name = 'daadd' where no=4;
 update userinfo_fu2 set name = 'baaca' where no=6;
 
select name, concat(left(name, 1), repeat('*', length(name)-2) , right(name,1))`test` 
from userinfo_fu2;


 -----------------------------------------------------------------
 #3. Date
 -----------------------------------------------------------------
 -- 1) 시스템의 현재시각 조회
 select now();  -- '2025-03-21 11:59:31'
 select current_time();  -- '11:59:19'

 -- 2) 요일 (0 = Mon , 1 = Tue , 6 = Sun) 
 select weekday(now()); -- 4 금
 select weekday("2025-03-21");
 
 -- 3) 날짜형식 date_format( 날짜지정 , '%Y-%m-%d' )
 select date_format("2025-03-21" , '%Y-%m-%d');
 select date_format(now() , '%Y-%m-%d %H:%i:%s');  -- 시분초
 
 -- 4) 100일전 / 후  date_add
 select date_add( now() , interval -10 day);  -- '2025-03-11 12:05:19'
 select date_add( now() , interval  10 day);  -- '2025-03-31 12:06:08'
 select date_add( now() , interval -3 hour);  -- '2025-03-21 09:05:55'
 
 -- 5) datediff(날짜1, 날짜2) 날짜차이
 select datediff( '2025-03-22' , '2025-03-21' );
 select timestampdiff( hour, '2025-03-22' , '2025-03-21' ); -- 시간차이  -24
 
 ##
												-- 구조만 복사 where 1=2
create table date_userinfo2 select * from userinfo where 1=2;
desc date_userinfo2;

alter table date_userinfo2 add date datetime default now();

 insert into date_userinfo2 values(1, 'aaa', 11, '2022-12-30');	
 insert into date_userinfo2 values(2, 'bbb', 22, '2022-11-30');	
 insert into date_userinfo2 values(3, 'ccc', 33, '2022-10-30');	
 insert into date_userinfo2 values(4, 'ddd', 44, '2022-09-30');	
 
 select * from date_userinfo2;
 
 #[Q1]
 select name, date from date_userinfo2 where '2022-11-01' > date;
 #[Q2]
 select name, date, date_add(date, interval 30 day)`event` 
 from date_userinfo2
 where date >= '2022-12-1' and date <= '2022-12-31';
 
 select name, date, date_add(date, interval 30 day)`event` 
 from date_userinfo2
 where month(date) = 12;
 #[Q3]
select name, date_format(date, '%Y년%m월%d일')`가입날짜` from date_userinfo2;

 #1. 금일 날짜
 select now();
 
 
 -----------------------------------------------------------------
 #4. if / case
 -----------------------------------------------------------------
 -- if(조건, 참, 거짓)
 -- 다형식
 /* 	case
		when	조건1		then	상태1
		when	조건2		then	상태2
		else	모든조건에 해당하지 않을때, 생략가능
		end
 */
 create table control(no int);
 insert into control values(1), (2), (3);
 desc control;
 select * from control;
 
 -- 1-1
 select no, if(no=1, '1이다', '1아님')`상태` from control;
 -- 1-2
 select no, if(no>1, '크다', '작다')`상태` from control;
 
-- 1-3   case	when/then	end
 select no, case
				when no = 1 then '1이다'
				when no = 2 then '2이다'
				when no = 3 then '3이다'
                else '1, 2, 3이 아니다'
			end `state`
 from control;
 -- 1-4 2이다, 크다, 작다
 select no, 
 case 
	when no > 2 then '크다'
    when no = 2 then '2이다'
    when no < 2 then '작다'
 end`state`
 from control;
 
 
 
 create table if_userinfo(
	no int not null primary key auto_increment,
    name varchar(100) not null,
    age int default(0),
    sex char(1),
    sns char(1)
 );
 
 desc if_userinfo;
 
 insert into if_userinfo values(1, 'first', 11, null, 'n');
 insert into if_userinfo values(2, 'second', 122, 'm', 'y');
 insert into if_userinfo values(3, 'third', 33, 'm', 'n');
 insert into if_userinfo values(4, 'fourth', 44, 'f', 'n');
 insert into if_userinfo values(5, 'fifth', 55, 'f', 'y');
 insert into if_userinfo values(6, 'sixth', 66, 'm', 'n');
 select * from if_userinfo;
 update if_userinfo set sns = 'y' where no = 3;
 
 #[1]
 select no, name, age, sex, sns, if(sns='y', '수신유지', '수신거부')`수신여부상태` from if_userinfo;
 #[2]
 select no, name, age, sex, sns, if(age>19, '성인', '미성년자')`성인여부` from if_userinfo;
 #[3]
 select sum(if(sns='n', 1,0))`sns수신거부수`from if_userinfo;
 select count(if(sns='n', 1,null))`sns수신거부수`from if_userinfo;
 select count(*)`sns수신거부수` from if_userinfo where sns = 'n';
 
 #[4]
 select * from emp; 
 
 select ename, deptno, 
 case
 when deptno = 10 then 'ACCOUNTING'
 when deptno = 20 then 'RESEARCH'
 when deptno = 30 then 'SALES'
 end`부서이름`
 from emp;
 
 select ename, deptno, 
 case deptno
 when  10 then 'ACCOUNTING'
 when  20 then 'RESEARCH'
 when  30 then 'SALES'
 end`부서이름`
 from emp;
 #[5]
 select ename, job, 
 case job
 when 'CLERK'    then '판매원'
 when 'SALESMAN' then '영업사원'
 else  '사원'
 end `JOB2`
 from emp;