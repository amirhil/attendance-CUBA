-- begin ATTENDANCE_CLASS_STUDENT_LINK
alter table ATTENDANCE_CLASS_STUDENT_LINK add constraint FK_CLASTU_ON_CLASS foreign key (CLASS_ID) references ATTENDANCE_CLASS(ID)^
alter table ATTENDANCE_CLASS_STUDENT_LINK add constraint FK_CLASTU_ON_STUDENT foreign key (STUDENT_ID) references ATTENDANCE_STUDENT(ID)^
-- end ATTENDANCE_CLASS_STUDENT_LINK
-- begin ATTENDANCE_CLASS_LECTURER_LINK
alter table ATTENDANCE_CLASS_LECTURER_LINK add constraint FK_CLALEC_ON_LECTURER foreign key (LECTURER_ID) references ATTENDANCE_LECTURER(ID)^
alter table ATTENDANCE_CLASS_LECTURER_LINK add constraint FK_CLALEC_ON_CLASS foreign key (CLASS_ID) references ATTENDANCE_CLASS(ID)^
-- end ATTENDANCE_CLASS_LECTURER_LINK
