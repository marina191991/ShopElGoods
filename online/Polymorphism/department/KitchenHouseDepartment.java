package Lesson06.online.Polymorphism.department;

import Lesson06.online.Polymorphism.Interface.DepartmentInterface;

import java.util.List;

public class KitchenHouseDepartment extends HouseholdDepartment{
    List<KitchenHouseDepartment> kitchenHouseDepartmentList;
    public KitchenHouseDepartment(String name) {
        this.setName(name);
    }

    @Override
    public String toString() {
        return "KitchenHouseDepartment{} " + getName();
    }



}
