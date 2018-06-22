/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50635
Source Host           : localhost:3306
Source Database       : laboratorycaiweihua

Target Server Type    : MYSQL
Target Server Version : 50635
File Encoding         : 65001

Date: 2018-04-08 20:29:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `equipment`
-- ----------------------------
DROP TABLE IF EXISTS `equipment`;
CREATE TABLE `equipment` (
  `TID` varchar(100) NOT NULL COMMENT '物品编号',
  `TName` varchar(100) NOT NULL COMMENT '物品名称（设备、物品名称）',
  `TType` int(10) NOT NULL COMMENT '物品类型（设备为1、消耗品为2）',
  `TCount` int(10) NOT NULL COMMENT '物品数量',
  `TClass` varchar(100) NOT NULL COMMENT '物品归属教室（没有归属为0，表示在库房）',
  `TStatus` int(10) NOT NULL COMMENT '物品状态（可使用为1、物品损坏为2）',
  `TSpec` varchar(10) NOT NULL COMMENT '物品规格（毫升等等）',
  `TUnit` varchar(10) NOT NULL COMMENT '单位（台、件等等）',
  `TUse` varchar(255) NOT NULL COMMENT '用途说明',
  `TConfiguration` varchar(255) NOT NULL DEFAULT '' COMMENT '器材配置',
  `TCreatData` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`TID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of equipment
-- ----------------------------
INSERT INTO `equipment` VALUES ('001', '台式电脑', '1', '1', '理工北楼523', '1', '联想', '台', '学生试验用教学电脑', 'c语言环境', '2017-05-11 00:26:33');
INSERT INTO `equipment` VALUES ('002', '台式电脑', '1', '1', '理工北楼523', '1', '联想', '台', '学生试验用教学电脑', 'c语言环境', '2017-05-10 22:40:34');
INSERT INTO `equipment` VALUES ('003', '台式电脑', '1', '1', '理工北楼523', '1', '惠普', '台', '学生试验用教学电脑', 'c语言环境', '2017-05-10 22:40:34');
INSERT INTO `equipment` VALUES ('004', '台式电脑', '1', '1', '理工北楼523', '1', '戴尔', '台', '学生试验用教学电脑', 'c语言环境', '2017-05-14 15:42:53');
INSERT INTO `equipment` VALUES ('005', '台式电脑', '1', '1', '理工北楼523', '1', '惠普', '台', '学生试验用教学电脑', 'c语言环境', '2017-05-10 22:40:34');
INSERT INTO `equipment` VALUES ('006', '台式电脑', '1', '1', '理工北楼523', '1', '戴尔', '台', '教师用授课电脑', 'c语言环境', '2017-05-10 22:40:34');
INSERT INTO `equipment` VALUES ('007', '台式电脑', '1', '1', '理工北楼523', '1', '戴尔', '台', '学生试验用教学电脑', 'c语言环境', '2017-05-14 15:42:52');
INSERT INTO `equipment` VALUES ('008', '台式电脑', '1', '1', '理工北楼421', '1', '惠普', '台', '学生试验用教学电脑', 'c语言环境', '2017-05-14 15:43:14');
INSERT INTO `equipment` VALUES ('009', '台式电脑', '1', '1', '理工北楼421', '1', '戴尔', '台', '学生试验用教学电脑', 'c语言环境', '2017-05-14 16:29:47');
INSERT INTO `equipment` VALUES ('010', '台式电脑', '1', '1', '理工北楼421', '1', '惠普', '台', '教师用授课电脑', 'c语言环境', '2017-05-10 22:40:34');
INSERT INTO `equipment` VALUES ('011', '台式电脑', '1', '1', '理工北楼421', '1', '戴尔', '台', '教师用授课电脑', 'c语言环境', '2017-05-10 22:40:34');
INSERT INTO `equipment` VALUES ('012', '台式电脑', '1', '1', '理工北楼421', '1', '惠普', '台 ', '备用电脑', 'java语言环境', '2017-05-14 14:59:20');
INSERT INTO `equipment` VALUES ('013', '投影仪', '1', '1', '理工北楼421', '2', '惠普', '台', '备用投影仪', 'java语言环境', '2017-05-14 16:29:51');
INSERT INTO `equipment` VALUES ('014', '台式电脑', '1', '1', '理工北楼421', '1', '联想', '台', '学生用实验电脑', 'java语言环境', '2017-05-14 15:42:56');
INSERT INTO `equipment` VALUES ('015', '台式电脑', '1', '1', '理工北楼421', '1', '联想', '台', '学生用实验电脑', 'java语言环境', '2017-05-14 13:22:19');
INSERT INTO `equipment` VALUES ('016', '台式电脑', '1', '1', '理工北楼419', '1', '联想', '台', '学生用实验电脑', 'java c语言配置', '2017-05-14 13:35:00');
INSERT INTO `equipment` VALUES ('017', '台式电脑', '1', '1', '理工北楼419', '1', '华硕', '台', '学生用实验电脑', 'java c语言配置', '2017-05-14 13:34:45');
INSERT INTO `equipment` VALUES ('018', '台式电脑', '1', '1', '理工北楼419', '1', '联想', '台', '学生用实验电脑', 'C语言环境', '2017-05-16 02:26:55');
INSERT INTO `equipment` VALUES ('019', '台式电脑', '1', '1', '理工北楼419', '1', '联想', '台', '学生用实验电脑', 'c语言环境', '2017-05-17 19:44:33');
INSERT INTO `equipment` VALUES ('101', '投影仪', '1', '1', '0', '2', '惠普', '台', '教师用授课投影仪', 'java语言环境', '2017-05-14 15:42:48');
INSERT INTO `equipment` VALUES ('102', '投影仪', '1', '1', '0', '2', '索尼', '台', '教师用授课投影仪', 'java语言环境', '2017-05-10 22:40:34');
INSERT INTO `equipment` VALUES ('103', '显示器', '1', '1', '0', '2', '东芝显示器', '台', '作为备用显示器使用', 'java语言环境', '2017-05-14 15:43:30');
INSERT INTO `equipment` VALUES ('104', '投影仪', '1', '1', '理工北楼419', '1', '惠普', '台 ', '备用投影仪', 'java语言环境', '2017-05-14 15:42:50');
INSERT INTO `equipment` VALUES ('105', '投影仪', '1', '1', '理工北楼419', '1', '东芝', '台', '备用投影仪', 'java语言环境', '2017-05-14 15:01:04');
INSERT INTO `equipment` VALUES ('106', '显示器', '1', '1', '理工北楼419', '2', '戴尔', '台', '教师用显示器', 'java语言环境', '2017-05-14 13:16:30');
INSERT INTO `equipment` VALUES ('107', '投影仪', '1', '1', '0', '2', '联想', '台', '教师用备用投影仪', 'java语言环境', '2017-05-14 16:47:49');

-- ----------------------------
-- Table structure for `recording`
-- ----------------------------
DROP TABLE IF EXISTS `recording`;
CREATE TABLE `recording` (
  `uid` varchar(255) NOT NULL COMMENT '用户id',
  `uname` varchar(255) NOT NULL COMMENT '用户姓名',
  `TID` varchar(255) NOT NULL COMMENT '物品编号',
  `TName` varchar(255) NOT NULL COMMENT '物品名称（设备、物品名称）',
  `TUpdateData` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '操作时间',
  `notes` varchar(255) NOT NULL COMMENT '操作记录'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recording
-- ----------------------------
INSERT INTO `recording` VALUES ('1000', '主管蔡伟华', '106', '显示器', '2018-04-08 20:27:30', '报修');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` varchar(100) NOT NULL COMMENT '用户id（登录账号）',
  `upwd` varchar(100) NOT NULL COMMENT '用户密码',
  `uname` varchar(100) NOT NULL COMMENT '用户姓名',
  `upriority` int(2) NOT NULL COMMENT '用户权限（管理员1/普通用户2）',
  `usex` int(2) NOT NULL COMMENT '男1女2',
  `uidcard` varchar(100) NOT NULL COMMENT '身份证编号',
  `uposition` varchar(100) NOT NULL COMMENT '职位',
  `umajor` varchar(100) NOT NULL COMMENT '专业系别',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1000', '123456', '主管蔡伟华', '1', '2', '620503199401301354', '主管', '信息学院');
INSERT INTO `user` VALUES ('1001', '123456', '管理员小A', '1', '2', '620124199102121542', '实验室管理员', '信息学院');
INSERT INTO `user` VALUES ('1002', '123456', '管理员小B', '1', '1', '320156198812120021', '实验室管理员', '软件学院');
INSERT INTO `user` VALUES ('1003', '123456', '管理员小C', '1', '2', '100125198511240124', '实验室管理员', '机械学院');
INSERT INTO `user` VALUES ('1004', '123456', '管理员小D', '1', '1', '425434195610023545', '实验室管理员', '材料学院');
INSERT INTO `user` VALUES ('2001', '111111', '教师A', '2', '2', '112353195911024533', '授课教师', '机械学院');
INSERT INTO `user` VALUES ('2002', '111111', '教师B', '2', '2', '511922197507114454', '授课教师', '材料学院');
INSERT INTO `user` VALUES ('2003', '111111', '教师C', '2', '1', '510724197704239468', '授课教师', '信息学院');
INSERT INTO `user` VALUES ('2004', '111111', '实验员A', '2', '2', '150783197605106726', '实验室老师', '软件学院');
INSERT INTO `user` VALUES ('2005', '111111', '实验员B', '2', '2', '610521197709067865', '实验室老师', '电气学院');
INSERT INTO `user` VALUES ('2006', '111111', '实验员C', '2', '1', '44142219920513260X', '实验室老师', '电气学院');
INSERT INTO `user` VALUES ('2007', '111111', '教师D', '2', '2', '450125197504254468	', '授课教师', '机械学院');
INSERT INTO `user` VALUES ('2008', '111111', '实验员D', '2', '1', '340711198502201649', '实验室教师', '信息学院');
INSERT INTO `user` VALUES ('2009', '123456', '实验员王尼玛', '2', '1', '45060119800318479X', '授课教师', '电气学院');
INSERT INTO `user` VALUES ('2010', '123456', '实验员小钱', '2', '1', '651230199410011235', '教师', '信息学院');
