
DROP TABLE IF EXISTS `cs_posion`;
-- ----------------------------
-- Table structure for `cs_staff`
-- ----------------------------
DROP TABLE IF EXISTS `cs_staff`;
CREATE TABLE `cs_staff` (
  `cs_staff_id` varchar(50) NOT NULL COMMENT '员工ID',
  `cs_ehr_staff_id` varchar(50) DEFAULT NULL COMMENT 'EHR_ID',
  `cs_cs_staff_id` varchar(50) DEFAULT NULL COMMENT 'CS_ID',
  `cs_cn_name` varchar(100) DEFAULT NULL COMMENT '中文名',
  `cs_en_name` varchar(100) DEFAULT NULL COMMENT '英文名',
  `cs_phone_number` varchar(50) DEFAULT NULL COMMENT '电话号码',
  `cs_password` varchar(100) DEFAULT NULL COMMENT '密码',
  `cs_mail_box` varchar(100) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`cs_staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `cs_overtime`
-- ----------------------------
DROP TABLE IF EXISTS `cs_overtime`;
CREATE TABLE `cs_overtime` (
  `cs_overtime_id` varchar(50) NOT NULL COMMENT '加班ID',
  `cs_project_id` varchar(50) DEFAULT NULL COMMENT '项目_ID',
  `cs_date` date DEFAULT NULL COMMENT '日期',
  `cs_time` time DEFAULT NULL COMMENT '时间',
  `cs_duration` varchar(10) DEFAULT NULL COMMENT '持续时间',
  `cs_reason` varchar(1000) DEFAULT NULL COMMENT '原因',
  `cs_supervisor_id` varchar(50) DEFAULT NULL COMMENT '主管ID',
  `cs_resource_manager_id` varchar(50) DEFAULT NULL COMMENT '资源经理ID',
  PRIMARY KEY (`cs_overtime_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `cs_leave`
-- ----------------------------
DROP TABLE IF EXISTS `cs_leave`;
CREATE TABLE `cs_leave` (
  `cs_leave_id` varchar(50) NOT NULL COMMENT '离开ID',
  `cs_project_id` varchar(50) DEFAULT NULL COMMENT '项目_ID',
  `cs_leave_type_id` varchar(50) DEFAULT NULL COMMENT '离开类型ID',
  `cs_available_time` varchar(50) DEFAULT NULL COMMENT '可用时间',
  `cs_date` date DEFAULT NULL COMMENT '日期',
  `cs_time` time DEFAULT NULL COMMENT '时间',
  `cs_duration` varchar(10) DEFAULT NULL COMMENT '持续时间',
  `cs_reason` varchar(1000) DEFAULT NULL COMMENT '原因',
  `cs_attachment_id` varchar(50) DEFAULT NULL COMMENT '附件ID',
  `cs_supervisor_id` varchar(50) DEFAULT NULL COMMENT '主管ID',
  `cs_resource_manager_id` varchar(50) DEFAULT NULL COMMENT '资源经理ID',
  PRIMARY KEY (`cs_leave_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `cs_time`
-- ----------------------------
DROP TABLE IF EXISTS `cs_time`;
CREATE TABLE `cs_time` (
  `cs_time_id` varchar(50) NOT NULL COMMENT '工时ID',
  `cs_project_id` varchar(50) DEFAULT NULL COMMENT '项目ID',
  `cs_time_status` varchar(50) DEFAULT NULL COMMENT '工时状态',
  `cs_time_date` date DEFAULT NULL COMMENT '工时日期',
  `cs_duration` varchar(10) DEFAULT NULL COMMENT '持续时间',
  `cs_supervisor_id` varchar(50) DEFAULT NULL COMMENT '主管ID',
  `cs_check_date` date DEFAULT NULL COMMENT '审核日期',
  `cs_check_info` varchar(1000) DEFAULT NULL COMMENT '审核说明',
  PRIMARY KEY (`cs_time_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `cs_project`
-- ----------------------------
DROP TABLE IF EXISTS `cs_project`;
CREATE TABLE `cs_project` (
  `cs_project_id` varchar(50) NOT NULL COMMENT '项目ID',
  `cs_project_name` varchar(100) DEFAULT NULL COMMENT '项目ID',
  PRIMARY KEY (`cs_project_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `cs_staff_project`
-- ----------------------------
DROP TABLE IF EXISTS `cs_staff_project`;
CREATE TABLE `cs_staff_project` (
  `cs_staff_project_id` varchar(50) NOT NULL COMMENT '员工项目ID',
  `cs_project_id` varchar(50) NOT NULL COMMENT '项目ID',
  `cs_staff_id` varchar(50) DEFAULT NULL COMMENT '员工ID',
  PRIMARY KEY (`cs_staff_project_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `cs_position`
-- ----------------------------
DROP TABLE IF EXISTS `cs_position`;
CREATE TABLE `cs_position` (
  `cs_position_id` varchar(50) NOT NULL COMMENT '职位ID',
  `cs_position_name` varchar(100) DEFAULT NULL COMMENT '职位名',
  PRIMARY KEY (`cs_position_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `cs_staff_position`
-- ----------------------------
DROP TABLE IF EXISTS `cs_staff_position`;
CREATE TABLE `cs_staff_position` (
  `cs_staff_position_id` varchar(50) NOT NULL COMMENT '员工职位ID',
  `cs_position_id` varchar(50) NOT NULL COMMENT '职位ID',
  `cs_staff_id` varchar(50) DEFAULT NULL COMMENT '员工ID',
  PRIMARY KEY (`cs_staff_position_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `cs_attachment`
-- ----------------------------
DROP TABLE IF EXISTS `cs_attachment`;
CREATE TABLE `cs_attachment` (
  `cs_attachment_id` varchar(50) NOT NULL COMMENT '附件ID',
  `cs_attachment_name` varchar(100) DEFAULT NULL COMMENT '附件名',
  PRIMARY KEY (`cs_attachment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `cs_staff_attachment`
-- ----------------------------
DROP TABLE IF EXISTS `cs_staff_attachment`;
CREATE TABLE `cs_staff_attachment` (
  `cs_staff_attachment_id` varchar(50) NOT NULL COMMENT '员工附件ID',
  `cs_attachment_id` varchar(50) NOT NULL COMMENT '附件ID',
  `cs_staff_id` varchar(50) DEFAULT NULL COMMENT '员工ID',
  PRIMARY KEY (`cs_staff_attachment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `cs_leave_type`
-- ----------------------------
DROP TABLE IF EXISTS `cs_leave_type`;
CREATE TABLE `cs_leave_type` (
  `cs_leave_type_id` varchar(50) NOT NULL COMMENT '离开类型ID',
  `cs_leave_type_name` varchar(100) DEFAULT NULL COMMENT '离开类型名',
  PRIMARY KEY (`cs_leave_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `cs_available_time`
-- ----------------------------
DROP TABLE IF EXISTS `cs_available_time`;
CREATE TABLE `cs_available_time` (
  `cs_available_time_id` varchar(50) NOT NULL COMMENT '假期类型ID',
  `cs_available_time_name` varchar(100) DEFAULT NULL COMMENT '假期名',
  `cs_available_time_duration` varchar(100) DEFAULT NULL COMMENT '假期时长',
  PRIMARY KEY (`cs_available_time_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `cs_staff_available_time`
-- ----------------------------
DROP TABLE IF EXISTS `cs_staff_available_time`;
CREATE TABLE `cs_staff_available_time` (
  `cs_staff_available_time_id` varchar(50) NOT NULL COMMENT '员工假期ID',
  `cs_available_time_id` varchar(50) NOT NULL COMMENT '假期ID',
  `cs_staff_id` varchar(50) DEFAULT NULL COMMENT '员工ID',
  PRIMARY KEY (`cs_staff_available_time_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

