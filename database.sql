-- Dobbiamo inserire ognuno la sua tabella, ognuno avrà il suo database, ognuno inserirà le modifiche
CREATE TABLE First_Dishes(
NAME VARCHAR(255)not null,
PRICE DOUBLE not null,
ALLERGENS VARCHAR(255),
ITS_FROZEN BOOLEAN not NULL,
ITS_PRECOOCKED BOOLEAN not null
);
CREATE TABLE Appetizer(
NAME VARCHAR(255)not null,
PRICE DOUBLE not null,
ALLERGENS VARCHAR(255),
ITS_FROZEN BOOLEAN not NULL
);
CREATE TABLE Beverage(
NAME VARCHAR(255)not null,
PRICE DOUBLE not null,
ALLERGENS VARCHAR(255),
TYPE VARCHAR(255);
);

insert into FIRST_DISHES (NAME, PRICE,ALLERGENS,ITS_FROZEN,ITS_PRECOOCKED)
values
('Orecchiette Cime di Rapa',4,'Gluten',false,FALSE),
('Risotto di funghi',4.5,'Lactos',false,FALSE),
('Passata di Verdure',3,NULL,false,TRUE),
('Gnocchi alla romana',6.5,'Lactos',false,TRUE);

insert into Appetizer (NAME, PRICE,ALLERGENS,ITS_FROZEN)
values
('Sformatino di verdure',4.99,'Eggs and Derivates',false),
('Pinzimonio',4.50,null,false),
('Verdure pastellate',3.50,'Gluten',true),
('Ratatouille',7.50,null,false),
('Cavolo Gratinato',3.99,'Lactos',false);

insert into Beverage (NAME, PRICE, ALLERGENS, TYPE)
values
('Chianti',10,false,'RED_WINE'),
('Prosecco',1,false,'WHITE_WINE'),
('Heinekken',5,true,'BLONDE'),
('Red Erik',7,true,'RED'),
('Indian Pale Ale',7.5,true,'IPA');
-- aggiuntive
-- Obbiettivo: con questo file io ho la parte database che ci servirà per iniziare a programmare
select * FROM INGREDIENT;