package com.dk.pojo;

/**
 * @ClassName School
 * @Description TODO
 * @Author BinGo
 * @Date 2020/12/3 19:20
 * @Version 1.0
 **/
public class School {

    private Integer schoolId;

    private String schoolName;

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolId=" + schoolId +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
