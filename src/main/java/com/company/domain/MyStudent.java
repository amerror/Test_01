package com.company.domain;

public class MyStudent {
    private String stuName;
    private int stuAge;
    private String stuEmail;
    private int stuId;

    @Override
    public String toString() {
        return "MyStudent{" +
                "stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuEmail='" + stuEmail + '\'' +
                ", stuId=" + stuId +
                '}';
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }
}
