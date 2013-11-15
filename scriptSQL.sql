SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `proyecto9` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `proyecto9` ;

-- -----------------------------------------------------
-- Table `proyecto9`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `proyecto9`.`User` (
  `idUser` INT NOT NULL,
  `username` VARCHAR(16) NOT NULL,
  `password` VARCHAR(32) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `rol` ENUM('BuscaTesoros','Colaborador','Admin','Deshabilitado') NOT NULL,
  UNIQUE INDEX `username_UNIQUE` (`username` ASC),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC),
  PRIMARY KEY (`idUser`));


-- -----------------------------------------------------
-- Table `proyecto9`.`Tesoro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `proyecto9`.`Tesoro` (
  `idTesoro` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `ciudad` VARCHAR(45) NOT NULL,
  `pais` VARCHAR(45) NOT NULL,
  `posicion` VARCHAR(45) NOT NULL,
  `codigoSecreto` VARCHAR(45) NOT NULL,
  `habilitado` TINYINT(1) NOT NULL,
  `user_idUser` INT NOT NULL,
  PRIMARY KEY (`idTesoro`),
  UNIQUE INDEX `codigoSecreto_UNIQUE` (`codigoSecreto` ASC),
  UNIQUE INDEX `nombre_UNIQUE` (`nombre` ASC),
  INDEX `fk_Tesoro_user1_idx` (`user_idUser` ASC),
  CONSTRAINT `fk_Tesoro_user1`
    FOREIGN KEY (`user_idUser`)
    REFERENCES `proyecto9`.`User` (`idUser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `proyecto9`.`Usuario_Tesoro_Map`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `proyecto9`.`Usuario_Tesoro_Map` (
 user_idUser int not null,
 Tesoro_idTesoro int not null,
 primary key (user_idUser,Tesoro_idTesoro),
CONSTRAINT `fk_Usuario_Tesoro_Map_user1`
    FOREIGN KEY (`user_idUser`)
    REFERENCES `proyecto9`.`User` (`idUser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Usuario_Tesoro_Map_Tesoro1`
    FOREIGN KEY (`Tesoro_idTesoro`)
    REFERENCES `proyecto9`.`Tesoro` (`idTesoro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `proyecto9`.`Log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `proyecto9`.`Log` (
  `idLog` INT NOT NULL,
  `comentario` VARCHAR(255) NULL,
  `tipo` ENUM('encontrado','noEncontrado','problemas') NOT NULL,
  `user_idUser` INT NOT NULL,
  `Tesoro_idTesoro` INT NOT NULL,
  PRIMARY KEY (`idLog`),
  INDEX `fk_Log_user1_idx` (`user_idUser` ASC),
  INDEX `fk_Log_Tesoro1_idx` (`Tesoro_idTesoro` ASC),
  CONSTRAINT `fk_Log_user1`
    FOREIGN KEY (`user_idUser`)
    REFERENCES `proyecto9`.`User` (`idUser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Log_Tesoro1`
    FOREIGN KEY (`Tesoro_idTesoro`)
    REFERENCES `proyecto9`.`Tesoro` (`idTesoro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

DELETE FROM `proyecto9`.`Log`;
DELETE FROM `proyecto9`.`Usuario_Tesoro_Map`;
DELETE FROM `proyecto9`.`Tesoro`;

DELETE FROM `proyecto9`.`User`;



INSERT INTO `proyecto9`.`User` (`idUser`, `username`, `password`, `email`, `rol`) 
VALUES ('1', 'admin', 'admin', 'admin@admin.com', 'Admin'),
('2', 'bt', 'bt', 'bt@bt.com', 'BuscaTesoros'),
('3', 'bt1', 'bt1', 'bt1@bt1.com', 'BuscaTesoros'),
('4', 'bt2', 'bt2', 'bt2@bt2.com', 'BuscaTesoros'),
('5', 'bt3', 'bt3', 'bt3@bt3.com', 'BuscaTesoros'),
('6', 'col','col', 'col@col.com', 'Colaborador'),
('7', 'col1','col1', 'col1@col1.com',  'Colaborador');


INSERT INTO `proyecto9`.`Tesoro` (`idTesoro`,  `nombre`,  `ciudad`,  `pais`,  `posicion`,  `codigoSecreto`,  `habilitado`,  `user_idUser`) 
VALUES ('1','Pirata','Malaga','España','13-39','pirata',true,'6'),
('2','Nazi','Granada','España','17-39','nazi',true,'6'),
('3','Magico','Jaen','España','34-39','magico',true,'6'),
('4','Cofre de Oro','Sevilla','España','47-39','cofredeoro',true,'7'),
('5','Rubi','Cadiz','España','53-39','rubi',true,'7');

INSERT INTO `proyecto9`.`Usuario_Tesoro_Map` (`user_idUser`, `Tesoro_idTesoro`)
VALUES ('2','1'),
('2','2'),
('2','3'),
('3','3'),
('3','4'),
('4','5'),
('4','1');

INSERT INTO `proyecto9`.`Log` (`idLog`,  `comentario` ,  `tipo` ,  `user_idUser`,  `Tesoro_idTesoro` )
VALUES ('1','Hola don pepito','noEncontrado','2','1'),
('2','Adios don pepito','noEncontrado','3','2'),
('3','Ha sido duro, pero...','encontrado','3','3'),
('4','Han destruido el tesoro :(','problemas','4','1'),
('5','Lo conseguí','encontrado','4','4'),
('6','Debajo de tierra no esta :(','noEncontrado','5','2');

