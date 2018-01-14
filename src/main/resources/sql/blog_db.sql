-- MySQL Script generated by MySQL Workbench
-- Sun Jan 14 15:55:46 2018
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema blog_db
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `blog_db` ;

-- -----------------------------------------------------
-- Schema blog_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `blog_db` DEFAULT CHARACTER SET utf8 ;
USE `blog_db` ;

-- -----------------------------------------------------
-- Table `blog_db`.`role`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `blog_db`.`role` ;

CREATE TABLE IF NOT EXISTS `blog_db`.`role` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `role` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `blog_db`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `blog_db`.`user` ;

CREATE TABLE IF NOT EXISTS `blog_db`.`user` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `firstname` VARCHAR(45) NOT NULL,
  `lastname` VARCHAR(45) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `login` VARCHAR(45) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `role_id` BIGINT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `fk_user_role1_idx` (`role_id` ASC),
  UNIQUE INDEX `login_UNIQUE` (`login` ASC),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC),
  CONSTRAINT `fk_user_role1`
    FOREIGN KEY (`role_id`)
    REFERENCES `blog_db`.`role` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `blog_db`.`note`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `blog_db`.`note` ;

CREATE TABLE IF NOT EXISTS `blog_db`.`note` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `text` VARCHAR(255) NULL,
  `image` VARCHAR(255) NULL,
  `link` VARCHAR(255) NULL,
  `user_id` BIGINT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `fk_note_user1_idx` (`user_id` ASC),
  CONSTRAINT `fk_note_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `blog_db`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `blog_db`.`commentary`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `blog_db`.`commentary` ;

CREATE TABLE IF NOT EXISTS `blog_db`.`commentary` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `text` VARCHAR(140) NULL,
  `user_id` BIGINT UNSIGNED NOT NULL,
  `note_id` BIGINT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `fk_commentary_user1_idx` (`user_id` ASC),
  INDEX `fk_commentary_note1_idx` (`note_id` ASC),
  CONSTRAINT `fk_commentary_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `blog_db`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_commentary_note1`
    FOREIGN KEY (`note_id`)
    REFERENCES `blog_db`.`note` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `blog_db`.`like`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `blog_db`.`like` ;

CREATE TABLE IF NOT EXISTS `blog_db`.`like` (
  `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  `isLiked` BIT NULL,
  `user_id` BIGINT UNSIGNED NOT NULL,
  `note_id` BIGINT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  INDEX `fk_like_user1_idx` (`user_id` ASC),
  INDEX `fk_like_note1_idx` (`note_id` ASC),
  CONSTRAINT `fk_like_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `blog_db`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_like_note1`
    FOREIGN KEY (`note_id`)
    REFERENCES `blog_db`.`note` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `blog_db`.`subscription`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `blog_db`.`subscription` ;

CREATE TABLE IF NOT EXISTS `blog_db`.`subscription` (
  `following_id` BIGINT NOT NULL,
  `follower_id` BIGINT NOT NULL,
  PRIMARY KEY (`following_id`, `follower_id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `blog_db`.`role`
-- -----------------------------------------------------
START TRANSACTION;
USE `blog_db`;
INSERT INTO `blog_db`.`role` (`id`, `role`) VALUES (1, 'User');
INSERT INTO `blog_db`.`role` (`id`, `role`) VALUES (2, 'Moderator');
INSERT INTO `blog_db`.`role` (`id`, `role`) VALUES (3, 'Administrator');

COMMIT;

