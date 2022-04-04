package com.company.attendance.web.screens.lecturer;

import com.haulmont.cuba.gui.screen.*;
import com.company.attendance.entity.Lecturer;

@UiController("attendance_Lecturer.browse")
@UiDescriptor("lecturer-browse.xml")
@LookupComponent("lecturersTable")
@LoadDataBeforeShow
public class LecturerBrowse extends StandardLookup<Lecturer> {
}