/*
Navicat MySQL Data Transfer

Source Server         : 191.168.230.188
Source Server Version : 50552
Source Host           : 191.168.230.188:3306
Source Database       : cms

Target Server Type    : MYSQL
Target Server Version : 50552
File Encoding         : 65001

Date: 2019-02-26 17:15:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for house
-- ----------------------------
DROP TABLE IF EXISTS `house`;
CREATE TABLE `house` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(50) DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL,
  `proprietor_id` int(11) DEFAULT NULL COMMENT '业主id',
  `vilage_id` int(11) DEFAULT NULL COMMENT '所属小区id',
  `address` varchar(50) DEFAULT NULL,
  `level` varchar(1) DEFAULT NULL COMMENT '级别',
  `room_num` int(1) DEFAULT NULL COMMENT '室',
  `hall_num` int(1) DEFAULT NULL COMMENT '大厅',
  `toilet_num` int(1) DEFAULT NULL COMMENT '卫生间',
  `balcony_num` int(1) DEFAULT NULL COMMENT '阳台',
  `area` double(10,4) DEFAULT NULL COMMENT '面积',
  `png` varchar(500) DEFAULT NULL,
  `available_goods` varchar(10) DEFAULT NULL COMMENT '可用业主物品(1：毛巾；2：衣架；3：蚕丝被；4：夏凉被；5:四件套；6：枕头；7：拖鞋；8：漱口杯；9：马克杯；10：吹风机；11：电饭煲；12：菜刀；13：砧板；14：扫把簸箕套)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of house
-- ----------------------------
INSERT INTO `house` VALUES ('1', '001', '同乐花苑507房', '2', '1', '科韵路', '1', '2', '1', '1', '1', '60.0000', null, null);

-- ----------------------------
-- Table structure for proprietor
-- ----------------------------
DROP TABLE IF EXISTS `proprietor`;
CREATE TABLE `proprietor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `phone` varchar(32) DEFAULT NULL,
  `bank_name` varchar(32) DEFAULT NULL COMMENT '银行名称',
  `bank_card` varchar(32) DEFAULT NULL COMMENT '银行卡',
  `bank_card_holder` varchar(32) DEFAULT NULL COMMENT '银行卡所属人',
  `settlement_cycle` int(1) DEFAULT NULL COMMENT '结算周期（1：按天结算；2：按月结算；3：按季度结算；4：按年结算）',
  `remarks` varchar(500) DEFAULT NULL COMMENT '备注',
  `intentionality` int(1) DEFAULT NULL COMMENT '意向度（1：厌恶；2：冷漠；3：一般；4：想了解；5：强烈）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of proprietor
-- ----------------------------
INSERT INTO `proprietor` VALUES ('2', '测试2', null, '光大银行', '1234567', null, '2', null, '4');
INSERT INTO `proprietor` VALUES ('3', '测试3', null, '广发银行', '45453487', null, '1', null, '3');

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test
-- ----------------------------
INSERT INTO `test` VALUES ('2', '测试', '2019-02-13 11:30:18');
INSERT INTO `test` VALUES ('3', '测试', '2019-02-13 11:31:17');

-- ----------------------------
-- Table structure for village
-- ----------------------------
DROP TABLE IF EXISTS `village`;
CREATE TABLE `village` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) DEFAULT NULL,
  `province` varchar(20) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `district` varchar(20) DEFAULT NULL,
  `property_phone` varchar(20) DEFAULT NULL COMMENT '物业电话',
  `address` varchar(50) DEFAULT NULL,
  `around` varchar(500) DEFAULT NULL COMMENT '周边',
  `traffic` varchar(500) DEFAULT NULL COMMENT '交通',
  `lng` varchar(32) DEFAULT NULL COMMENT '经度',
  `lat` varchar(32) DEFAULT NULL COMMENT '纬度',
  `property_fee` double(10,2) DEFAULT NULL COMMENT '物业费',
  `water_fee` double(10,2) DEFAULT NULL COMMENT '水费',
  `electricity_fee` double(10,2) DEFAULT NULL COMMENT '电费',
  `gas_fee` double(10,2) DEFAULT NULL COMMENT '燃气费',
  `remarks` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of village
-- ----------------------------
INSERT INTO `village` VALUES ('1', '同乐花苑', '广东省', '广州市', '天河区', '12346478', '荷光路', null, null, '123.546747', '22.456747', '2.00', '3.00', '4.00', '5.00', null);
