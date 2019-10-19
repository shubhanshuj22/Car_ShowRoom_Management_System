-- MySQL dump 10.13  Distrib 5.5.27, for Win32 (x86)
--
-- Host: localhost    Database: cardb
-- ------------------------------------------------------
-- Server version	5.5.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin_cus_order`
--

DROP TABLE IF EXISTS `admin_cus_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin_cus_order` (
  `clientid` varchar(30) DEFAULT NULL,
  `CustomerName` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mobileNo` varchar(30) DEFAULT NULL,
  `adharCardNo` varchar(18) DEFAULT NULL,
  `carmodel` varchar(50) DEFAULT NULL,
  `carColour` varchar(15) DEFAULT NULL,
  `dateoforder` date DEFAULT NULL,
  `ECA` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_cus_order`
--

LOCK TABLES `admin_cus_order` WRITE;
/*!40000 ALTER TABLE `admin_cus_order` DISABLE KEYS */;
INSERT INTO `admin_cus_order` VALUES ('jain12','Aman','aman@gmail.com','8987129845','5975489948793012','Mercedes-Benz AMG G','Black','2019-03-10','YES'),('shippi','aditi','Aditi@gmail.com','928492998','1832878997289','Mercedes-Benz C-Class Prime C 220d','Black','2019-03-15','YES'),('shippi','Aditi',' Aditi@gmail.com','3829890','4370473',' Prime C 220d','Black','2019-03-15','YES'),('avanisingh','gdfuo','vdkiw@gla.com','7465345261','4567894567890','235','sgsw','2346-02-09','YES'),('afreen088','Afreen Hasan','hasanafreen088@gmail.com','7619915617','6666777788889999','Mercedes','black','2019-04-12','YES');
/*!40000 ALTER TABLE `admin_cus_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admindb`
--

DROP TABLE IF EXISTS `admindb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admindb` (
  `userid` varchar(30) NOT NULL DEFAULT '',
  `password` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admindb`
--

