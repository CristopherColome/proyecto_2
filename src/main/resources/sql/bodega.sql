-- MySQL dump 10.13  Distrib 8.0.25, for Linux (x86_64)
--
-- Host: localhost    Database: bodega
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `tb_cliente`
--

DROP TABLE IF EXISTS `tb_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_cliente` (
  `id_persona` bigint NOT NULL,
  PRIMARY KEY (`id_persona`),
  KEY `fk_tb_cliente_1_idx` (`id_persona`),
  CONSTRAINT `fk_tb_cliente_1` FOREIGN KEY (`id_persona`) REFERENCES `tb_persona` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_cliente`
--

LOCK TABLES `tb_cliente` WRITE;
/*!40000 ALTER TABLE `tb_cliente` DISABLE KEYS */;
INSERT INTO `tb_cliente` VALUES (2),(3),(4),(5),(6),(7),(10);
/*!40000 ALTER TABLE `tb_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_persona`
--

DROP TABLE IF EXISTS `tb_persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_persona` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `tipo` char(1) NOT NULL,
  `tipo_persona` varchar(45) DEFAULT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellidos` varchar(200) NOT NULL,
  `tipo_documento` varchar(45) DEFAULT NULL,
  `numero_documento` varchar(15) NOT NULL,
  `direccion` varchar(200) DEFAULT NULL,
  `telefono` varchar(11) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `creador` varchar(100) NOT NULL,
  `modificador` varchar(100) DEFAULT NULL,
  `fecha_creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_persona`
--

LOCK TABLES `tb_persona` WRITE;
/*!40000 ALTER TABLE `tb_persona` DISABLE KEYS */;
INSERT INTO `tb_persona` VALUES (1,'U','NATURAL','administrador','administrador','DNI','0000000','LOCAL','000000000','administrador@bodega.com','admin',NULL,'2022-05-03 15:42:12','2022-05-05 15:12:18'),(2,'C','NATURAL','cliente','uno','DNI','11111111',NULL,NULL,NULL,'admin',NULL,'2022-05-03 15:50:42','2022-05-05 15:12:18'),(3,'C','NATURAL','a','a1','DNI','22222222',NULL,NULL,NULL,'admin',NULL,'2022-05-03 18:54:51','2022-05-05 15:12:18'),(4,'C','NATURAL','b','b_0','DNI','333333333',NULL,NULL,NULL,'admin','admin','2022-05-03 18:56:07','2022-05-05 15:12:18'),(5,'C','NATURAL','b','b2','DNI','333333333',NULL,NULL,NULL,'admin','admin','2022-05-03 21:35:45','2022-05-05 15:12:18'),(6,'C','NATURAL','c','c1','DNI','444444444',NULL,NULL,NULL,'admin',NULL,'2022-05-04 14:54:26','2022-05-05 15:12:18'),(7,'C','NATURAL','d','d_1','DNI','55555555',NULL,NULL,NULL,'admin','admin','2022-05-04 14:55:04','2022-05-05 15:12:18'),(9,'U','NATURAL','ven','ta','DNI','88888888',NULL,NULL,NULL,'admin','admin','2022-05-04 15:40:16','2022-05-05 15:12:18'),(10,'C','NATURAL','f','f1','DNI','99999999',NULL,NULL,NULL,'admin',NULL,'2022-05-05 15:27:37',NULL);
/*!40000 ALTER TABLE `tb_persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_producto`
--

DROP TABLE IF EXISTS `tb_producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_producto` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(450) NOT NULL,
  `marca` varchar(100) NOT NULL,
  `linea` varchar(100) NOT NULL,
  `precio_unitario` decimal(10,2) NOT NULL,
  `stock` decimal(10,2) NOT NULL,
  `observaciones` varchar(450) DEFAULT NULL,
  `creador` varchar(100) NOT NULL,
  `modificador` varchar(100) DEFAULT NULL,
  `fecha_creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `fecha_modificacion` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_producto`
--

LOCK TABLES `tb_producto` WRITE;
/*!40000 ALTER TABLE `tb_producto` DISABLE KEYS */;
INSERT INTO `tb_producto` VALUES (1,'ARROZ ROMPE OLLA','FARAON','ABARROTES',3.60,100.00,NULL,'admin','admin','2022-05-04 15:50:33','2022-05-04 15:53:20');
/*!40000 ALTER TABLE `tb_producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_producto_historial`
--

DROP TABLE IF EXISTS `tb_producto_historial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_producto_historial` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `id_producto` bigint NOT NULL,
  `id_venta` bigint DEFAULT NULL,
  `operacion` varchar(7) NOT NULL,
  `cantidad` decimal(10,2) NOT NULL,
  `precio_unitario` decimal(10,2) NOT NULL,
  `creador` varchar(100) NOT NULL,
  `fecha_creacion` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `fk_tb_producto_historial_1_idx` (`id_producto`),
  KEY `fk_tb_producto_historial_2_idx` (`id_venta`),
  CONSTRAINT `fk_tb_producto_historial_1` FOREIGN KEY (`id_producto`) REFERENCES `tb_producto` (`id`),
  CONSTRAINT `fk_tb_producto_historial_2` FOREIGN KEY (`id_venta`) REFERENCES `tb_venta` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_producto_historial`
--

LOCK TABLES `tb_producto_historial` WRITE;
/*!40000 ALTER TABLE `tb_producto_historial` DISABLE KEYS */;
INSERT INTO `tb_producto_historial` VALUES (1,1,NULL,'INGRESO',10.00,3.60,'admin','2022-05-04 16:00:53'),(2,1,1,'SALIDA',10.00,3.60,'admin','2022-05-04 16:05:51');
/*!40000 ALTER TABLE `tb_producto_historial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_usuario`
--

DROP TABLE IF EXISTS `tb_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_usuario` (
  `id_persona` bigint NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(256) NOT NULL,
  `rol` varchar(45) NOT NULL,
  `activo` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id_persona`),
  KEY `fk_tb_usuario_1_idx` (`id_persona`),
  CONSTRAINT `fk_tb_usuario_1` FOREIGN KEY (`id_persona`) REFERENCES `tb_persona` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_usuario`
--

LOCK TABLES `tb_usuario` WRITE;
/*!40000 ALTER TABLE `tb_usuario` DISABLE KEYS */;
INSERT INTO `tb_usuario` VALUES (1,'admin','$shiro1$SHA-256$500000$zDj3SPjBECQH0dBmksVrig==$ztYJO2EEp8/vD6LRHka/ZGtkr8UOcoiO1CgS7F4OPVE=','ADMINISTRADOR',1),(9,'venta1','$shiro1$SHA-256$500000$Bk3HQal7mgT1RIVy0KQwFw==$Zr/ArZrVc80gNlbhq19383JOV7vTo9oxPukPuuMMl94=','VENDEDOR',1);
/*!40000 ALTER TABLE `tb_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_venta`
--

DROP TABLE IF EXISTS `tb_venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_venta` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `id_cliente` bigint NOT NULL,
  `correlativo` varchar(45) DEFAULT NULL,
  `serie` varchar(100) NOT NULL,
  `importe_total` decimal(10,2) NOT NULL,
  `creador` varchar(100) NOT NULL,
  `fecha_creacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `fk_tb_venta_1_idx` (`id_cliente`),
  CONSTRAINT `fk_tb_venta_1` FOREIGN KEY (`id_cliente`) REFERENCES `tb_cliente` (`id_persona`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_venta`
--

LOCK TABLES `tb_venta` WRITE;
/*!40000 ALTER TABLE `tb_venta` DISABLE KEYS */;
INSERT INTO `tb_venta` VALUES (1,7,NULL,'2022',36.00,'admin','2022-05-04 16:12:47');
/*!40000 ALTER TABLE `tb_venta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-05 12:10:17
