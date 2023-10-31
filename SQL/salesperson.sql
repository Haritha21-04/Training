SELECT * FROM Stock;

 

SELECT DISTINCT s.*
FROM Stock s
JOIN OrderLine ol ON s.ICode = ol.ItemCode;

 

SELECT s.*
FROM Stock s
JOIN (
    SELECT DISTINCT ItemCode
    FROM OrderLine
) ol ON s.ICode = ol.ItemCode;

 

SELECT ONum AS 'Order Number'
FROM Ordr
ORDER BY ONum DESC;

 

SELECT DISTINCT SId
FROM Ordr;

 

SELECT SPId,
       SPName,
       Age,
       60 - Age AS YearsUntilRetirement
FROM SalesPerson;

 

SELECT AVG(Age) AS AverageAge
FROM SalesPerson
WHERE Age >= 30;

 

SELECT COUNT(DISTINCT ItemCode) AS NumberOfDistinctItems
FROM OrderLine
WHERE ONum = 'O2';

 

SELECT *
FROM Stock
WHERE UnitPrice < 0.60;

 

SELECT ICode
FROM Stock
WHERE UnitPrice > 1.00
    AND IDesc IN ('Beer mug', 'Beer glass', 'Beer mat');

 

SELECT ICode
FROM Stock
WHERE UnitPrice < 1.00 OR
    (IDesc NOT IN ('Beer glass', 'Beer mug', 'Beer mat') OR IDesc IS NULL);

 

SELECT ONum, SUM(Qty) AS TotalUnitsOrdered
FROM OrderLine
GROUP BY ONum;

 

SELECT ONum, COUNT(DISTINCT ItemCode) AS NumberOfItemsOrdered
FROM OrderLine
GROUP BY ONum;

 

SELECT ONum, SUM(CASE WHEN Qty > 80 THEN Qty ELSE 0 END) AS TotalUnitsExceeding80
FROM OrderLine
GROUP BY ONum;

 

SELECT ONum, SUM(Qty) AS TotalUnitsOrdered
FROM OrderLine
GROUP BY ONum
HAVING SUM(Qty) > 90;

 

SELECT ItemCode, SUM(Qty) AS TotalUnitsOrdered
FROM OrderLine
GROUP BY ItemCode;

