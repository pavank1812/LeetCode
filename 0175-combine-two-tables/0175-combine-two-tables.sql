# Write your MySQL query statement below
SELECT FirstName, LastName, City, State
From Person
LEFT JOIN Address
ON Person.PersonID= Address.PersonID