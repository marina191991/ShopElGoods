package Lesson06.online.Polymorphism.goods;

import Lesson06.online.Polymorphism.Interface.DepartmentInterface;
import Lesson06.online.Polymorphism.Interface.GoodsInterface;

import Lesson06.online.Polymorphism.department.ElectronicDepartment;

import java.util.List;

public abstract class ElectroGoods implements GoodsInterface {
    private String name;
    private String producer;
    private String country;
    private Double price;
    private String warranty;
    private String model;
    private String weight;
    private String color;
    private ElectronicDepartment department;



    public void setName(String name) {
        this.name = name;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public void setDepartment(ElectronicDepartment department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "ElectroGoods{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", country='" + country + '\'' +
                ", price=" + price +
                ", warranty='" + warranty + '\'' +
                ", model='" + model + '\'' +
                ", weight='" + weight + '\'' +
                ", color='" + color + '\'' +
                ", department='" + getDepartment() + '\'' +
                                '}';
    }



    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getProducer() {
return this.producer;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }



    @Override
    public String  getInfo() {
return "ElectroGoods{" +
        "name='" + name + '\'' +
        ", producer='" + producer + '\'' +
        ", country='" + country + '\'' +
        ", price=" + Double.toString(price) +
        ", warranty='" + warranty + '\'' +
        ", model='" + model + '\'' +
        ", weight='" + weight + '\'' +
        ", color='" + color + '\'' +
        ", department='" + getDepartment() + '\'' +
        '}';
    }
}
