-- Dobbiamo inserire ognuno la sua tabella, ognuno avrà il suo database, ognuno inserirà le modifiche
CREATE TABLE FIRST_DISHES(
NAME VARCHAR(255)not null,
PRICE DOUBLE not null,
ALLERGENS VARCHAR(255),
ITS_FROZEN BOOLEAN not NULL,
ITS_PRECOOCKED BOOLEAN not null
);

insert into FIRST_DISHES (NAME, PRICE,ALLERGENS,ITS_FROZEN,ITS_PRECOOCKED)
values
('Orecchiette Cime di Rapa',4,'Gluten',false,FALSE),
('Risotto di funghi',4.5,'Lactos',false,FALSE),
('Passata di Verdure',3,NULL,false,TRUE),
('Gnocchi alla romana',6.5,'Lactos',false,TRUE);
-- aggiuntive
-- Obbiettivo: con questo file io ho la parte database che ci servirà per iniziare a programmare
select * FROM INGREDIENT;