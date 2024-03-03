-- 코드를 입력하세요
select count(*) from USER_INFO where extract(year from joined)=2021 and age between 20 and 29;