USE teams;

CREATE TABLE TeamDetails (
    teamid INT PRIMARY KEY,
    SName VARCHAR(255)
    
);

CREATE TABLE Players (
    p_id INT PRIMARY KEY,
    lastName VARCHAR(255),
    firstName VARCHAR(255),
    teamid INT,
    Number INT 
);

CREATE TABLE PlayersData (
    p_id INT PRIMARY KEY,
    height INT,
    weight INT
);

use teams;
create table Games(
     gameid int ,
     gamedate int ,
     Home_Team_id int,
     Guest_Team_id int
     );
  use teams;   
 create table Scores(
      game_id int ,
      teamid int,
      Score int,
      Win_Lose VARCHAR(255)
);  

INSERT INTO TeamDetails (Teamid, SName)
VALUES
    (1, 'Sharp Shooters'),
    (2, 'Hammer Time'),
    (3, 'String Music'),
    (4, 'Hackers');
    
  INSERT INTO Players (p_id, firstName, lastName, TEAMID, Number)
VALUES
    (1, 'smith', 'john', 1, 12),
    (2, 'bobbit', 'billy', 1, 2),
    (3, 'hurta', 'wil', 2, 32),
    (4, 'ouchy', 'tim', 2, 22),
	(5, 'byrd', 'eric', 3, 6),
	(6, 'jordan', 'ryan', 4, 23),
	(7, 'hammer', 'wally', 4, 21),
	(8, 'hammer', 'ron', 4, 44),
	(11, 'knotgood', 'al', null, 0);

INSERT INTO Playersdata (p_id, weight, height)
VALUES
    (1, 71, 120),
    (2, 58, 195),
    (3, 72, 200),
    (4, 74, 170),
    (5, 71, 182),
    (6, 72, 289),
    (7, 79, 250),
    (8, 73, 193),
    (11, 85, 310);

INSERT INTO Games (gameid, gamedate, home_team_id, guest_team_id)
VALUES
    (1, 05-01-2002, 1, 2),
    (2, 05-02-2002, 3, 4),
    (3, 05-03-2002, 1, 3),
    (4, 05-05-2002, 2, 4),
    (5, 05-05-2002, 1, 2),
    (6, 05-09-2002, 3, 4),
    (7, 05-10-2002, 2, 3),
    (8, 05-11-2002, 1, 4),
    (9, 05-12-2002, 2, 3),
    (10, 05-15-2002, 1, 4);

INSERT INTO scores (game_ID, teamid, score, Win_Lose)
VALUES
    (1, 1, 66, 'lose'),
    (2, 3, 78, 'win'),
    (3, 1, 45, 'lose'),
    (4, 2, 56, 'Lose'),
    (5, 1, 100, 'Win'),
    (6, 3, 67, 'Lose'),
    (7, 2, 57, 'lose'),
    (8, 1, 98, 'win'),
    (9, 2, 56, 'lose'),
    (10, 1, 46, 'Lose'),
	(1, 2, 75, 'Win'),
    (2, 4, 46, 'Lose'),
    (3, 3, 87, 'Win'),
    (4, 4, 99, 'win'),
    (5, 2, 88, 'Win'),
    (6, 4, 77, 'win'),
    (7, 3, 87, 'Win'),
    (8, 4, 56, 'Lose'),
    (9, 3, 87, 'Win'),
    (10, 4, 78, 'win');
    

