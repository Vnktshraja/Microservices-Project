package com.dev.user.ValueObject;

import com.dev.user.entity.MyUser;

public class TemplateValueObject {

    private Department department;
    private MyUser myUser;

    public TemplateValueObject() {
    }

    public TemplateValueObject(Department department, MyUser myUser) {
        this.department = department;
        this.myUser = myUser;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public MyUser getMyUser() {
        return myUser;
    }

    public void setMyUser(MyUser myUser) {
        this.myUser = myUser;
    }

    @Override
    public String toString() {
        return "TemplateValueObject{" +
                "department=" + department +
                ", myUser=" + myUser +
                '}';
    }
}
