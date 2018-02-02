DROP DATABASE IF EXISTS agendabanking;

CREATE DATABASE agendabanking;

USE agendabanking;

CREATE TABLE User(
idUser		INT 			NOT NULL auto_increment,
name		VARCHAR(45)		NOT NULL,
password	VARCHAR(20)		NOT NULL,
email		VARCHAR(100)	NOT NULL,
CONSTRAINT pk_user PRIMARY KEY (idUser)
);

CREATE TABLE Account(
idAccount			INT 			NOT NULL auto_increment,
name				VARCHAR(45)		NOT NULL,
agency				VARCHAR(10)		NOT NULL,
account				VARCHAR(20)		NOT NULL,
type				VARCHAR(45)		NOT NULL,
personalAccount		BOOLEAN			NOT NULL,
CONSTRAINT pk_account PRIMARY KEY (idAccount)
);

CREATE TABLE Bank(
idBank			INT 			NOT NULL auto_increment,
name			VARCHAR(45)		NOT NULL,
CONSTRAINT pk_bank PRIMARY KEY (idBank)
);

CREATE TABLE UserAccount(
idUserAccount			INT 		NOT NULL auto_increment,
idUser					INT			NOT NULL,
idAccount				INT 		NOT NULL,
CONSTRAINT pk_userAccount PRIMARY KEY (idUserAccount),
CONSTRAINT fk_user FOREIGN KEY (idUser)
		REFERENCES User(idUser),
CONSTRAINT fk_account FOREIGN KEY (idAccount)
		REFERENCES Account(idAccount)
);

CREATE TABLE BankAccount(
idBankAccount			INT 		NOT NULL auto_increment,
idBank					INT			NOT NULL,
idAccount				INT 		NOT NULL,
CONSTRAINT pk_bankAccount PRIMARY KEY (idBankAccount),
CONSTRAINT fk_bank FOREIGN KEY (idBank)
		REFERENCES Bank(idBank),
CONSTRAINT fk_bankAccount_account FOREIGN KEY (idAccount)
		REFERENCES Account(idAccount)
);