package com.company.attendance.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "ATTENDANCE_CLASS")
@Entity(name = "attendance_Class")
public class Class extends StandardEntity {
    private static final long serialVersionUID = -1933764302915158844L;

    @Column(name = "CLASS_NAME", nullable = false)
    @NotNull
    private String className;

    @JoinTable(name = "ATTENDANCE_CLASS_STUDENT_LINK",
            joinColumns = @JoinColumn(name = "CLASS_ID"),
            inverseJoinColumns = @JoinColumn(name = "STUDENT_ID"))
    @ManyToMany
    private List<Student> student;

    @JoinTable(name = "ATTENDANCE_CLASS_LECTURER_LINK",
            joinColumns = @JoinColumn(name = "CLASS_ID"),
            inverseJoinColumns = @JoinColumn(name = "LECTURER_ID"))
    @ManyToMany
    private List<Lecturer> lecturer;

    public List<Lecturer> getLecturer() {
        return lecturer;
    }

    public void setLecturer(List<Lecturer> lecturer) {
        this.lecturer = lecturer;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}