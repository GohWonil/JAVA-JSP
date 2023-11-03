--1번
SELECT * 
FROM employee 
WHERE EMP_Name LIKE '%하%' OR EMP_Name LIKE '%하%';
--2번
SELECT EMP_NAME, SALARY 
FROM employee
WHERE salary <
(
SELECT salary 
from employee 
WHERE emp_name = '차태연'
);
--3번
SELECT d.dept_title AS "부서명", to_char(AVG(salary), 'fm999,999,999.0') AS "평균급여"
FROM department d, employee e
WHERE d.dept_id = e.dept_code
GROUP BY d.dept_title;
--4번
SELECT emp_id as "사원번호", emp_name as "사원명", salary as "급여", rank() over(order by salary desc) as "순위"
FROM employee
WHERE ROWNUM < 6
order by salary desc;
--5번
SELECT e.EMP_name as"사원명", to_char(e.hire_date,'yyyy') as "입사년도", j.job_name as "직급명"
FROM employee e, job j
WHERE e.job_code = j.job_code 
and extract(year from e.hire_date) >= '2015';
--6번
SELECT n.national_name as"국가명", l.local_name as"지역명", d.dept_title as"부서명", e.emp_name as"사원명"
from national n, location l, department d, employee e
WHERE E.DEPT_CODE = D.DEPT_ID
AND D.LOCATION_ID = L.LOCAL_CODE
AND L.NATIONAL_CODE = N.NATIONAL_CODE
and n.national_name in ('한국', '일본') 
order by n.national_name desc;