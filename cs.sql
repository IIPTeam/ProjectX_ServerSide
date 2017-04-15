
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
  `cs_posion_id` varchar(100) DEFAULT NULL COMMENT '职位',
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
  `cs_leave_type_id` varchar(50) DEFAULT NULL COMMENT '离开类型',
  `cs_available_time` varchar(50) DEFAULT NULL COMMENT '有效时间',
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
  `cs_project_id` varchar(50) DEFAULT NULL COMMENT '项目_ID',
  `cs_time_status` varchar(50) DEFAULT NULL COMMENT '工时状态',
  `cs_time_date` date DEFAULT NULL COMMENT '工时日期',
  `cs_duration` varchar(10) DEFAULT NULL COMMENT '持续时间',
  `cs_supervisor_id` varchar(50) DEFAULT NULL COMMENT '主管ID',
  `cs_check_date` date DEFAULT NULL COMMENT '审核结果',
  `cs_check_info` varchar(1000) DEFAULT NULL COMMENT '审核说明',
  PRIMARY KEY (`cs_time_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `cs_project`
-- ----------------------------
DROP TABLE IF EXISTS `cs_project`;
CREATE TABLE `cs_project` (
  `cs_project_id` varchar(50) NOT NULL COMMENT '工时ID',
  `cs_project_name` varchar(50) DEFAULT NULL COMMENT '项目_ID',
  `cs_supervisor_id` varchar(50) DEFAULT NULL COMMENT '主管ID',
  PRIMARY KEY (`cs_project_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `cs_posion`
-- ----------------------------
DROP TABLE IF EXISTS `cs_posion`;
CREATE TABLE `cs_posion` (
  `cs_posion_id` varchar(50) NOT NULL COMMENT '职位ID',
  `cs_posion_name` varchar(50) DEFAULT NULL COMMENT '职位名',
  PRIMARY KEY (`cs_posion_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `cs_attachment`
-- ----------------------------
DROP TABLE IF EXISTS `cs_attachment`;
CREATE TABLE `cs_attachment` (
  `cs_attachment_id` varchar(50) NOT NULL COMMENT '职位ID',
  `cs_attachment_name` varchar(50) DEFAULT NULL COMMENT '职位名',
  PRIMARY KEY (`cs_attachment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `cs_leave_type`
-- ----------------------------
DROP TABLE IF EXISTS `cs_leave_type`;
CREATE TABLE `cs_leave_type` (
  `cs_leave_type_id` varchar(50) NOT NULL COMMENT '离开类型ID',
  `cs_leave_type_name` varchar(50) DEFAULT NULL COMMENT '离开类型名',
  PRIMARY KEY (`cs_leave_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

