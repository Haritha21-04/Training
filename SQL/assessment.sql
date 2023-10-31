use assessment;

CREATE TABLE STRIKE (
    ID INT PRIMARY KEY,
    Date DATE,
    Time TIME,
    Lat DECIMAL(5, 2),
    Lon DECIMAL(6, 2),
    Intensity INT
);
CREATE TABLE FIRES (
    ID INT PRIMARY KEY,
    Date DATE,
    Lat DECIMAL(5, 2),
    Lon DECIMAL(6, 2),
    Area DECIMAL(7, 2)
);
CREATE TABLE PICTURES (
    ID INT PRIMARY KEY,
    Strike_FK INT,
    Date DATE,
    Filename VARCHAR(255)
);
INSERT INTO STRIKE (ID, Date, Time, Lat, Lon, Intensity)
VALUES
    (1, '2006-05-05', '02:02:00', 41.34, -122.45, 6235),
    (2, '2006-05-05', '02:09:00', 40.47, -120.47, 16235),
    (3, '2006-05-05', '03:32:00', 42.14, -122.98, 7779),
    (4, '2006-05-05', '04:34:00', 38.32, -122.17, 4645),
    (5, '2006-05-05', '05:02:00', 39.04, -121.22, 8989);

INSERT INTO FIRES (ID, Date, Lat, Lon, Area)
VALUES
    (1, '2006-05-05', 32.34, -122.45, 123.90),
    (2, '2006-05-05', 37.19, -121.66, 627.09),
    (3, '2006-05-05', 40.47, -120.47, 45.00),
    (4, '2006-05-05', 42.14, -122.98, 1774.9),
    (5, '2006-05-05', 37.21, -120.47, 2034.8),
    (6, '2006-05-05', 42.04, -126.22, 49.62);

INSERT INTO PICTURES (ID, Strike_FK, Date, Filename)
VALUES
    (1, 1, '2006-05-05', '04938245.png'),
    (2, 1, '2006-05-05', '04983284.png'),
    (3, 2, '2006-05-05', '04773626.png'),
    (4, 2, '2006-05-05', '04789789.png'),
    (5, 4, '2006-05-05', '04323456.png'),
    (6, 5, '2006-05-05', '04325342.png');                                                                                                                                                                                                               

select* from STRIKE;
select* from FIRES;
select* from PICTURES;
select* from LIGHTNING_FIRES;           
                                                                                                                                                            
/*2*/
create table  LIGHTNING_FIRES (
    Strike_ID int,
    Fire_ID int,
    primary key (Strike_ID, Fire_ID),
   foreign key(Strike_ID) references STRIKE(ID),
    foreign key (Fire_ID) references FIRES(ID)
);

/*3*/
use assessment;
select avg(Intensity) as AverageIntensity from STRIKE;

/*4*/
select S.ID from STRIKE S
left join PICTURES P on S.ID = P.Strike_FK
where P.ID is null;

/*5*/
select ID, Date, Lat, Lon, Area from FIRES
order by Area desc
limit 3;

/*6*/
select SUM(Area)as TotalAreaBurned
from (select ID, Date, Lat, Lon, Area from FIRES order by Area DESC
    limit 3)as LargestThreeFires;

/*7*/
select S.ID  as Lightning_ID, F.ID as Fire_ID from STRIKE S
inner join FIRES F on S.Date = F.Date and S.Lat = F.Lat and S.Lon = F.Lon;

/*8*/
Insert into LIGHTNING_FIRES (Strike_ID, Fire_ID)
select S.ID  Lightning_ID, F.ID  Fire_ID from STRIKE S
inner join FIRES F on S.Date = F.Date and S.Lat = F.Lat and S.Lon = F.Lon;

/*9*/
select STRIKE.Lat as LATITUDE, STRIKE.Lon as LONGITUDE, 
Filename as PNG from STRIKE, 
PICTURES where Strike.ID=Strike_FK 
order by Filename desc;

/*10*/
use assessment;
Alter table strike add Fire_Fk varchar(255);