package com.company.attendance.core;

import com.company.attendance.AttendanceTestContainer;
import com.company.attendance.entity.Student;
import com.haulmont.cuba.core.entity.contracts.Id;
import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.testsupport.TestContainer;
import mockit.Mocked;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import javax.xml.crypto.Data;
import java.awt.*;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

// See https://doc.cuba-platform.com/manual-7.2/integration_tests_mw.html

class StudentTest {

    private Student student;

    @RegisterExtension
    static TestContainer container = AttendanceTestContainer.Common.INSTANCE;
    static DataManager dataManager;

    @BeforeAll
    static void beforeAll() {
        dataManager = AppBeans.get(DataManager.class);
    }

    @Test
    void myTestMethod() {

        Student student = container.metadata().create(Student.class);
        student.setName("TEST");
        student.setIcNumber("000000000000");
        student.setPhoneNumber("012223312313");

        Student commitedActivityLog = dataManager.commit(student);
        assertEquals(student,commitedActivityLog);

        Student loadedActivityLog = dataManager.load(Id.of(student)).one();
        assertEquals(student,loadedActivityLog);

        dataManager.remove(loadedActivityLog);

    }
}