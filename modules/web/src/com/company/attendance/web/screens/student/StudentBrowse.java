package com.company.attendance.web.screens.student;

import com.haulmont.cuba.gui.screen.*;
import com.company.attendance.entity.Student;

@UiController("attendance_Student.browse")
@UiDescriptor("student-browse.xml")
@LookupComponent("studentsTable")
@LoadDataBeforeShow
public class StudentBrowse extends StandardLookup<Student> {
}