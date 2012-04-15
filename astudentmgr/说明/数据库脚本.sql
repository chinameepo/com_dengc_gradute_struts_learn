/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50155
Source Host           : localhost:3306
Source Database       : studentmgr

Target Server Type    : MYSQL
Target Server Version : 50155
File Encoding         : 65001

Date: 2012-04-14 17:27:57
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `class`
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `id` int(11) NOT NULL DEFAULT '0',
  `className` varchar(255) DEFAULT NULL COMMENT '班级名字',
  `sum` int(11) DEFAULT NULL COMMENT '人数',
  `classroom` varchar(255) DEFAULT NULL,
  `major` varchar(255) DEFAULT NULL,
  `teacher` varchar(255) DEFAULT NULL COMMENT '班主任',
  `monitor` varchar(255) DEFAULT NULL COMMENT '班长',
  `monitorTel` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class
-- ----------------------------

-- ----------------------------
-- Table structure for `cource`
-- ----------------------------
DROP TABLE IF EXISTS `cource`;
CREATE TABLE `cource` (
  `id` int(22) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `teacher` varchar(255) DEFAULT NULL,
  `classroom` varchar(255) DEFAULT NULL,
  `book` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cource
-- ----------------------------

-- ----------------------------
-- Table structure for `score`
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stuid` int(11) DEFAULT NULL,
  `cource` int(11) DEFAULT NULL,
  `term` varchar(255) DEFAULT NULL,
  `score` double unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `stuid` (`stuid`),
  KEY `cource` (`cource`),
  CONSTRAINT `score_ibfk_1` FOREIGN KEY (`stuid`) REFERENCES `student` (`id`),
  CONSTRAINT `score_ibfk_2` FOREIGN KEY (`cource`) REFERENCES `cource` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of score
-- ----------------------------

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL DEFAULT '0',
  `name` varchar(25) DEFAULT NULL,
  `sex` varchar(12) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `tel` varchar(25) DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL,
  `qq` varchar(25) DEFAULT NULL,
  `room` varchar(25) DEFAULT NULL,
  `studentClass` int(25) DEFAULT NULL,
  `poor` varchar(1) DEFAULT '否' COMMENT '是否贫困',
  `help` varchar(40) DEFAULT NULL,
  `relation` varchar(255) DEFAULT NULL COMMENT '家庭联系人',
  `relationTle` varchar(255) DEFAULT NULL COMMENT '家庭联系人电话',
  `avaScore` double DEFAULT NULL,
  `discipline` varchar(255) DEFAULT NULL COMMENT '违纪情况',
  `escClass` int(11) DEFAULT NULL COMMENT '逃课次数',
  `fine` varchar(255) DEFAULT NULL COMMENT '受惩罚的情况',
  `note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `studentClass` (`studentClass`),
  CONSTRAINT `student_ibfk_1` FOREIGN KEY (`studentClass`) REFERENCES `class` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL COMMENT '类型，分为管理员类型和学生类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
