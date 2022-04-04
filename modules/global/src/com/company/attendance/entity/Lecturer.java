package com.company.attendance.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "ATTENDANCE_LECTURER")
@Entity(name = "attendance_Lecturer")
public class Lecturer extends StandardEntity {
    private static final long serialVersionUID = 6931974109766683903L;

    @Column(name = "LEC_NAME", nullable = false)
    @NotNull
    private String lecName;

    @Column(name = "LEC_ADD", nullable = false)
    @NotNull
    private String lecAdd;

    @JoinTable(name = "ATTENDANCE_CLASS_LECTURER_LINK",
            joinColumns = @JoinColumn(name = "LECTURER_ID"),
            inverseJoinColumns = @JoinColumn(name = "CLASS_ID"))
    @ManyToMany
    private List<Class> classes;

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    public String getLecName() {
        return lecName;
    }

    public void setLecName(String lecName) {
        this.lecName = lecName;
    }

    public String getLecAdd() { return lecAdd; }

    public void setLecAdd(String lecAdd) { this.lecAdd = lecAdd; }
}