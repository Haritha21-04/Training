select * from teamdetails;
select * from players;
select * from playersdata;
select * from games;
select * from scores;

/*1 */
use teams;
SELECT AVG( height ) FROM PlayersData;

/*2. */
use teams;
SELECT AVG( weight ) FROM PlayersData;

/*3 */
use teams;
SELECT MAX(score) FROM scores;

/*4*/
use teams;
SELECT game_id, MAX(score) AS max_points
FROM Scores
GROUP BY game_id
ORDER BY max_points DESC
LIMIT 1;

/*5*/
use teams;
SELECT game_id, SUM(score) AS total_points
FROM Scores
GROUP BY game_id
ORDER BY total_points DESC
LIMIT 1;
/*6*/
use teams;
SELECT * FROM Players WHERE teamid IS NULL;


/* 7.Number of Teams: */
use teams;
SELECT COUNT(*) AS team_count FROM teamdetails;


/* 8*/
use teams;
SELECT COUNT(*) AS player_count FROM Players;

/*9*/
use teams;
SELECT COUNT(*) AS games_on_may_5_2002
FROM Games
WHERE gameDate = '2002-05-05';

/*10*/
use teams;
SELECT p_id, height
FROM PlayersData
ORDER BY height DESC
LIMIT 1;

/*11*/
use teams;
UPDATE Players
SET lastname = 'Knotgood'
WHERE lastname = 'Ron Hammer';

/*12*/

/*13*/


/*14*/
use teams;
SELECT teamid, COUNT(*) AS wins
FROM Scores
WHERE score > 0 GROUP BY teamid
ORDER BY wins asc
LIMIT 1;

/*15*/
use teams;
SELECT teamid, COUNT(*) AS lose
FROM Scores
WHERE score > 0 GROUP BY teamid
ORDER BY Lose desc
limit 1;

/*16*/
use teams;
SELECT teamid, AVG(score) AS avg_score
FROM Scores S
GROUP BY teamid
ORDER BY avg_score DESC
LIMIT 1;

/*19*/
use teams;
SELECT * FROM players WHERE lastName LIKE 's%';

/*20*/
use teams;
SELECT * FROM Games
WHERE DAY(gameDate) BETWEEN 5 AND 10;