-- MySQL dump 10.13  Distrib 8.4.0, for Win64 (x86_64)
--
-- Host: localhost    Database: assignment
-- ------------------------------------------------------
-- Server version	8.4.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `articles`
--

DROP TABLE IF EXISTS `articles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `articles` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_user` int DEFAULT NULL,
  `title` varchar(100) DEFAULT NULL,
  `content` text,
  PRIMARY KEY (`id`),
  KEY `id_user` (`id_user`),
  CONSTRAINT `articles_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `user` (`id`) ON DELETE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `articles`
--

LOCK TABLES `articles` WRITE;
/*!40000 ALTER TABLE `articles` DISABLE KEYS */;
INSERT INTO `articles` VALUES (1,1,'文章標題1','文章內容1'),(2,2,'文章標題2','文章內容2'),(3,3,'文章標題3','文章內容3'),(4,1,'文章標題4','文章內容4'),(5,2,'文章標題5','文章內容5'),(6,3,'文章標題6','文章內容6'),(7,1,'文章標題7','文章內容7'),(8,2,'文章標題8','文章內容8'),(9,3,'文章標題9','文章內容9'),(10,4,'文章標題10','文章內容10'),(11,5,'文章標題11','文章內容11'),(12,6,'文章標題12','文章內容12'),(13,5,'文章標題13','文章內容13'),(14,5,'文章標題14','文章內容14'),(15,1,'文章標題15','文章內容15'),(16,1,'文章標題16','文章內容16'),(17,1,'文章標題17','文章內容17'),(18,1,'文章標題18','文章內容18'),(19,1,'文章標題19','文章內容19'),(20,2,'文章標題20','文章內容20'),(21,2,'文章標題21','文章內容21'),(22,2,'文章標題22','文章內容22'),(23,2,'文章標題23','文章內容23'),(24,2,'文章標題24','文章內容24'),(25,2,'文章標題25','文章內容25'),(26,2,'文章標題26','文章內容26'),(27,2,'文章標題27','文章內容27'),(28,2,'文章標題28','文章內容28'),(29,2,'文章標題29','文章內容29'),(30,3,'文章標題30','文章內容30'),(31,3,'文章標題31','文章內容31'),(32,3,'文章標題32','文章內容32'),(33,3,'文章標題33','文章內容33'),(34,3,'文章標題34','文章內容34'),(35,3,'文章標題35','文章內容35');
/*!40000 ALTER TABLE `articles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(40) DEFAULT NULL,
  `password` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Joy@gmail.com','$2a$12$smePkZJkn6SAuF.hwNgqGOHyWiVsiu7RHJy/CoTFvvMXV15VETqeS'),(2,'kai410@gmail.com','$2a$12$72KYeKT9YE.7KHNE6jmZJutNVZSaXdHbg0lxkNn0LZubMJiK50ixO'),(3,'kai@gmail.com','$2a$12$acSwDblDZ0wdgv1OULkzsO4vrZhbHWLvitoHoUzS9jzMx9px0XiIS'),(4,'kai111@gmail.com','$2a$12$AzaKqrl4t//ZpoNAGClvP.NT0A3pcPva76170eThottbrLYBGkNN2'),(5,'kai222@gmail.com','$2a$12$8MI4k1NYu1h5l8oqj1KrWufFcCfgZS6IOqLZJjFsyiGBQUdh7IEgS'),(6,'kai333@gmail.com','$2a$12$hv.sG6O2INAaAMTjTUdai./fZK21nSoNWwq/CXeXfxSffeYMBeNIW'),(7,'kai444@gmail.com','$2a$12$ntBTUZxsVJoqByQzZLLo9.6MRmyz6hHwsA8Ru8N5/zDAaB0rplWa2'),(8,'kai555@gmail.com','$2a$12$3jNOVsQaKV7LxS2f6sp5ie5UCMlxtZX0Ap81TXd7uAkDn54B3YOzK'),(9,'kai666@gmail.com','$2a$12$IRd96.dm2vZzV7uuqOTTYO0XUyqZpSLQ7OfLSkfNX2Tj8LgD2t/qO'),(12,'kai333','$2a$12$pZU8VaMlqF6wCQZeyKSNl.04XG/Ic5OhRnwazcK/sL6p4Nku9ldP.'),(13,'kai567','$2a$12$TVDRPOLEsNXa7k8kmg6c5.Sz7dTgdD3fFhgm2Zn/0qNp2JjREdO0.'),(14,'kai123','$2a$12$8EX97UXzxw.d.clFlR4zf.yj0l1MdsrUZKgbwR1n8NW1RQmLoAWwy');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-11 13:44:54
