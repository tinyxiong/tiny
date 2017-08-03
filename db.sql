CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL COMMENT '用户名',
  `password` varchar(32) NOT NULL COMMENT '密码',
  `phone` varchar(18) DEFAULT NULL COMMENT '联系号码',
  `enabled` tinyint(4) DEFAULT '1' COMMENT '是否有效，0：无效， 1有效',
  `org_id` int(11) NOT NULL COMMENT '归属组织架构',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `c_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `u_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

