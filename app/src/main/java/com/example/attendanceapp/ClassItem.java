package com.example.attendanceapp;

public class ClassItem {
    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }

    private String SubjectName;

    public ClassItem(String className, String subjectName) {
        this.className = className;
        SubjectName = subjectName;
    }
}
