SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `hb` ;
CREATE SCHEMA IF NOT EXISTS `hb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `hb` ;

-- -----------------------------------------------------
-- Table `hb`.`school`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `hb`.`school` ;

CREATE TABLE IF NOT EXISTS `hb`.`school` (
  `id` INT(11) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NULL,
  `zip` VARCHAR(6) NULL,
  `presidend` VARCHAR(20) NULL,
  `update_time` TIMESTAMP NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '学校';


-- -----------------------------------------------------
-- Table `hb`.`teacher`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `hb`.`teacher` ;

CREATE TABLE IF NOT EXISTS `hb`.`teacher` (
  `id` INT(11) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `sex` INT(11) NULL,
  `birthday` TIMESTAMP NULL,
  `subject` INT(11) NULL COMMENT '教授学科',
  `update_time` TIMESTAMP NULL,
  `school_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_teacher_school`
    FOREIGN KEY (`school_id`)
    REFERENCES `hb`.`school` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_teacher_school_idx` ON `hb`.`teacher` (`school_id` ASC);


-- -----------------------------------------------------
-- Table `hb`.`student`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `hb`.`student` ;

CREATE TABLE IF NOT EXISTS `hb`.`student` (
  `id` INT(11) NOT NULL,
  `name` VARCHAR(45) NULL,
  `sex` INT(11) NULL,
  `birthday` TIMESTAMP NULL,
  `meat_card_balance` FLOAT NULL COMMENT '在校购买',
  `phone` CHAR(11) NULL,
  `join_football_team` TINYINT(1) NULL,
  `photograph` BLOB NULL,
  `udate_time` TIMESTAMP NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '学生表';


-- -----------------------------------------------------
-- Table `hb`.`student_teacher`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `hb`.`student_teacher` ;

CREATE TABLE IF NOT EXISTS `hb`.`student_teacher` (
  `student_id` INT(11) NOT NULL,
  `teacher_id` INT(11) NOT NULL,
  PRIMARY KEY (`student_id`, `teacher_id`),
  CONSTRAINT `fk_student_has_teacher_student1`
    FOREIGN KEY (`student_id`)
    REFERENCES `hb`.`student` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_has_teacher_teacher1`
    FOREIGN KEY (`teacher_id`)
    REFERENCES `hb`.`teacher` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_student_has_teacher_teacher1_idx` ON `hb`.`student_teacher` (`teacher_id` ASC);

CREATE INDEX `fk_student_has_teacher_student1_idx` ON `hb`.`student_teacher` (`student_id` ASC);


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
