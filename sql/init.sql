DROP TABLE IF EXISTS `t_sys_role`;
CREATE TABLE `t_sys_role` (
  `id` varchar(255) NOT NULL COMMENT 'id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_user` varchar(255) DEFAULT NULL COMMENT '更新人',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `delete` tinyint(1) DEFAULT NULL COMMENT '删除状态 0:未删除 1:已删除',
  `role_id` varchar(255) DEFAULT NULL COMMENT '用户id',
  `role_name` varchar(255) DEFAULT NULL COMMENT '资源id',
  `role_state` tinyint(1) DEFAULT NULL COMMENT '0-未锁定,1-已锁定',
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='系统角色信息';

DROP TABLE IF EXISTS `t_sys_user`;
CREATE TABLE `t_sys_user` (
  `id` varchar(255) NOT NULL COMMENT 'id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_user` varchar(255) DEFAULT NULL COMMENT '更新人',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `delete` tinyint(1) DEFAULT NULL COMMENT '删除状态 0:未删除 1:已删除',
  `user_id` varchar(255) DEFAULT NULL COMMENT '用户id',
  `user_name` varchar(255) DEFAULT NULL COMMENT '登录名称',
  `user_password` varchar(255) DEFAULT NULL COMMENT '登录密码',
  `user_state` tinyint(1) DEFAULT NULL COMMENT '用户状态0:启用 1:禁用',
  `salt` varchar(255) DEFAULT NULL COMMENT '盐',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='系统用户基本信息';

DROP TABLE IF EXISTS `t_employee`;
CREATE TABLE `t_employee` (
  `id` varchar(255) NOT NULL COMMENT 'id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_user` varchar(255) DEFAULT NULL COMMENT '更新人',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `delete` tinyint(1) DEFAULT NULL COMMENT '删除状态 0:未删除 1:已删除',
  `employee_id` varchar(255) DEFAULT NULL COMMENT '员工id',
  `employee_name` varchar(255) DEFAULT NULL COMMENT '员工姓名',
  `sex` varchar(255) DEFAULT NULL COMMENT '性别0:male 1:female',
  `employee_title` varchar(255) DEFAULT NULL COMMENT '员工职称',
  `user_id` varchar(255) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='员工基本信息';

DROP TABLE IF EXISTS `t_department`;
CREATE TABLE `t_department` (
  `id` varchar(255) NOT NULL COMMENT 'id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_user` varchar(255) DEFAULT NULL COMMENT '更新人',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `delete` tinyint(1) DEFAULT NULL COMMENT '删除状态 0:未删除 1:已删除',
  `department_id` varchar(255) DEFAULT NULL COMMENT '部门编号',
  `department_name` varchar(255) DEFAULT NULL COMMENT '部门名称',
  `parent_id` varchar(255) DEFAULT NULL COMMENT '父节点',
  `forefather_id` varchar(255) DEFAULT NULL COMMENT '家谱',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='部门基本信息';

DROP TABLE IF EXISTS `t_sys_resource`;
CREATE TABLE `t_sys_resource` (
  `id` varchar(255) NOT NULL COMMENT 'id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_user` varchar(255) DEFAULT NULL COMMENT '更新人',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `delete` tinyint(1) DEFAULT NULL COMMENT '删除状态 0:未删除 1:已删除',
  `resource_id` varchar(255) DEFAULT NULL COMMENT '资源ID',
  `resource_name` varchar(255) DEFAULT NULL COMMENT '资源名称',
  `resource_state` tinyint(1) DEFAULT NULL COMMENT '资源状态  0:启用，1:禁用',
  `resource_type` tinyint(1) DEFAULT NULL COMMENT '资源类型 0:url,1:button',
  `auth_mark` varchar(255) DEFAULT NULL COMMENT '权限标识',
  `parent_id` varchar(255) DEFAULT NULL COMMENT '父资源ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='记录按钮，菜单，权限标识等基础信息';

DROP TABLE IF EXISTS `t_employee_department`;
CREATE TABLE `t_employee_department` (
  `id` varchar(255) NOT NULL COMMENT 'id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_user` varchar(255) DEFAULT NULL COMMENT '更新人',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `delete` tinyint(1) DEFAULT NULL COMMENT '删除状态 0:未删除 1:已删除',
  `employee_id` varchar(255) DEFAULT NULL COMMENT '员工id',
  `department_id` varchar(255) DEFAULT NULL COMMENT '部门id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='员工部门关系表';

DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role` (
  `id` varchar(255) NOT NULL COMMENT 'id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_user` varchar(255) DEFAULT NULL COMMENT '更新人',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `delete` tinyint(1) DEFAULT NULL COMMENT '删除状态 0:未删除 1:已删除',
  `user_id` varchar(255) DEFAULT NULL COMMENT '员工id',
  `role_id` varchar(255) DEFAULT NULL COMMENT '部门id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='用户角色关联';


DROP TABLE IF EXISTS `t_role_resource`;
CREATE TABLE `t_role_resource` (
  `id` varchar(255) NOT NULL COMMENT 'id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建人',
  `update_user` varchar(255) DEFAULT NULL COMMENT '更新人',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `delete` tinyint(1) DEFAULT NULL COMMENT '删除状态 0:未删除 1:已删除',
  `role_id` varchar(255) DEFAULT NULL COMMENT '员工id',
  `resource_id` varchar(255) DEFAULT NULL COMMENT '部门id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='角色资源关联';


