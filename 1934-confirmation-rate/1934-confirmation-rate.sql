SELECT s.user_id,
       COALESCE(ROUND(SUM(c.action = 'confirmed') / COUNT(c.action), 2), 0) AS confirmation_rate
FROM Signups s
LEFT JOIN Confirmations c
ON s.user_id = c.user_id
GROUP BY s.user_id
ORDER BY s.user_id DESC;
# we use COLAESCE(NULL,0) to fill the null values
# to do in desc or asc use ORDER BY