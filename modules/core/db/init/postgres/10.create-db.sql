-- begin ATTENDANCE_STUDENT
create table ATTENDANCE_STUDENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    IC_NUMBER varchar(255) not null,
    PHONE_NUMBER varchar(255) not null,
    --
    primary key (ID)
)^
-- end ATTENDANCE_STUDENT
-- begin ATTENDANCE_CLASS
create table ATTENDANCE_CLASS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CLASS_NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end ATTENDANCE_CLASS
-- begin ATTENDANCE_LECTURER
create table ATTENDANCE_LECTURER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    LEC_NAME varchar(255) not null,
    LEC_ADD varchar(255) not null,
    --
    primary key (ID)
)^
-- end ATTENDANCE_LECTURER
-- begin ATTENDANCE_CLASS_STUDENT_LINK
create table ATTENDANCE_CLASS_STUDENT_LINK (
    CLASS_ID uuid,
    STUDENT_ID uuid,
    primary key (CLASS_ID, STUDENT_ID)
)^
-- end ATTENDANCE_CLASS_STUDENT_LINK
-- begin ATTENDANCE_CLASS_LECTURER_LINK
create table ATTENDANCE_CLASS_LECTURER_LINK (
    LECTURER_ID uuid,
    CLASS_ID uuid,
    primary key (LECTURER_ID, CLASS_ID)
)^
-- end ATTENDANCE_CLASS_LECTURER_LINK
