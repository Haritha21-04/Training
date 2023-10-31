select* from strike;
select* from fires;
select* from pictures;
select* from lightning_fires;
/*2*/
create table  LIGHTNING_FIRES (
    Strike_ID int,
    Fire_ID int,
    primary key (Strike_ID, Fire_ID),
   foreign key(Strike_ID) references STRIKE(ID),
    foreign key (Fire_ID) references FIRES(ID)
);

/*3*/
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

