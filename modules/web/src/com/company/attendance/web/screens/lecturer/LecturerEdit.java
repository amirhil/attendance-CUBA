package com.company.attendance.web.screens.lecturer;

import com.haulmont.cuba.gui.screen.*;
import com.company.attendance.entity.Lecturer;

@UiController("attendance_Lecturer.edit")
@UiDescriptor("lecturer-edit.xml")
@EditedEntityContainer("lecturerDc")
@LoadDataBeforeShow
public class LecturerEdit extends StandardEditor<Lecturer> {
}