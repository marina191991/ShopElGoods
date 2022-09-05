package Lesson06.online.Polymorphism.goods;

import Lesson06.online.Polymorphism.department.ElectronicDepartment;
import Lesson06.online.Polymorphism.department.KitchenElectDepartment;

public class Refrigerator extends ElectroGoods{
private String freezer; //морозильная камера
private String defrosting; //разморозка

    public String getFreezer() {
        return freezer;
    }

    public void setFreezer(String freezer) {
        this.freezer = freezer;
    }

    public String getDefrosting() {
        return defrosting;
    }

    public void setDefrosting(String defrosting) {
        this.defrosting = defrosting;
    }

    public Refrigerator(String name, Double price, KitchenElectDepartment department) {
        this.setName(name);
        this.setPrice(price);
        this.setDepartment(department);
    }
}
