package com.company.attendance.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "ATTENDANCE_STUDENT")
@Entity(name = "attendance_Student")
@NamePattern("%s|name")
public class Student extends StandardEntity {
    private static final long serialVersionUID = -3957694604402049817L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "IC_NUMBER", nullable = false)
    @NotNull
    private String icNumber;

    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false)
    private String phoneNumber;
    @JoinTable(name = "ATTENDANCE_CLASS_STUDENT_LINK",
            joinColumns = @JoinColumn(name = "STUDENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "CLASS_ID"))
    @ManyToMany
    private List<Class> classes;

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    public void setIcNumber(String icNumber) {
        this.icNumber = icNumber;
    }

    public String getIcNumber() {
        return icNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String nameOfStudents(Student student){
        return student.getName();
    }
}