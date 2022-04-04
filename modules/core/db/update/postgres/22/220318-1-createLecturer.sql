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
);