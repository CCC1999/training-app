/*==============================================================*/
/* DBMS name:      Sybase SQL Anywhere 12                       */
/* Created on:     2019/12/19 11:41:08                          */
/*==============================================================*/


if exists(select 1 from sys.sysforeignkey where role='FK_NUC_TRAI_USER_ROLE_NUC_TRAI') then
    alter table nuc_train_auth_user
       delete foreign key FK_NUC_TRAI_USER_ROLE_NUC_TRAI
end if;

drop table if exists nuc_train_auth_role;

drop table if exists nuc_train_auth_user;

/*==============================================================*/
/* Table: nuc_train_auth_role                                   */
/*==============================================================*/
create table nuc_train_auth_role 
(
   id                   integer                        not null,
   name                 varchar(100)                   null,
   description          text						   null,
   constraint PK_NUC_TRAIN_AUTH_ROLE primary key clustered (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

comment on table nuc_train_auth_role is 
'系统中的用户所属的角色表';

/*==============================================================*/
/* Table: nuc_train_auth_user                                   */
/*==============================================================*/
create table nuc_train_auth_user 
(
   id                   integer                        not null,
   username             varchar(100)                   null,
   password             varchar(200)                   null,
   role_id              integer                        null,
   status               integer                        null,
   constraint PK_NUC_TRAIN_AUTH_USER primary key clustered (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

comment on table nuc_train_auth_user is 
'系统用户表，主要用来存储用户信息';

alter table nuc_train_auth_user
   add constraint FK_NUC_TRAI_USER_ROLE_NUC_TRAI foreign key (role_id)
      references nuc_train_auth_role (id)
      on update restrict
      on delete restrict;

