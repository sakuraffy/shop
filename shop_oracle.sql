create table t_account
(
	/* 管理员编号，自动增长 */
	id number primary key,
	/* 管理员登录名 */
	login varchar2(20),
	/* 管理员姓名 */
	name varchar2(20),
	/* 管理员密码 */
	pass varchar2(20)
);

insert into t_account(id,login,name,pass) values(1,'oadmin','管理员','oadmin');
insert into t_account(id,login,name,pass) values(2,'ouser','客服A','ouser');

commit;