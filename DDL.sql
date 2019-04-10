create table location (
	location_id CHAR(16) FOR BIT DATA not null, 
	address varchar(4096) not null, 
	googlemap varchar(4096) not null, 
	latitude varchar(4096) not null, 
	longitude varchar(4096) not null, 
	pictures varchar(4096) not null, primary key (location_id))
create table review (
	review_id CHAR(16) FOR BIT DATA not null, 
	created timestamp not null, 
	photos varchar(4096) not null, 
	text varchar(4096) not null, 
	location_id CHAR(16) FOR BIT DATA, 
	reviewer_id CHAR(16) FOR BIT DATA, primary key (review_id))
create table reviewer (
	reviewer_id CHAR(16) FOR BIT DATA not null, 
	age varchar(4096) not null, 
	name varchar(4096) not null, 
	reviewstatus varchar(4096) not null, primary key (reviewer_id))
