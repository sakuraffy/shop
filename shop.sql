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

/*插入测试用例*/
insert into t_account(login,name,pass) values('admin','管理员','admin');
insert into t_account(login,name,pass) values('user','客服A','user');


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

/* 商品类别测试数据 */
INSERT INTO t_category (type,hot,aid) VALUES ('男士休闲',true,1);
INSERT INTO t_category (type,hot,aid) VALUES ('女士休闲',true,1);
INSERT INTO t_category (type,hot,aid) VALUES ('儿童休闲',true,2);
INSERT INTO t_category (type,hot,aid) VALUES ('老人休闲',true,2);


drop table if exists t_produce;

/*=============================*/  
/* Table: 商品表结构            		*/  
/*=============================*/  
create table t_product  
(  
   /* 商品编号,自动增长 */  
   id                  int primary key not null auto_increment,  
   /* 商品名称 */  
   name                varchar(20),  
   /* 商品价格 */  
   price               decimal(8,2),  
   /* 商品图片 */  
   pic                 varchar(200),  
   /* 商品简单介绍 */  
   remark              longtext,  
   /* 商品详细介绍 */  
   xremark             longtext,  
   /* 商品生产日期 */  
   date                timestamp default CURRENT_TIMESTAMP,  
   /* 是否为推荐商品,推荐商品才有可能显示在商城首页 */  
   commend             bool,  
   /* 是否为有效商品,有效商品才有可能显示在商城首页 */  
   open                bool,  
   /* 商品所在的类别编号*/  
   cid                  int,  
   constraint cid_FK foreign key(cid) references t_category(id)  
);

/* 商品测试数据 */
INSERT INTO t_product (name,price,pic,remark,xremark,commend,open,cid) VALUES 
('圣得西服',2999.00,'test.jpg','这里是简单介绍','这里是详细介绍',true,true,1);

INSERT INTO t_product (name,price,pic,remark,xremark,commend,open,cid) VALUES 
('罗蒙西服',1999.00,'test.jpg','这里是简单介绍','这里是详细介绍',true,true,1);

INSERT INTO t_product (name,price,pic,remark,xremark,commend,open,cid) VALUES 
('衫衫西服',3999.00,'test.jpg','这里是简单介绍','这里是详细介绍',true,true,1);

INSERT INTO t_product (name,price,pic,remark,xremark,commend,open,cid) VALUES 
('金利来西服',4999.00,'test.jpg','这里是简单介绍','这里是详细介绍',true,true,1);

INSERT INTO t_product (name,price,pic,remark,xremark,commend,open,cid) VALUES 
('韩版女装',199.00,'test.jpg','这里是简单介绍','这里是详细介绍',true,true,2);

INSERT INTO t_product (name,price,pic,remark,xremark,commend,open,cid) VALUES 
('雪地靴',299.00,'test.jpg','这里是简单介绍','这里是详细介绍',true,true,2);

INSERT INTO t_product (name,price,pic,remark,xremark,commend,open,cid) VALUES 
('欧版女装',3999.00,'test.jpg','这里是简单介绍','这里是详细介绍',true,true,2);

INSERT INTO t_product (name,price,pic,remark,xremark,commend,open,cid) VALUES 
('女款手套',4999.00,'test.jpg','这里是简单介绍','这里是详细介绍',true,true,2);

INSERT INTO t_product (name,price,pic,remark,xremark,commend,open,cid) VALUES 
('佳能单反机',3998.00,'test.jpg','这里是简单介绍','这里是详细介绍',true,true,3);

INSERT INTO t_product (name,price,pic,remark,xremark,commend,open,cid) VALUES 
('金士顿优盘',299.00,'test.jpg','这里是简单介绍','这里是详细介绍',true,true,3);

INSERT INTO t_product (name,price,pic,remark,xremark,commend,open,cid) VALUES 
('日立硬盘',599.00,'test.jpg','这里是简单介绍','这里是详细介绍',true,true,3);

INSERT INTO t_product (name,price,pic,remark,xremark,commend,open,cid) VALUES 
('大水牛机箱',399.00,'test.jpg','这里是简单介绍','这里是详细介绍',true,true,3);

INSERT INTO t_product (name,price,pic,remark,xremark,commend,open,cid) VALUES 
('电脑桌',150.00,'test.jpg','这里是简单介绍','这里是详细介绍',true,true,4);

INSERT INTO t_product (name,price,pic,remark,xremark,commend,open,cid) VALUES 
('老板椅',199.00,'test.jpg','这里是简单介绍','这里是详细介绍',true,true,4);

