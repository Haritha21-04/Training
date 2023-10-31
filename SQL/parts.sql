select * from parts;
select * from partssupplied;
select * from suppliers;

use supply;
-- 1)Find the pnames of parts for which there is some supplier. Each name should appear only once in the result set. 
SELECT DISTINCT pname
FROM PartsSupplied ps
JOIN Parts p ON ps.pid = p.pid;

-- 2)Find the total number of parts (pids) that are red. 
SELECT COUNT(DISTINCT pid) AS red_parts_count
FROM Parts
WHERE color = 'Red';

-- 3)Find the pnames of parts supplied by Acme Widget Suppliers. 
SELECT DISTINCT p.pname
FROM PartsSupplied ps
JOIN Parts p ON ps.pid = p.pid
JOIN Suppliers s ON ps.sid = s.sid
WHERE s.sname = 'Acme Widget Suppliers';
/*[or]
 select pname from parts 
where pid=(select pid from partsupplied 	
where sid=(select sid from suppliers where sname="Acme Widget Suppliers))*/
-- 4)Find the pnames of parts that Acme Widget Suppliers does not supply. 
SELECT DISTINCT p.pname
FROM Parts p
WHERE NOT EXISTS (
    SELECT 1
    FROM PartsSupplied ps
    WHERE ps.pid = p.pid
        AND ps.sid = (SELECT sid FROM Suppliers WHERE sname = 'Acme Widget Suppliers')
);

 

-- 5)Find the pnames of parts supplied by Acme Widget Suppliers and no one else. 
SELECT DISTINCT p.pname
FROM Parts p
WHERE NOT EXISTS (
    SELECT 1
    FROM PartsSupplied ps
    WHERE ps.pid = p.pid
        AND ps.sid <> (SELECT sid FROM Suppliers WHERE sname = 'Acme Widget Suppliers')
) AND EXISTS (
    SELECT 1
    FROM PartsSupplied ps
    WHERE ps.pid = p.pid
        AND ps.sid = (SELECT sid FROM Suppliers WHERE sname = 'Acme Widget Suppliers')
);

 

-- 6)Find the sids of suppliers that supply a red part or a green part 
SELECT DISTINCT sid
FROM PartsSupplied ps
JOIN Parts p ON ps.pid = p.pid
WHERE p.color IN ('Red', 'Green');

 

-- 7)Find the sids of suppliers that supply at least a
-- red part and a green part (Hint: The expression color = 'red' AND color = 'green' is always false) 
SELECT DISTINCT sid
FROM PartsSupplied ps
JOIN Parts p ON ps.pid = p.pid
WHERE p.color = 'Red'
   AND EXISTS (
      SELECT 1
      FROM PartsSupplied ps2
      WHERE ps2.sid = ps.sid
         AND ps2.pid IN (SELECT pid FROM Parts WHERE color = 'Green')
   );
/* select sid from suppliers s
where 1<=(selectcount (*) from partssupplied join parts on ps.pid=p.pid and sid=s.sid and p.color='Red')
where 1<=(selectcount (*) from partssupplied join parts on ps.pid=p.pid and sid=s.sid and p.color='Green')*/

 

-- 8)Print the sid and average cost of parts supplied by that supplier, for each supplier. 
SELECT sid, AVG(cost) AS average_cost
FROM PartsSupplied
GROUP BY sid;

 

-- 9)For each supplier, print the sid, sname and maximum cost for the parts supplied by that supplier. 
SELECT
    S.sid,
    S.sname,
    MAX(PS.cost) AS max_cost
FROM
    Suppliers S
JOIN
    PartsSupplied PS ON S.sid = PS.sid
GROUP BY
    S.sid, S.sname;

 

-- 10)Find the sid, sname, address and total number of parts supplied, for suppliers that supply at least 2 parts. 
SELECT s.sid, sname, address, COUNT(ps.pid) AS total_parts_supplied
FROM Suppliers s
JOIN PartsSupplied ps ON s.sid = ps.sid
GROUP BY s.sid, sname, address
HAVING COUNT(ps.pid) >= 2;

 

-- 11)For each supplier, print the sid, sname and the number of red parts supplied by that supplier. 
SELECT s.sid, sname, COUNT(ps.pid) AS red_parts_count
FROM Suppliers s
JOIN PartsSupplied ps ON s.sid = ps.sid
JOIN Parts p ON ps.pid = p.pid
WHERE p.color = 'Red'
GROUP BY s.sid, sname;

 

-- 12)Find the snames of suppliers who supply every red part. 
SELECT s.sname
FROM Suppliers s
WHERE NOT EXISTS (
    SELECT p.pid
    FROM Parts p
    WHERE p.color = 'Red'
        AND NOT EXISTS (
            SELECT ps.pid
            FROM PartsSupplied ps
            WHERE ps.sid = s.sid
                AND ps.pid = p.pid
        )
);
/* select sname from suppliers where sid exists (select sid from partssupplied where ps.sid=s.sid and 
ps.pid=all (select pid from parts where color='Red')) */
 

-- 13)Find the sids of suppliers who charge more for some part than the 
-- average cost of that part (averaged over all the suppliers that supply that part). 
SELECT DISTINCT ps.sid
FROM PartsSupplied ps
WHERE EXISTS (
    SELECT 1
    FROM PartsSupplied ps2
    WHERE ps2.sid = ps.sid
        AND ps2.cost > (
            SELECT AVG(cost)
            FROM PartsSupplied
            WHERE pid = ps2.pid
        )
);

 

-- 14)Find the sids of suppliers that supply only red parts. 
SELECT DISTINCT ps.sid
FROM PartsSupplied ps
WHERE NOT EXISTS (
    SELECT 1
    FROM Parts p
    WHERE p.pid = ps.pid
        AND p.color <> 'Red'
);

 

-- 15)For every supplier that supplies a green part and a red part (at least), print the 
-- name and price of the most expensive part that it supplies. 
SELECT s.sid, s.sname, MAX(p.cost) AS max_cost
FROM Suppliers s
JOIN PartsSupplied p ON s.sid = p.sid
WHERE EXISTS (
    SELECT 1
    FROM Parts p2
    WHERE p2.pid = p.pid AND (p2.color = 'Green' OR p2.color = 'Red')
)
GROUP BY s.sid, s.sname;