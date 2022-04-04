create table ATTENDANCE_CLASS_STUDENT_LINK (
    CLASS_ID uuid,
    STUDENT_ID uuid,
    primary key (CLASS_ID, STUDENT_ID)
);
