# Write your MySQL query statement below

/*
select p.Email
from (select Email, count(Email) as count
     from Person
     group by Email) p
where p.count > 1*/


select p.Email
from(select Email, count(Email) as count
     from person
     group by Email) p
     where p.count > 1