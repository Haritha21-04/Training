/* 1.Average Height of All Players:*/
use teams;
SELECT AVG(height) AS average_height FROM Players;

/* 2.Average Weight of All Players:*/
use teams;
SELECT AVG(weight) AS average_weight FROM Players;

/*3.Team with the Most Points Scored in All Games:*/
use teams;
SELECT team_id, SUM(score) AS total_points
FROM Scores
GROUP BY team_id
ORDER BY total_points DESC
LIMIT 1;

/*4.  Most Points Scored in a Single Game by One Team:*/
use teams;
SELECT game_id, MAX(score) AS max_points
FROM Scores
GROUP BY game_id
ORDER BY max_points DESC
LIMIT 1;


/*5.Most Points Scored Collectively by Both Teams in a Single Game:*/
use teams;
SELECT game_id, SUM(score) AS total_points
FROM Scores
GROUP BY game_id
ORDER BY total_points DESC
LIMIT 1;


/*6.Players Not Assigned to a Team:*/
use teams;
SELECT * FROM Players WHERE team_id IS NULL;


/* 7.Number of Teams: */
use teams;
SELECT COUNT(*) AS team_count FROM Teams;


/* 8.Number of Players:*/
use teams;
SELECT COUNT(*) AS player_count FROM Players;


/*9.Number of Games Played on May 5, 2002:*/
use teams;
SELECT COUNT(*) AS games_on_may_5_2002
FROM Games
WHERE game_date = '2002-05-05';


/* 10.Tallest Player:*/
use teams;
SELECT player_name, height
FROM Players
ORDER BY height DESC
LIMIT 1;

/*11.Remove Ron Hammer and Replace with Knotgood (assuming the Players table has a unique player_id):*/
use teams;
UPDATE Players
SET player_name = 'Knotgood'
WHERE player_name = 'Ron Hammer';


/*12.AI Knotgood's New Teammate:*/
use teams;
SELECT player_name
FROM Players
WHERE team_id = (SELECT team_id FROM Players WHERE player_name = 'AI Knotgood');


/*13.List of All Games with Dates, Home, and Guest Teams:*/
use teams;
SELECT G.game_date, T1.team_name AS home_team, T2.team_name AS guest_team
FROM Games G
JOIN Teams T1 ON G.home_team_id = T1.team_id
JOIN Teams T2 ON G.guest_team_id = T2.team_id;


/*14.Team with the Most Wins:*/
use teams;
SELECT team_id, COUNT(*) AS wins
FROM Scores
WHERE score > 0
GROUP BY team_id
ORDER BY wins DESC
LIMIT 1;


/*15.Team with the Most Losses:*/
use teams;
SELECT team_id, COUNT(*) AS losses
FROM Scores
WHERE score < 0
GROUP BY team_id
ORDER BY losses DESC
LIMIT 1;


/*16.Team with the Highest Average Score per Game:*/
use teams;
SELECT S.team_id, AVG(S.score) AS avg_score
FROM Scores S
GROUP BY S.team_id
ORDER BY avg_score DESC
LIMIT 1;


/*17.Report Showing Each Team's Record (Wins and Losses):*/
use teams;
SELECT T.team_name, 
       COUNT(CASE WHEN S.score > 0 THEN 1 ELSE NULL END) AS wins,
       COUNT(CASE WHEN S.score < 0 THEN 1 ELSE NULL END) AS losses
FROM Teams T
LEFT JOIN Scores S ON T.team_id = S.team_id
GROUP BY T.team_name
ORDER BY wins DESC, losses ASC;


/*18.Final Score of Each Game:*/
use teams;
SELECT G.game_id, T1.team_name AS home_team, T2.team_name AS guest_team, S.score
FROM Games G
JOIN Teams T1 ON G.home_team_id = T1.team_id
JOIN Teams T2 ON G.guest_team_id = T2.team_id
JOIN Scores S ON G.game_id = S.game_id;


/*19.Players Whose Last Names Begin with 'S':*/
use teams;
SELECT * FROM Players WHERE SUBSTRING(last_name, 1, 1) = 'S';


/*20.Games with Dates from the 5th to the 10th:*/
use teams;
SELECT * FROM Games
WHERE DAY(game_date) BETWEEN 5 AND 10;



