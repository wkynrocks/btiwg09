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
  `rol` ENUM('BuscaTesoros','Colaborador','Admin') NOT NULL,
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