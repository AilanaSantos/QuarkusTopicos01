-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-1');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-2');
insert into atleta (nome,idade,peso,altura,modalidades) values('Ana Catarina', 23, 57.8, 1.68, 'Volei');
insert into atleta (nome,idade,peso,altura,modalidades) values('Jonas', 27, 79.8, 1.82, 'Futebol');
insert into atleta (nome,idade,peso,altura,modalidades) values('Lara', 25, 57.3, 1.65, 'Queimada');
insert into atleta (nome,idade,peso,altura,modalidades) values('Ricardo', 25, 82.8, 1.79, 'Hipismo');
insert into atleta (nome,idade,peso,altura,modalidades) values('Isabela', 21, 50.2, 1.60, 'Natacao');