/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50729
Source Host           : localhost:3306
Source Database       : huaqi

Target Server Type    : MYSQL
Target Server Version : 50729
File Encoding         : 65001

Date: 2020-10-27 22:12:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for project
-- ----------------------------
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `project_name` varchar(255) DEFAULT NULL,
  `justification` varchar(255) DEFAULT NULL,
  `positions` int(255) DEFAULT NULL,
  `project_leader` varchar(255) DEFAULT NULL,
  `unit1` varchar(255) DEFAULT NULL,
  `team1` varchar(255) DEFAULT NULL,
  `project_member2` varchar(255) DEFAULT NULL,
  `unit2` varchar(255) DEFAULT NULL,
  `team2` varchar(255) DEFAULT NULL,
  `project_member3` varchar(255) DEFAULT NULL,
  `unit3` varchar(255) DEFAULT NULL,
  `team3` varchar(255) DEFAULT NULL,
  `project_member4` varchar(255) DEFAULT NULL,
  `unit4` varchar(255) DEFAULT NULL,
  `team4` varchar(255) DEFAULT NULL,
  `project_member5` varchar(255) DEFAULT NULL,
  `unit5` varchar(255) DEFAULT NULL,
  `team5` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of project
-- ----------------------------
INSERT INTO `project` VALUES ('1', 'huaqiProject', 'test project', '1', 'Shen,Jing Tian', 'GCB', 'OT', 'Wang,Qiao Lu', 'GCB', 'OT', 'Cheng,Sha', 'GCB', 'OT_NE', null, null, null, null, null, null);
INSERT INTO `project` VALUES ('3', 'tets12', 'testProject', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
