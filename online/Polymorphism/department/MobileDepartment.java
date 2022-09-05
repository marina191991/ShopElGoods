package Lesson06.online.Polymorphism.department;


import Lesson06.online.Polymorphism.Interface.DepartmentInterface;

import java.util.List;

public class MobileDepartment extends ElectronicDepartment{

    public MobileDepartment(String name) {
        this.setName(name);
    }


    public String toString() {
        return "MobileDepartment: " + getName();
    }





}
