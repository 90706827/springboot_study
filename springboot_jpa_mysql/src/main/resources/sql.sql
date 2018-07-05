CREATE TABLE `t_m_user` (
  `id`  int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键' ,
  `user_name`  varchar(64) NOT NULL COMMENT '用户名' ,
  `user_password`  varchar(64) NOT NULL COMMENT '密码' ,
  `user_age`  int UNSIGNED NULL DEFAULT 0 ,
  `user_tel`  varchar(12) NULL COMMENT '手机号' ,
  `user_email`  varchar(128) NULL COMMENT '邮箱' ,
  `user_nick_name`  varchar(64) NULL COMMENT '昵称' ,
  `user_head_portrait`  varchar(128) NULL COMMENT '头像url' ,
  `user_random_key`  varchar(16) NOT NULL COMMENT '随机Key' ,
  `user_create_time`  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间' ,
  PRIMARY KEY (`id`)
)
  ENGINE=InnoDB
  DEFAULT CHARACTER SET=utf8mb4 COLLATE=utf8mb4_general_ci
;

