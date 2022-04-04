package com.company.attendance.core;

import com.company.attendance.AttendanceTestContainer;
import com.company.attendance.entity.Lecturer;
import com.company.attendance.entity.Student;
import com.haulmont.cuba.core.entity.contracts.Id;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.testsupport.TestContainer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.junit.jupiter.api.Assertions.*;

// See https://doc.cuba-platform.com/manual-7.2/integration_tests_mw.html

class LecturerTest {

    @RegisterExtension
    static TestContainer container = AttendanceTestContainer.Common.INSTANCE;
    static DataManager dataManager;

    @BeforeAll
    static void beforeAll() {
        dataManager = AppBeans.get(DataManager.class);
    }

    @Test
    void myTestMethod() {
        Lecturer lecturer = container.metadata().create(Lecturer.class);
        lecturer.setLecName("TESTNAME");
        lecturer.setLecAdd("TESTADDRESS");

        Lecturer commitedActivityLog = dataManager.commit(lecturer);
        assertEquals(lecturer,commitedActivityLog);

        Lecturer loadedActivityLog = dataManager.load(Id.of(lecturer)).one();
        assertEquals(lecturer,loadedActivityLog);

        dataManager.remove(loadedActivityLog);

    }
}