LOCK TABLES `admindb` WRITE;
/*!40000 ALTER TABLE `admindb` DISABLE KEYS */;
INSERT INTO `admindb` VALUES ('','2'),('shub','123'),('shubhu','12');
/*!40000 ALTER TABLE `admindb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `afreen088ordertbl`
--

DROP TABLE IF EXISTS `afreen088ordertbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `afreen088ordertbl` (
  `CustomerName` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mobileNo` varchar(30) DEFAULT NULL,
  `adharCardNo` varchar(18) DEFAULT NULL,
  `carModel` varchar(30) DEFAULT NULL,
  `carColour` varchar(15) DEFAULT NULL,
  `dateoforder` date DEFAULT NULL,
  `ECA` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `afreen088ordertbl`
--

LOCK TABLES `afreen088ordertbl` WRITE;
/*!40000 ALTER TABLE `afreen088ordertbl` DISABLE KEYS */;
INSERT INTO `afreen088ordertbl` VALUES ('Afreen Hasan','hasanafreen088@gmail.com','7619915617','6666777788889999','Mercedes','black','2019-04-12','YES');
/*!40000 ALTER TABLE `afreen088ordertbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cardetails`
--

DROP TABLE IF EXISTS `cardetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cardetails` (
  `car_name` varchar(25) DEFAULT NULL,
  `car_model` varchar(30) DEFAULT NULL,
  `Mileage` varchar(8) DEFAULT NULL,
  `Engine` varchar(8) DEFAULT NULL,
  `BPH` varchar(8) DEFAULT NULL,
  `Transmission` varchar(10) DEFAULT NULL,
  `TopSpeed` varchar(6) DEFAULT NULL,
  `ColourAvailable` varchar(30) DEFAULT NULL,
  `yearly_SChargee` varchar(9) DEFAULT NULL,
  `Avg_Cost` varchar(15) DEFAULT NULL,
  `fuel_type` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cardetails`
--

LOCK TABLES `cardetails` WRITE;
/*!40000 ALTER TABLE `cardetails` DISABLE KEYS */;
INSERT INTO `cardetails` VALUES ('Mercedes-Benz AMG G','S','12.8','3982','510','Auto','310','Black,White,Red','181600','22700000','Petrol'),('Mercedes-Benz AMG G','Roadster','11','3900','460','Auto','302','Black,Red,Blue','176000','22000000','Petrol'),('Mercedes-Benz AMG G','R','13.3','3980','585','Auto','318','Black,White','184000','23000000','Petrol'),('Mercedes-Benz C-Class','Prime C 220d','12.5','1950','194','Auto','240','White,Gray','32000','4000000','Diesel'),('Mercedes-Benz C-Class','Progressive C 220d','10','1900','186','Auto','255','Black,Blue','35400','4425000','Diesel'),('Mercedes-Benz C-Class','C300 Cabriolet','17.9','1991','258','Auto','250','Gray,Red,White','52160','6520000','Petrol'),('Mercedes-Benz CLA','200 CDI','18','2143','136','Auto','220','Black,White','25376','3172000','Diesel'),('Mercedes-Benz CLA','Urban Sport 200','15','1991','184','Auto','235','White,Red,Gray','28792','3599000','Petrol'),('Mercedes-Benz CLA','200 CGI Sport','14.5','1991','183','Auto','235','Black,Red','27688','3461000','Petrol'),('Mercedes-Benz CLA','AMG 45','13.2','2000','385','Auto','260','Blac,White,Blue','60160','7520000','Petrol'),('Mercedes-Benz GLA Class','220 d 4MATIC','17.8','2143','170','Auto','221','Black','30912','3864000','Diesel'),('Mercedes-Benz GLA Class','200 d Style','19.3','2213','150','Auto','215','Red,Blue,White','23720','2965000','Diesel'),('Mercedes-Benz GLA Class','200 d Sport','16.5','2095','154','Auto','230','Black,White,Gray','26912','3364000','Diesel');
/*!40000 ALTER TABLE `cardetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientdb`
--

DROP TABLE IF EXISTS `clientdb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientdb` (
  `userid` varchar(30) NOT NULL,
  `password` varchar(30) DEFAULT NULL,
  `FullName` varchar(30) DEFAULT NULL,
  `MobileNo` varchar(15) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `Address` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientdb`
--

LOCK TABLES `clientdb` WRITE;
/*!40000 ALTER TABLE `clientdb` DISABLE KEYS */;
INSERT INTO `clientdb` VALUES ('afreen088','mom@dad157','Afreen Hasan','7619915617','hasanafreen088@gmail.com','yamuna hostel GLA University'),('jain12','1212','Shubhanshu jain','923492345','shubh@gmail.com','GLA University'),('shippi','941126','shilpy raghav','7248083757','shilpy.raghav_cs17@gla.ac.in','gully number 420 macchi talaab');
/*!40000 ALTER TABLE `clientdb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jain12ordertbl`
--

DROP TABLE IF EXISTS `jain12ordertbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jain12ordertbl` (
  `CustomerName` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mobileNo` varchar(30) DEFAULT NULL,
  `adharCardNo` varchar(18) DEFAULT NULL,
  `carModel` varchar(30) DEFAULT NULL,
  `carColour` varchar(15) DEFAULT NULL,
  `dateoforder` date DEFAULT NULL,
  `ECA` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jain12ordertbl`
--

LOCK TABLES `jain12ordertbl` WRITE;
/*!40000 ALTER TABLE `jain12ordertbl` DISABLE KEYS */;
INSERT INTO `jain12ordertbl` VALUES ('Aman','aman@gmail.com','8987129845','5975489948793012','Mercedes-Benz AMG G','Black','2019-03-10','YES');
/*!40000 ALTER TABLE `jain12ordertbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shippiordertbl`
--

DROP TABLE IF EXISTS `shippiordertbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shippiordertbl` (
  `CustomerName` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mobileNo` varchar(30) DEFAULT NULL,
  `adharCardNo` varchar(18) DEFAULT NULL,
  `carModel` varchar(30) DEFAULT NULL,
  `carColour` varchar(15) DEFAULT NULL,
  `dateoforder` date DEFAULT NULL,
  `ECA` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shippiordertbl`
--

LOCK TABLES `shippiordertbl` WRITE;
/*!40000 ALTER TABLE `shippiordertbl` DISABLE KEYS */;
INSERT INTO `shippiordertbl` VALUES ('Aditi',' Aditi@gmail.com','3829890','4370473',' Prime C 220d','Black','2019-03-15','YES');
/*!40000 ALTER TABLE `shippiordertbl` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-18  0:35:24
