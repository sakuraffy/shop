drop database if exists shop;
/*创建数据库，并设置编码*/
create database shop default character set utf8;

use shop;

/*删除管理员表*/
drop table if exists t_account;

/*============================*/
/*      Table：管理员表结构   */
/*============================*/
create table t_account
(
	/* 管理员编号，自动增长 */
	id int primary key not null auto_increment,
	/* 管理员登录名 */
	login varchar(20),
	/* 管理员姓名 */
	name varchar(20),
	/* 管理员密码 */
	pass varchar(20)
);


/*删除商品类别表*/
drop table if exists t_category;

/*============================*/
/*     Table：商品类别表结构  */
/*============================*/
create table t_category
(
   /* 类别编号，自动增长 */
   id  int primary key not null auto_increment,
   /* 类别名称 */
   type varchar(20),
   /* 类别是否为热点类别，热点类别才有可能显示在首页*/
   hot  bool default false,
   /* 外键，此类别由哪位管理员管理 */
   aid int,
   constraint aid_FK foreign key(aid) references t_account(id)
);