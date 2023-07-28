# Write your MySQL query statement below
Select p.product_name,S.year,S.price from Sales S,Product p
Where S.product_id = p.product_id