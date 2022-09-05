package Lesson06.online.Polymorphism.goods;

import Lesson06.online.Polymorphism.department.ElectronicDepartment;
import Lesson06.online.Polymorphism.department.MobileDepartment;

public class Mobile extends ElectroGoods{
private String OS;
private String screenResolution;


public Mobile(String name, Double price, MobileDepartment department) {
        this.setName(name);
        this.setPrice(price);
     this.setDepartment(department);

    }
    public void call() {
        System.out.println("mobile Call");
    }

}
