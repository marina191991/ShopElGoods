package Lesson06.online.Polymorphism.department;

import Lesson06.online.Polymorphism.Interface.DepartmentInterface;

import java.util.List;

public class KitchenElectDepartment extends ElectronicDepartment{
    List<KitchenElectDepartment> kitchenElectDepartmentList;
    public KitchenElectDepartment(String name) {
        this.setName(name);
    }

    @Override
    public String toString() {
        return "KitchenElectDepartment: " + super.getNameDepartment();
    }



}
