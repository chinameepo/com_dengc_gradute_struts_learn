/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50155
Source Host           : localhost:3306
Source Database       : deng

Target Server Type    : MYSQL
Target Server Version : 50155
File Encoding         : 65001

Date: 2012-03-11 11:34:22
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `auction_user`
-- ----------------------------
DROP TABLE IF EXISTS `auction_user`;
CREATE TABLE `auction_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `userpass` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `mobile` varchar(20) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of auction_user
-- ----------------------------
INSERT INTO auction_user VALUES ('1', 'tomcat', 'tomcat', 'cwq@127.0.0.1', '13671599905');
INSERT INTO auction_user VALUES ('2', 'mysql', 'mysql', 'cwq@127.0.0.1', '13671599905');

-- ----------------------------
-- Table structure for `bid`
-- ----------------------------
DROP TABLE IF EXISTS `bid`;
CREATE TABLE `bid` (
  `bid_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `item_id` int(11) NOT NULL,
  `bid_price` double NOT NULL,
  `bid_date` date NOT NULL,
  PRIMARY KEY (`bid_id`),
  UNIQUE KEY `item_id` (`item_id`,`bid_price`),
  KEY `FK17CFD859ED8BD` (`item_id`),
  KEY `FK17CFD73B4197A` (`user_id`),
  CONSTRAINT `bid_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `auction_user` (`user_id`),
  CONSTRAINT `bid_ibfk_2` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`),
  CONSTRAINT `FK17CFD73B4197A` FOREIGN KEY (`user_id`) REFERENCES `auction_user` (`user_id`),
  CONSTRAINT `FK17CFD859ED8BD` FOREIGN KEY (`item_id`) REFERENCES `item` (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bid
-- ----------------------------
INSERT INTO bid VALUES ('1', '2', '1', '250', '2006-07-09');
INSERT INTO bid VALUES ('2', '1', '3', '25000', '2006-07-05');

-- ----------------------------
-- Table structure for `customer`
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `age` int(255) NOT NULL,
  `job` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO customer VALUES ('1', 'de', '12', 'act');

-- ----------------------------
-- Table structure for `item`
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `item_id` int(11) NOT NULL AUTO_INCREMENT,
  `item_name` varchar(255) NOT NULL,
  `item_remark` varchar(255) NOT NULL,
  `item_desc` varchar(255) DEFAULT NULL,
  `kind_id` int(11) NOT NULL,
  `addtime` date NOT NULL,
  `endtime` date NOT NULL,
  `init_price` double NOT NULL,
  `max_price` double NOT NULL,
  `owner_id` int(11) NOT NULL,
  `winer_id` int(11) DEFAULT NULL,
  `state_id` int(11) NOT NULL,
  PRIMARY KEY (`item_id`),
  KEY `FK317B133726B497` (`state_id`),
  KEY `FK317B133A0CF2FC` (`winer_id`),
  KEY `FK317B13DD217D1D` (`kind_id`),
  KEY `FK317B13DF9AC992` (`owner_id`),
  CONSTRAINT `FK317B133726B497` FOREIGN KEY (`state_id`) REFERENCES `state` (`state_id`),
  CONSTRAINT `FK317B133A0CF2FC` FOREIGN KEY (`winer_id`) REFERENCES `auction_user` (`user_id`),
  CONSTRAINT `FK317B13DD217D1D` FOREIGN KEY (`kind_id`) REFERENCES `kind` (`kind_id`),
  CONSTRAINT `FK317B13DF9AC992` FOREIGN KEY (`owner_id`) REFERENCES `auction_user` (`user_id`),
  CONSTRAINT `item_ibfk_1` FOREIGN KEY (`kind_id`) REFERENCES `kind` (`kind_id`),
  CONSTRAINT `item_ibfk_2` FOREIGN KEY (`owner_id`) REFERENCES `auction_user` (`user_id`),
  CONSTRAINT `item_ibfk_3` FOREIGN KEY (`winer_id`) REFERENCES `auction_user` (`user_id`),
  CONSTRAINT `item_ibfk_4` FOREIGN KEY (`state_id`) REFERENCES `state` (`state_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of item
-- ----------------------------
INSERT INTO item VALUES ('1', '主板', '老式主板', '老主板，还可以用', '1', '2006-07-06', '2008-07-10', '230', '250', '1', '2', '2');
INSERT INTO item VALUES ('2', '显卡', '老式显卡', '老显卡，还可以用', '1', '2006-07-03', '2008-07-05', '210', '210', '2', null, '3');
INSERT INTO item VALUES ('3', '老房子', '老式房子', '40年的老房子', '2', '2006-07-03', '2008-07-06', '21000', '25000', '2', '1', '2');
INSERT INTO item VALUES ('4', '内存', '用于笔记本KingStone', '1G容量', '1', '2008-07-20', '2008-07-21', '250', '250', '1', null, '3');
INSERT INTO item VALUES ('5', 'CPU', '用于PC', 'Intel', '1', '2008-07-20', '2008-07-22', '2000', '2000', '1', null, '3');

-- ----------------------------
-- Table structure for `kind`
-- ----------------------------
DROP TABLE IF EXISTS `kind`;
CREATE TABLE `kind` (
  `kind_id` int(11) NOT NULL AUTO_INCREMENT,
  `kind_name` varchar(50) NOT NULL,
  `kind_desc` varchar(255) NOT NULL,
  PRIMARY KEY (`kind_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of kind
-- ----------------------------
INSERT INTO kind VALUES ('1', '电脑硬件', '这里并不是很主流的产品，但价格绝对令你心动');
INSERT INTO kind VALUES ('2', '房产', '提供非常稀缺的房源');
INSERT INTO kind VALUES ('3', '书', '普通商品');
INSERT INTO kind VALUES ('4', '电器', '热门商品');
INSERT INTO kind VALUES ('5', '首饰', '贵重商品');

-- ----------------------------
-- Table structure for `state`
-- ----------------------------
DROP TABLE IF EXISTS `state`;
CREATE TABLE `state` (
  `state_id` int(11) NOT NULL AUTO_INCREMENT,
  `state_name` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`state_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of state
-- ----------------------------
INSERT INTO state VALUES ('1', '拍卖中');
INSERT INTO state VALUES ('2', '拍卖成功');
INSERT INTO state VALUES ('3', '流拍');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL DEFAULT '0',
  `name` varchar(255) DEFAULT NULL,
  `company` varchar(255) DEFAULT NULL,
  `学校` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO student VALUES ('0', '邓CCC', 'hua wei ', 'wuths');
INSERT INTO student VALUES ('1', 'deng', 'esec', null);
INSERT INTO student VALUES ('2', 'fef邓超', '二手房', null);
INSERT INTO student VALUES ('5', 'zengge', 'huawe', null);
INSERT INTO student VALUES ('7', 'zengge', 'huawe', null);
INSERT INTO student VALUES ('8', 'fef', 'esec', null);
INSERT INTO student VALUES ('9', '小鑫', '微软', null);
INSERT INTO student VALUES ('1100', 'hibenatedeng', 'hibernamte', null);
INSERT INTO student VALUES ('1101', 'hibenatedeng', 'hibernamte', null);
INSERT INTO student VALUES ('1102', 'hibenatedeng', 'hibernamte', null);
INSERT INTO student VALUES ('1103', 'denghai', 'hide', null);
INSERT INTO student VALUES ('1104', '等你', '微软了', null);

-- ----------------------------
-- Table structure for `tree_category`
-- ----------------------------
DROP TABLE IF EXISTS `tree_category`;
CREATE TABLE `tree_category` (
  `category_id` int(11) NOT NULL AUTO_INCREMENT,
  `parent_id` int(11) DEFAULT '-1',
  `level` smallint(6) DEFAULT NULL,
  `is_leaf` tinyint(1) DEFAULT NULL,
  `category_title` varchar(100) DEFAULT NULL,
  `category_name` varchar(100) DEFAULT NULL,
  `category_code` varchar(100) DEFAULT NULL,
  `category_type` varchar(30) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `creator` varchar(50) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `modify_user` varchar(50) DEFAULT NULL,
  `modify_date` datetime DEFAULT NULL,
  `description` text,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tree_category
-- ----------------------------
INSERT INTO tree_category VALUES ('1', '-1', '1', '0', 'root', 'root', 'root', 'product_type', null, '1', null, null, null, null, null);
INSERT INTO tree_category VALUES ('2', '1', '2', '0', '<input type=checkbox name=product_type1 id=product_type1/><b>product_type1</b>', 'product_type1', 'product_type1', 'product_type', null, '1', null, null, null, null, null);
INSERT INTO tree_category VALUES ('3', '1', '2', '0', '<input type=checkbox name=product_type2 id=product_type2 class=treeCheckBox/><b>product_type2</b>', 'product_type2', 'product_type2', 'product_type', null, '1', null, null, null, null, null);
INSERT INTO tree_category VALUES ('4', '3', '3', '0', '<input type=checkbox name=product_type21 id=product_type21/><b>product_type21</b>', 'product_type21', 'product_type21', 'product_type', null, '1', null, null, null, null, null);
INSERT INTO tree_category VALUES ('5', '2', '3', '0', '<input type=checkbox name=product_type11 id=product_type11/><b>product_type11</b>', 'product_type11', 'product_type11', 'product_type', null, '1', null, null, null, null, null);
INSERT INTO tree_category VALUES ('6', '5', '4', '1', '<input type=checkbox name=product_type111 id=product_type111/><b>product_type111</b>', 'product_type111', 'product_type111', 'product_type', null, '1', null, null, null, null, null);
INSERT INTO tree_category VALUES ('7', '3', '2', '0', '<input type=checkbox name=product_type22 id=product_type22/><b>product_type22</b>', 'product_type22', 'product_type22', 'product_type', null, '1', null, null, null, null, null);
INSERT INTO tree_category VALUES ('8', '2', '3', '0', '<input type=checkbox name=product_type12 id=product_type12/><b>product_type12</b>', 'product_type12', 'product_type12', 'product_type', null, '1', null, null, null, null, null);
INSERT INTO tree_category VALUES ('9', '4', '4', '1', '<input type=checkbox name=product_type211 id=product_type211/><b>product_type211</b>', 'product_type211', 'product_type211', 'product_type', null, '1', null, null, null, null, null);
INSERT INTO tree_category VALUES ('10', '7', '4', '1', '<input type=checkbox name=product_type221 id=product_type221/><b>product_type221</b>', 'product_type221', 'product_type221', 'product_type', null, '1', null, null, null, null, null);

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(25) CHARACTER SET utf8 NOT NULL,
  `password` varchar(25) CHARACTER SET utf8 NOT NULL,
  `email` varchar(40) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO user VALUES ('1', 'deng', 'dengchao', 'aaa@qq.com');
INSERT INTO user VALUES ('2', 'deng123', 'dengchao', 'fiprpi');
