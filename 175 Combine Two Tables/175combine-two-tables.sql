# Write your MySQL query statement below
select p.firstName,p.lastName,a.state,a.city from Person as p left join Address as a on p.personId=a.personId 