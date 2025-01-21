-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmd4uh5
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Current Database: `ssmd4uh5`
--

/*!40000 DROP DATABASE IF EXISTS `ssmd4uh5`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ssmd4uh5` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `ssmd4uh5`;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `address` varchar(200) NOT NULL COMMENT '地址',
  `name` varchar(200) NOT NULL COMMENT '收货人',
  `phone` varchar(200) NOT NULL COMMENT '电话',
  `isdefault` varchar(200) NOT NULL COMMENT '是否默认地址[是/否]',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='地址';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'2022-04-11 06:35:40',11,'宇宙银河系金星1号','金某','13823888881','是'),(2,'2022-04-11 06:35:40',12,'宇宙银河系木星1号','木某','13823888882','是'),(3,'2022-04-11 06:35:40',13,'宇宙银河系水星1号','水某','13823888883','是'),(4,'2022-04-11 06:35:40',14,'宇宙银河系火星1号','火某','13823888884','是'),(5,'2022-04-11 06:35:40',15,'宇宙银河系土星1号','土某','13823888885','是'),(6,'2022-04-11 06:35:40',16,'宇宙银河系月球1号','月某','13823888886','是');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cart` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tablename` varchar(200) DEFAULT 'jingqumeishi' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `picture` varchar(200) DEFAULT NULL COMMENT '图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` float DEFAULT NULL COMMENT '单价',
  `discountprice` float DEFAULT NULL COMMENT '会员价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='购物车表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusshongheibang`
--

DROP TABLE IF EXISTS `discusshongheibang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusshongheibang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1649659099968 DEFAULT CHARSET=utf8 COMMENT='红黑榜评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusshongheibang`
--

LOCK TABLES `discusshongheibang` WRITE;
/*!40000 ALTER TABLE `discusshongheibang` DISABLE KEYS */;
INSERT INTO `discusshongheibang` VALUES (161,'2022-04-11 06:35:40',1,1,'用户名1','评论内容1','回复内容1'),(162,'2022-04-11 06:35:40',2,2,'用户名2','评论内容2','回复内容2'),(163,'2022-04-11 06:35:40',3,3,'用户名3','评论内容3','回复内容3'),(164,'2022-04-11 06:35:40',4,4,'用户名4','评论内容4','回复内容4'),(165,'2022-04-11 06:35:40',5,5,'用户名5','评论内容5','回复内容5'),(166,'2022-04-11 06:35:40',6,6,'用户名6','评论内容6','回复内容6'),(1649659099967,'2022-04-11 06:38:19',82,1649659018318,'11','测试',NULL);
/*!40000 ALTER TABLE `discusshongheibang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussjingqu`
--

DROP TABLE IF EXISTS `discussjingqu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussjingqu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8 COMMENT='景区评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussjingqu`
--

LOCK TABLES `discussjingqu` WRITE;
/*!40000 ALTER TABLE `discussjingqu` DISABLE KEYS */;
INSERT INTO `discussjingqu` VALUES (131,'2022-04-11 06:35:40',1,1,'用户名1','评论内容1','回复内容1'),(132,'2022-04-11 06:35:40',2,2,'用户名2','评论内容2','回复内容2'),(133,'2022-04-11 06:35:40',3,3,'用户名3','评论内容3','回复内容3'),(134,'2022-04-11 06:35:40',4,4,'用户名4','评论内容4','回复内容4'),(135,'2022-04-11 06:35:40',5,5,'用户名5','评论内容5','回复内容5'),(136,'2022-04-11 06:35:40',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussjingqu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussjingqumeishi`
--

DROP TABLE IF EXISTS `discussjingqumeishi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussjingqumeishi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8 COMMENT='景区美食评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussjingqumeishi`
--

LOCK TABLES `discussjingqumeishi` WRITE;
/*!40000 ALTER TABLE `discussjingqumeishi` DISABLE KEYS */;
INSERT INTO `discussjingqumeishi` VALUES (151,'2022-04-11 06:35:40',1,1,'用户名1','评论内容1','回复内容1'),(152,'2022-04-11 06:35:40',2,2,'用户名2','评论内容2','回复内容2'),(153,'2022-04-11 06:35:40',3,3,'用户名3','评论内容3','回复内容3'),(154,'2022-04-11 06:35:40',4,4,'用户名4','评论内容4','回复内容4'),(155,'2022-04-11 06:35:40',5,5,'用户名5','评论内容5','回复内容5'),(156,'2022-04-11 06:35:40',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussjingqumeishi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussmenpiao`
--

DROP TABLE IF EXISTS `discussmenpiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussmenpiao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8 COMMENT='门票评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussmenpiao`
--

LOCK TABLES `discussmenpiao` WRITE;
/*!40000 ALTER TABLE `discussmenpiao` DISABLE KEYS */;
INSERT INTO `discussmenpiao` VALUES (141,'2022-04-11 06:35:40',1,1,'用户名1','评论内容1','回复内容1'),(142,'2022-04-11 06:35:40',2,2,'用户名2','评论内容2','回复内容2'),(143,'2022-04-11 06:35:40',3,3,'用户名3','评论内容3','回复内容3'),(144,'2022-04-11 06:35:40',4,4,'用户名4','评论内容4','回复内容4'),(145,'2022-04-11 06:35:40',5,5,'用户名5','评论内容5','回复内容5'),(146,'2022-04-11 06:35:40',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussmenpiao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hongheibang`
--

DROP TABLE IF EXISTS `hongheibang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hongheibang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dianpumingcheng` varchar(200) DEFAULT NULL COMMENT '店铺名称',
  `dianpuweizhi` varchar(200) DEFAULT NULL COMMENT '店铺位置',
  `youkepingyu` varchar(200) DEFAULT NULL COMMENT '游客评语',
  `pingfen` varchar(200) DEFAULT NULL COMMENT '评分',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `bangleixing` varchar(200) DEFAULT NULL COMMENT '榜类型',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `longitude` float DEFAULT NULL COMMENT '经度',
  `latitude` float DEFAULT NULL COMMENT '纬度',
  `fulladdress` varchar(200) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='红黑榜';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hongheibang`
--

LOCK TABLES `hongheibang` WRITE;
/*!40000 ALTER TABLE `hongheibang` DISABLE KEYS */;
INSERT INTO `hongheibang` VALUES (81,'2022-04-11 06:35:40','店铺名称1','店铺位置1','游客评语1','5','upload/hongheibang_tupian1.jpg','红榜','2022-04-11',1,1,'宇宙银河系地球1号'),(82,'2022-04-11 06:35:40','店铺名称2','店铺位置2','游客评语2','评分2','upload/hongheibang_tupian2.jpg','红榜','2022-04-11',2,2,'宇宙银河系地球2号'),(83,'2022-04-11 06:35:40','店铺名称3','店铺位置3','游客评语3','评分3','upload/hongheibang_tupian3.jpg','红榜','2022-04-11',3,3,'宇宙银河系地球3号'),(84,'2022-04-11 06:35:40','店铺名称4','店铺位置4','游客评语4','评分4','upload/hongheibang_tupian4.jpg','红榜','2022-04-11',4,4,'宇宙银河系地球4号'),(85,'2022-04-11 06:35:40','店铺名称5','店铺位置5','游客评语5','评分5','upload/hongheibang_tupian5.jpg','红榜','2022-04-11',5,5,'宇宙银河系地球5号'),(86,'2022-04-11 06:35:40','店铺名称6','店铺位置6','游客评语6','评分6','upload/hongheibang_tupian6.jpg','红榜','2022-04-11',6,6,'宇宙银河系地球6号');
/*!40000 ALTER TABLE `hongheibang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jingqu`
--

DROP TABLE IF EXISTS `jingqu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jingqu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jingqumingcheng` varchar(200) DEFAULT NULL COMMENT '景区名称',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `jingqujianjie` longtext COMMENT '景区简介',
  `yantushangpu` varchar(200) DEFAULT NULL COMMENT '沿途商铺',
  `tesemeishi` longtext COMMENT '特色美食',
  `lvyoujiaotonggongju` longtext COMMENT '旅游交通工具',
  `shijian` date DEFAULT NULL COMMENT '时间',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='景区';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jingqu`
--

LOCK TABLES `jingqu` WRITE;
/*!40000 ALTER TABLE `jingqu` DISABLE KEYS */;
INSERT INTO `jingqu` VALUES (31,'2022-04-11 06:35:40','景区名称1','upload/jingqu_fengmian1.jpg','<p>景区环境优美</p><p>位置*****</p><p>每天限制人流***多少</p><p>门票剩余多少</p>','沿途有100家特色商铺，主要有哪些','<p>主要有甜食、主食</p>','<p>自行车</p><p>电动车</p><p>电动汽车租赁</p>','2022-04-11',1,1),(32,'2022-04-11 06:35:40','景区名称2','upload/jingqu_fengmian2.jpg','景区简介2','沿途商铺2','特色美食2','旅游交通工具2','2022-04-11',2,2),(33,'2022-04-11 06:35:40','景区名称3','upload/jingqu_fengmian3.jpg','景区简介3','沿途商铺3','特色美食3','旅游交通工具3','2022-04-11',3,3),(34,'2022-04-11 06:35:40','景区名称4','upload/jingqu_fengmian4.jpg','景区简介4','沿途商铺4','特色美食4','旅游交通工具4','2022-04-11',4,4),(35,'2022-04-11 06:35:40','景区名称5','upload/jingqu_fengmian5.jpg','景区简介5','沿途商铺5','特色美食5','旅游交通工具5','2022-04-11',5,5),(36,'2022-04-11 06:35:40','景区名称6','upload/jingqu_fengmian6.jpg','景区简介6','沿途商铺6','特色美食6','旅游交通工具6','2022-04-11',6,6);
/*!40000 ALTER TABLE `jingqu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jingqumeishi`
--

DROP TABLE IF EXISTS `jingqumeishi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jingqumeishi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jingqumingcheng` varchar(200) DEFAULT NULL COMMENT '景区名称',
  `shangpumingcheng` varchar(200) DEFAULT NULL COMMENT '商铺名称',
  `shangpuweizhi` varchar(200) DEFAULT NULL COMMENT '商铺位置',
  `meishimingcheng` varchar(200) DEFAULT NULL COMMENT '美食名称',
  `meishileixing` varchar(200) DEFAULT NULL COMMENT '美食类型',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `cailiao` varchar(200) DEFAULT NULL COMMENT '材料',
  `fenliang` varchar(200) DEFAULT NULL COMMENT '份量',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `price` float DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='景区美食';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jingqumeishi`
--

LOCK TABLES `jingqumeishi` WRITE;
/*!40000 ALTER TABLE `jingqumeishi` DISABLE KEYS */;
INSERT INTO `jingqumeishi` VALUES (61,'2022-04-11 06:35:40','景区名称1','商铺名称1','商铺位置1','美食名称1','美食类型1','upload/jingqumeishi_tupian1.jpg','材料1','份量1',2,1,99.9),(62,'2022-04-11 06:35:40','景区名称2','商铺名称2','商铺位置2','美食名称2','美食类型2','upload/jingqumeishi_tupian2.jpg','材料2','份量2',2,2,99.9),(63,'2022-04-11 06:35:40','景区名称3','商铺名称3','商铺位置3','美食名称3','美食类型3','upload/jingqumeishi_tupian3.jpg','材料3','份量3',3,3,99.9),(64,'2022-04-11 06:35:40','景区名称4','商铺名称4','商铺位置4','美食名称4','美食类型4','upload/jingqumeishi_tupian4.jpg','材料4','份量4',4,4,99.9),(65,'2022-04-11 06:35:40','景区名称5','商铺名称5','商铺位置5','美食名称5','美食类型5','upload/jingqumeishi_tupian5.jpg','材料5','份量5',5,5,99.9),(66,'2022-04-11 06:35:40','景区名称6','商铺名称6','商铺位置6','美食名称6','美食类型6','upload/jingqumeishi_tupian6.jpg','材料6','份量6',6,6,99.9);
/*!40000 ALTER TABLE `jingqumeishi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jingqushangpin`
--

DROP TABLE IF EXISTS `jingqushangpin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jingqushangpin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jingqumingcheng` varchar(200) DEFAULT NULL COMMENT '景区名称',
  `dianpubianhao` varchar(200) DEFAULT NULL COMMENT '店铺编号',
  `shangpumingcheng` varchar(200) DEFAULT NULL COMMENT '商铺名称',
  `dianpuweizhi` varchar(200) DEFAULT NULL COMMENT '店铺位置',
  `shangpinmingcheng` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `shuliang` varchar(200) DEFAULT NULL COMMENT '数量',
  `price` float DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='景区商品';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jingqushangpin`
--

LOCK TABLES `jingqushangpin` WRITE;
/*!40000 ALTER TABLE `jingqushangpin` DISABLE KEYS */;
INSERT INTO `jingqushangpin` VALUES (41,'2022-04-11 06:35:40','景区名称1','店铺编号1','商铺名称1','店铺位置1','商品名称1','upload/jingqushangpin_tupian1.jpg','100',10),(42,'2022-04-11 06:35:40','景区名称2','店铺编号2','商铺名称2','店铺位置2','商品名称2','upload/jingqushangpin_tupian2.jpg','数量2',99.9),(43,'2022-04-11 06:35:40','景区名称3','店铺编号3','商铺名称3','店铺位置3','商品名称3','upload/jingqushangpin_tupian3.jpg','数量3',99.9),(44,'2022-04-11 06:35:40','景区名称4','店铺编号4','商铺名称4','店铺位置4','商品名称4','upload/jingqushangpin_tupian4.jpg','数量4',99.9),(45,'2022-04-11 06:35:40','景区名称5','店铺编号5','商铺名称5','店铺位置5','商品名称5','upload/jingqushangpin_tupian5.jpg','数量5',99.9),(46,'2022-04-11 06:35:40','景区名称6','店铺编号6','商铺名称6','店铺位置6','商品名称6','upload/jingqushangpin_tupian6.jpg','数量6',99.9);
/*!40000 ALTER TABLE `jingqushangpin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lvyougonggao`
--

DROP TABLE IF EXISTS `lvyougonggao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lvyougonggao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `neirongxiangqing` longtext COMMENT '内容详情',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='旅游公告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lvyougonggao`
--

LOCK TABLES `lvyougonggao` WRITE;
/*!40000 ALTER TABLE `lvyougonggao` DISABLE KEYS */;
INSERT INTO `lvyougonggao` VALUES (21,'2022-04-11 06:35:40','标题1','upload/lvyougonggao_fengmian1.jpg','内容详情1','2022-04-11'),(22,'2022-04-11 06:35:40','标题2','upload/lvyougonggao_fengmian2.jpg','内容详情2','2022-04-11'),(23,'2022-04-11 06:35:40','标题3','upload/lvyougonggao_fengmian3.jpg','内容详情3','2022-04-11'),(24,'2022-04-11 06:35:40','标题4','upload/lvyougonggao_fengmian4.jpg','内容详情4','2022-04-11'),(25,'2022-04-11 06:35:40','标题5','upload/lvyougonggao_fengmian5.jpg','内容详情5','2022-04-11'),(26,'2022-04-11 06:35:40','标题6','upload/lvyougonggao_fengmian6.jpg','<p>景区优美</p>','2022-04-11');
/*!40000 ALTER TABLE `lvyougonggao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lvyoujiaotonggongju`
--

DROP TABLE IF EXISTS `lvyoujiaotonggongju`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lvyoujiaotonggongju` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gongjumingcheng` varchar(200) DEFAULT NULL COMMENT '工具名称',
  `leixing` varchar(200) DEFAULT NULL COMMENT '类型',
  `jiage` varchar(200) DEFAULT NULL COMMENT '价格',
  `shuliang` varchar(200) DEFAULT NULL COMMENT '数量',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='旅游交通工具';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lvyoujiaotonggongju`
--

LOCK TABLES `lvyoujiaotonggongju` WRITE;
/*!40000 ALTER TABLE `lvyoujiaotonggongju` DISABLE KEYS */;
INSERT INTO `lvyoujiaotonggongju` VALUES (71,'2022-04-11 06:35:40','工具名称1','类型1','价格1','数量1','upload/lvyoujiaotonggongju_tupian1.jpg'),(72,'2022-04-11 06:35:40','工具名称2','类型2','价格2','数量2','upload/lvyoujiaotonggongju_tupian2.jpg'),(73,'2022-04-11 06:35:40','工具名称3','类型3','价格3','数量3','upload/lvyoujiaotonggongju_tupian3.jpg'),(74,'2022-04-11 06:35:40','工具名称4','类型4','价格4','数量4','upload/lvyoujiaotonggongju_tupian4.jpg'),(75,'2022-04-11 06:35:40','工具名称5','类型5','价格5','数量5','upload/lvyoujiaotonggongju_tupian5.jpg'),(76,'2022-04-11 06:35:40','工具名称6','类型6','价格6','数量6','upload/lvyoujiaotonggongju_tupian6.jpg');
/*!40000 ALTER TABLE `lvyoujiaotonggongju` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menpiao`
--

DROP TABLE IF EXISTS `menpiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menpiao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jingqumingcheng` varchar(200) DEFAULT NULL COMMENT '景区名称',
  `jingdian` varchar(200) DEFAULT NULL COMMENT '景点',
  `renshu` varchar(200) DEFAULT NULL COMMENT '人数',
  `canguanshijian` varchar(200) DEFAULT NULL COMMENT '参观时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `price` float DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1649659277653 DEFAULT CHARSET=utf8 COMMENT='门票';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menpiao`
--

LOCK TABLES `menpiao` WRITE;
/*!40000 ALTER TABLE `menpiao` DISABLE KEYS */;
INSERT INTO `menpiao` VALUES (51,'2022-04-11 06:35:40','景区名称1','景点1','人数1','参观时间1','用户账号1','用户姓名1','13823888881','是','','未支付',1,1,99.9),(52,'2022-04-11 06:35:40','景区名称2','景点2','人数2','参观时间2','用户账号2','用户姓名2','13823888882','是','','未支付',2,2,99.9),(53,'2022-04-11 06:35:40','景区名称3','景点3','人数3','参观时间3','用户账号3','用户姓名3','13823888883','是','','未支付',3,3,99.9),(54,'2022-04-11 06:35:40','景区名称4','景点4','人数4','参观时间4','用户账号4','用户姓名4','13823888884','是','','未支付',4,4,99.9),(55,'2022-04-11 06:35:40','景区名称5','景点5','人数5','参观时间5','用户账号5','用户姓名5','13823888885','是','','未支付',5,5,99.9),(56,'2022-04-11 06:35:40','景区名称6','景点6','人数6','参观时间6','用户账号6','用户姓名6','13823888886','是','','未支付',6,6,99.9),(1649659277652,'2022-04-11 06:41:17','景区名称1','华山','3','上午10点','11','李林','15807556666','是','通过已支付','已支付',1,1,150);
/*!40000 ALTER TABLE `menpiao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `orderid` varchar(200) NOT NULL COMMENT '订单编号',
  `tablename` varchar(200) DEFAULT 'jingqumeishi' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `picture` varchar(200) DEFAULT NULL COMMENT '商品图片',
  `buynumber` int(11) NOT NULL COMMENT '购买数量',
  `price` float NOT NULL DEFAULT '0' COMMENT '价格/积分',
  `discountprice` float DEFAULT '0' COMMENT '折扣价格',
  `total` float NOT NULL DEFAULT '0' COMMENT '总价格/总积分',
  `discounttotal` float DEFAULT '0' COMMENT '折扣总价格',
  `type` int(11) DEFAULT '1' COMMENT '支付类型',
  `status` varchar(200) DEFAULT NULL COMMENT '状态',
  `address` varchar(200) DEFAULT NULL COMMENT '地址',
  `tel` varchar(200) DEFAULT NULL COMMENT '电话',
  `consignee` varchar(200) DEFAULT NULL COMMENT '收货人',
  `logistics` longtext COMMENT '物流',
  PRIMARY KEY (`id`),
  UNIQUE KEY `orderid` (`orderid`)
) ENGINE=InnoDB AUTO_INCREMENT=1649659192447 DEFAULT CHARSET=utf8 COMMENT='订单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1649659161991,'2022-04-11 06:39:21','202241114394794975050','jingqushangpin',1649659018318,41,'景区名称1','upload/jingqushangpin_tupian1.jpg',1,99.9,99.9,99.9,99.9,1,'已支付',NULL,NULL,NULL,NULL),(1649659192446,'2022-04-11 06:39:51','202241114401836732676','jingqumeishi',1649659018318,61,'美食名称1','upload/jingqumeishi_tupian1.jpg',1,99.9,99.9,99.9,99.9,1,'已支付',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型(1:收藏,21:赞,22:踩)',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1649659173658 DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
INSERT INTO `storeup` VALUES (1649659173657,'2022-04-11 06:39:33',1649659018318,61,'jingqumeishi','美食名称1','upload/jingqumeishi_tupian1.jpg','21',NULL);
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1649659018318,'11','yonghu','用户','5xe2u86qtagnwuvsscsx2s22up8qut4c','2022-04-11 06:37:07','2022-04-11 07:37:07'),(2,1,'abo','users','管理员','2fp14ic8nmmuiqwhgfy9s2b1v6rx6ly7','2022-04-11 06:41:59','2022-04-11 07:41:59');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2022-04-11 06:35:40');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) NOT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `money` float DEFAULT '0' COMMENT '余额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1649659018319 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2022-04-11 06:35:40','用户账号1','用户姓名1','123456','男','13823888881','upload/yonghu_touxiang1.jpg',100),(12,'2022-04-11 06:35:40','用户账号2','用户姓名2','123456','男','13823888882','upload/yonghu_touxiang2.jpg',100),(13,'2022-04-11 06:35:40','用户账号3','用户姓名3','123456','男','13823888883','upload/yonghu_touxiang3.jpg',100),(14,'2022-04-11 06:35:40','用户账号4','用户姓名4','123456','男','13823888884','upload/yonghu_touxiang4.jpg',100),(15,'2022-04-11 06:35:40','用户账号5','用户姓名5','123456','男','13823888885','upload/yonghu_touxiang5.jpg',100),(16,'2022-04-11 06:35:40','6','6','123456','男','13823888886','upload/yonghu_touxiang6.jpg',100),(1649659018318,'2022-04-11 06:36:58','11','李林','11','男','15807556666','upload/1649659143709.jpg',9800.2);
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-12 15:52:49
