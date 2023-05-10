-- Dobbiamo inserire ognuno la sua tabella, ognuno avrà il suo database, ognuno inserirà le modifiche
CREATE TABLE First_Dishes(
NAME VARCHAR(255)not null,
PRICE DOUBLE not null,
ALLERGENS VARCHAR(255),
ITS_FROZEN BOOLEAN not NULL,
ITS_PRECOOCKED BOOLEAN not null
);
CREATE TABLE Second_Dishes(
NAME VARCHAR(255) not null,
PRICE DOUBLE NOT NULL,
ITS_FROZEN BOOLEAN NOT NULL,
SAUCE BOOLEAN NOT NULL,
ALLERGENS VARCHAR(255)
);
CREATE TABLE Appetizer(
NAME VARCHAR(255)not null,
PRICE DOUBLE not null,
ALLERGENS VARCHAR(255),
ITS_FROZEN BOOLEAN not NULL
);
CREATE TABLE Desserts(
NAME VARCHAR(255) NOT NULL,
PRICE DOUBLE NOT NULL,
ALLERGENS VARCHAR(255),
TYPE_DESSERTS VARCHAR(255)
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

INSERT INTO Second_Dishes (NAME,PRICE,ITS_FROZEN,SAUCE,ALLERGENS)
VALUES
("Hamburger vegetariano",5.99,false,true,"none"),
("Parmigiana di melanzane",9.99,false,false,"lactose"),
("Involtini di primavera",12.99,false,true,"gluten"),
("Tofu in salsa di soia",6.99,false,true,"none"),
("Millefoglie di verdure",9.99,false,false,"gluten");

insert into Appetizer (NAME, PRICE,ALLERGENS,ITS_FROZEN)
values
('Sformatino di verdure',4.99,'Eggs and Derivates',false),
('Pinzimonio',4.50,null,false),
('Verdure pastellate',3.50,'Gluten',true),
('Ratatouille',7.50,null,false),
('Cavolo Gratinato',3.99,'Lactos',false);

INSERT INTO Desserts (NAME,PRICE,ALLERGENS,TYPE_DESSERTS)
VALUES
("Tiramisù",7.99,"LACTOS","SPOON_DESSERT"),
("Torta di mele",6.99,"GLUTEN","CAKE"),
("Crostata di mirtilli",5.99,"GLUTEN","CAKE"),
("Semifreddo mandorla",2.99,"LACTOS","PARFAIT"),
("Gelato al Babà",3.99,"LACTOS","FROZEN");

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