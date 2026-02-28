/*
SQLyog Community v13.3.1 (64 bit)
MySQL - 10.4.32-MariaDB : Database - projecting_software_1
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`projecting_software_1` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `projecting_software_1`;

/*Table structure for table `autor` */

DROP TABLE IF EXISTS `autor`;

CREATE TABLE `autor` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `ime` varchar(50) DEFAULT NULL,
  `prezime` varchar(50) DEFAULT NULL,
  `godinaRodjenja` bigint(20) DEFAULT NULL,
  `biografija` text DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `autor` */

insert  into `autor`(`id`,`ime`,`prezime`,`godinaRodjenja`,`biografija`) values 
(1,'Eiichiro','Oda',1975,'Godine 1996. Oda je objavio dve piratske priče pod nazivom Romance Dawn, koje su bile prototip One Piece-a. Serijal je započeo 1997. i brzo postao globalni fenomen zahvaljujući složenom svetu, emotivnim likovima i temama poput slobode i pravde. One Piece je najprodavaniji strip svih vremena, premašivši i Batman-ove ukupne tiraže, a Oda drži Guinnessov rekord za najviše prodatih kopija jedne serije po autoru.'),
(2,'Tomohito','Oda',1991,'Oda je odrastao u prefekturi Aichi i još tokom srednje škole pokazivao izrazit talenat za crtanje. Inspiraciju za karijeru mangake dobio je nakon čitanja mange koju mu je preporučio brat. Njegov rani rad World’s Worst One naišao je na slabu recepciju, ali je iskustvo usmerilo njegov umetnički razvoj i stil.'),
(3,'Chugong',NULL,1984,'Pravi identitet autora nije otkriven');

/*Table structure for table `manga` */

DROP TABLE IF EXISTS `manga`;

CREATE TABLE `manga` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `naziv` varchar(50) DEFAULT NULL,
  `autorId` bigint(20) DEFAULT NULL,
  `godinaIzdanja` bigint(20) DEFAULT NULL,
  `ISBN` varchar(50) DEFAULT NULL,
  `zanr` varchar(50) DEFAULT NULL,
  `tom` bigint(20) DEFAULT NULL,
  `poslednjiTom` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `autorId` (`autorId`),
  CONSTRAINT `manga_ibfk_1` FOREIGN KEY (`autorId`) REFERENCES `autor` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `manga` */

insert  into `manga`(`id`,`naziv`,`autorId`,`godinaIzdanja`,`ISBN`,`zanr`,`tom`,`poslednjiTom`) values 
(1,'One Piece',1,1997,'97815693190917','SHONEN',1,107),
(2,'One Piece',1,1997,'9781569319018','SHONEN',2,107),
(3,'Komi ne ume da komunicira',2,2016,'9781974707126','SLICE_OF_LIFE',1,30),
(6,'Solo Leveling',3,2018,'9791134868094','ACTION',2,14);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`) values 
(1,'admin','admin1'),
(2,'admin2','admin2'),
(3,'admin3','Admin3'),
(4,'andri','andri');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
