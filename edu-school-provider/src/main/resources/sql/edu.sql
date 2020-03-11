/*
Navicat MySQL Data Transfer

Source Server         : 本机
Source Server Version : 50717
Source Host           : 127.0.0.1:3306
Source Database       : edu

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-03-11 17:07:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `edu_class`
-- ----------------------------
DROP TABLE IF EXISTS `edu_class`;
CREATE TABLE `edu_class` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '班级表',
  `schoolId` int(11) DEFAULT NULL COMMENT '学校id',
  `enterYear` int(11) DEFAULT NULL COMMENT '如学年份',
  `className` varchar(255) DEFAULT NULL COMMENT '班级名称',
  `classMasterId` int(11) DEFAULT NULL COMMENT '班级id',
  `createTeacherId` int(11) DEFAULT NULL COMMENT '创建老师id',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifyTeacherId` int(11) DEFAULT NULL COMMENT '修改老师id',
  `modifyTime` datetime DEFAULT NULL COMMENT '修改时间',
  `isdel` bit(1) DEFAULT NULL COMMENT '0正常 1删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of edu_class
-- ----------------------------

-- ----------------------------
-- Table structure for `edu_course`
-- ----------------------------
DROP TABLE IF EXISTS `edu_course`;
CREATE TABLE `edu_course` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '开设课程表',
  `courseName` varchar(50) DEFAULT NULL COMMENT '班级名称',
  `schoolId` int(11) DEFAULT NULL COMMENT '学校id',
  `createTeacherId` int(11) DEFAULT NULL COMMENT '创建老师id',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifyTeacherId` int(11) DEFAULT NULL COMMENT '修改老师id',
  `modifyTime` datetime DEFAULT NULL COMMENT '修改时间',
  `isdel` bit(1) DEFAULT NULL COMMENT '0正常1删除',
  `desc` text COMMENT '课程描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of edu_course
-- ----------------------------

-- ----------------------------
-- Table structure for `edu_course_class_teacher`
-- ----------------------------
DROP TABLE IF EXISTS `edu_course_class_teacher`;
CREATE TABLE `edu_course_class_teacher` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '班级课程老师关联表',
  `courseId` int(11) DEFAULT NULL COMMENT '课程id',
  `classId` int(11) DEFAULT NULL COMMENT '班级id',
  `teacherId` int(11) DEFAULT NULL COMMENT '老师id',
  `createTeacherId` int(11) DEFAULT NULL COMMENT '创建老师id',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifyTeacherId` int(11) DEFAULT NULL COMMENT '修改老师id',
  `modifyTime` datetime DEFAULT NULL COMMENT '修改时间',
  `isdel` bit(1) DEFAULT NULL COMMENT '0正常1删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of edu_course_class_teacher
-- ----------------------------

-- ----------------------------
-- Table structure for `edu_course_teacher`
-- ----------------------------
DROP TABLE IF EXISTS `edu_course_teacher`;
CREATE TABLE `edu_course_teacher` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '课程老师对应表',
  `teacherId` int(11) DEFAULT NULL COMMENT '老师id',
  `courseId` int(11) DEFAULT NULL COMMENT '课程id',
  `schoolId` int(11) DEFAULT NULL COMMENT '学校id',
  `createTeacherId` int(11) DEFAULT NULL COMMENT '创建老师id',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifyTeacherId` int(11) DEFAULT NULL COMMENT '修改老师id',
  `modifyTime` datetime DEFAULT NULL COMMENT '修改时间',
  `isdel` bit(1) DEFAULT NULL COMMENT '0正常1删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of edu_course_teacher
-- ----------------------------

-- ----------------------------
-- Table structure for `edu_school`
-- ----------------------------
DROP TABLE IF EXISTS `edu_school`;
CREATE TABLE `edu_school` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '学校表',
  `name` varchar(20) DEFAULT NULL COMMENT '学校名称',
  `province` varchar(50) DEFAULT NULL COMMENT '省',
  `city` varchar(50) DEFAULT NULL COMMENT '市',
  `area` varchar(50) DEFAULT NULL COMMENT '区',
  `address` varchar(50) DEFAULT NULL COMMENT '详细地址',
  `webUrl` text COMMENT '官网地址',
  `wxAppName` varchar(20) DEFAULT NULL COMMENT '公众号名称',
  `wxAppId` varchar(20) DEFAULT NULL COMMENT '公众号appId',
  `wxSecret` varchar(50) DEFAULT NULL COMMENT '公众号secret',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `createAdmin` int(11) DEFAULT NULL COMMENT '创建管理员',
  `modifyTime` datetime DEFAULT NULL COMMENT '修改时间',
  `modifyAdmin` int(11) DEFAULT NULL COMMENT '修改管理员',
  `isdel` bit(1) DEFAULT b'0' COMMENT '0正常 1 删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of edu_school
-- ----------------------------
INSERT INTO `edu_school` VALUES ('1', '12', '1', '1', '1', '1', '1', '1', '1', '1', '2020-03-10 10:58:37', '1', '2020-03-10 10:58:40', '1', '');
