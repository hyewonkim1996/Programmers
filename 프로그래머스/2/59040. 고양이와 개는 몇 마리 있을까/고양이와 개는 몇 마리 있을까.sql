-- 코드를 입력하세요
SELECT ANIMAL_TYPE, count(*) as count FROM ANIMAL_INS GROUP BY ANIMAL_TYPE order by count asc;