create table ATTENDANCE_CLASS_LECTURER_LINK (
    LECTURER_ID uuid,
    CLASS_ID uuid,
    primary key (LECTURER_ID, CLASS_ID)
);
