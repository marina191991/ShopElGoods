package Lesson06.online.Polymorphism.goods;

import Lesson06.online.Polymorphism.Interface.DepartmentInterface;
import Lesson06.online.Polymorphism.department.KitchenHouseDepartment;

public class Knife extends HouseholdGoods{

    public Knife(String name, Double price, KitchenHouseDepartment department) {
        this.setName(name);
        this.setPrice(price);
        this.setDepartment(department);
    }


}