INSERT INTO t_product (name,price,pic,remark,xremark,commend,open,cid) VALUES 
('空调',3599.00,'test.jpg','这里是简单介绍','这里是详细介绍',true,true,4);

INSERT INTO t_product (name,price,pic,remark,xremark,commend,open,cid) VALUES 
('电视',699.00,'test.jpg','这里是简单介绍','这里是详细介绍',true,true,4);

/*============================*/
/* Table: 用户表结构 		      */
/*============================*/
create table t_user
(
   /* 用户编号,自动增长 */
   id                  int primary key not null auto_increment,
   /* 用户登录名 */
   login               varchar(20),
   /* 用户真实姓名 */
   name                varchar(20),
   /* 用户登录密码 */
   pass                varchar(20),
   /* 用户性别 */
   sex                 varchar(20),
   /* 用户电话 */
   phone               varchar(20),
   /* 用户Email */
   email               varchar(20)
);

/*插入用例*/
insert into t_account(login,name,pass) values('admin','管理员','admin');
insert into t_account(login,name,pass) values('user','客服A','user');

/*=============================*/
/* Table: 订单状态表结构 		       */
/*=============================*/
create table t_status
(
   /* 状态编号,自动增长 */
   id                  int primary key not null auto_increment,
   /* 订单状态 */
   status               varchar(10)
);

/*插入状态测试用例*/
INSERT INTO t_status (status) VALUES ('未支付');
INSERT INTO t_status (status) VALUES ('已支付');
INSERT INTO t_status (status) VALUES ('配送中');
INSERT INTO t_status (status) VALUES ('订单完成');

/*=============================*/
/* Table: 购物车（订单）表结构		   */
/*=============================*/
create table t_forder
(
   /* 订单编号,自动增长 */
   id                  int primary key not null auto_increment,
   /* 收件人名字 */
   name                varchar(20),
   /* 收件人电话 */
   phone               varchar(20),
   /* 配送信息 */
   remark              varchar(20),
   /* 下单日期 */
   date                timestamp default CURRENT_TIMESTAMP,
   /* 订单总金额 */
   total               decimal(8,2),
   /* 收件人邮编 */
   post                varchar(20),
    /* 收件人邮编 */
   address             varchar(200),
   /* 订单状态 */
   sid                 int default 1,
   /* 会员编号 */
   uid                 int,
   constraint sid_FK foreign key(sid) references t_status(id),
   constraint uid_FK foreign key(uid) references t_user(id)
);

/* 修改自动增长的初始值 */
ALTER TABLE t_forder AUTO_INCREMENT = 201610001;

/*插入购物车测试用例*/
INSERT INTO t_forder (name,phone,remark,date,total,address,post,uid) VALUES ('bb','123','备注',default,200.3,'广州天河区','1000',1);
INSERT INTO t_forder (name,phone,remark,date,total,address,post,uid) VALUES ('bb','123','备注',default,200.3,'上海嘉定区','1000',2);
INSERT INTO t_forder (name,phone,remark,date,total,address,post,uid) VALUES ('bb','123','备注',default,200.3,'上海宝山区','1000',2);

/*=============================*/
/* Table: 购物项表结构 		       */
/*=============================*/

create table t_sorder
(
   /* 购物项编号,自动增长 */
   id                  int primary key not null auto_increment,
   /* 被购买商品的名称 */
   name                varchar(20),
   /* 购买时商品的价格 */
   price               decimal(8,2),
   /* 购买的数量 */
   number              int not null,
   /* 所属商品编号 */
   pid                  int,
   /* 此订单项,所属的订单编号 */
   fid                  int,
   constraint pid_FK foreign key(pid) references t_product(id),
   constraint fid_FK foreign key(fid) references t_forder(id)
);

/*插入购物车项测试用例*/
INSERT INTO t_sorder (name,price,number,pid,fid) VALUES ('空调',200,3,15,201610001);
INSERT INTO t_sorder (name,price,number,pid,fid) VALUES ('电视',0.3,5,16,201610001);
INSERT INTO t_sorder (name,price,number,pid,fid) VALUES ('杉杉西服',0.3,7,3,201610003);
INSERT INTO t_sorder (name,price,number,pid,fid) VALUES ('圣德西服',0.3,12,1,201610003);
INSERT INTO t_sorder (name,price,number,pid,fid) VALUES ('韩版女装',0.3,20,5,201610003);
INSERT INTO t_sorder (name,price,number,pid,fid) VALUES ('雪地靴',0.3,10,6,201610003);
INSERT INTO t_sorder (name,price,number,pid,fid) VALUES ('欧版女装',0.3,9,7,201610003);