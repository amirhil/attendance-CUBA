package com.company.attendance.web.screens.student;

import com.haulmont.cuba.gui.screen.*;
import com.company.attendance.entity.Student;

@UiController("attendance_Student.edit")
@UiDescriptor("student-edit.xml")
@EditedEntityContainer("studentDc")
@LoadDataBeforeShow
public class StudentEdit extends StandardEditor<Student> {
}