# Write your MySQL query statement below
SELECT today.id
FROM Weather today JOIN Weather yesterday
ON DATEDIFF(today.recordDate,yesterday.recordDate)=1
WHERE today.temperature>yesterday.temperature
# to find difference we have DATEDIFF for difference in dates