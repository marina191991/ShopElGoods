package Lesson06.online.Polymorphism.goods;

import Lesson06.online.Polymorphism.department.ElectronicDepartment;

public class Televisor extends ElectroGoods{
    private String TVcontrol; //пульт
    private String Smart; //наличие смарт

    public String getTVcontrol() {
        return TVcontrol;
    }

    public void setTVcontrol(String TVcontrol) {
        this.TVcontrol = TVcontrol;
    }

    public String getSmart() {
        return Smart;
    }

    public void setSmart(String smart) {
        Smart = smart;
    }

    public Televisor(String name, Double price, ElectronicDepartment department) {
        this.setName(name);
        this.setPrice(price);
        this.setDepartment(department);
    }

}
