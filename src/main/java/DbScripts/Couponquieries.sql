   CREATE TABlE store(
    id int NOT NULL AUTO_INCREMENT,
    longtiude double,
    lat double,
    city VARCHAR(25) ,
    state VARCHAR(25),
    street VARCHAR(25),
    zip VARCHAR(25),
    PRIMARY KEY (id)    
   );
  
    insert into store values(1,20892,39393,"Seattle","WA","Greenwood","98133");
	create TABLE Coupon
	(
	id int not null AUTO_INCREMENT,
	category VARCHAR(25),
	couponcode VARCHAR(25),
	description VARCHAR(25),
	merchant VARCHAR(25),
	title    VARCHAR(25),
	sotrId int,
	expire_at date,
	published_at date,
	PRIMARY KEY  (id),
	FOREIGN KEY (sotrId)  REFERENCES store(id)
	);
   
   
   
   
   