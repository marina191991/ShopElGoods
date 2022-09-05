package Lesson06.online.Polymorphism.goods;

import Lesson06.online.Polymorphism.Interface.DepartmentInterface;
import Lesson06.online.Polymorphism.Interface.GoodsInterface;
import Lesson06.online.Polymorphism.department.HouseholdDepartment;

import java.util.List;

public abstract class HouseholdGoods implements GoodsInterface {
    private String name;
    private String producer;
    private String country;
    private Double price;
    private String warranty;
    private String model;
    private String weight;
    private String material;
    private String color;
    private HouseholdDepartment department;

    protected HouseholdGoods() {
    }


    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }
    public HouseholdGoods(String name, Double price,HouseholdDepartment department) {
        this.name = name;
        this.price=price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getWarranty() {
        return warranty;
    }

    public String getModel() {
        return model;
    }

    public String getWeight() {
        return weight;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDepartment(HouseholdDepartment department) {
        this.department = department;
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
    public String getInfo() {
        return "HouseholdGood{" +
                "name='" + getName() + '\'' +
                ", producer='" + getProducer() + '\'' +
                ", country='" + getCountry() + '\'' +
                ", price=" + Double.toString(getPrice()) +
                ", warranty='" + getWarranty() + '\'' +
                ", model='" + getModel() + '\'' +
                ", weight='" + getWeight() + '\'' +
                ", material='" + getMaterial() + '\'' +
                ", color='" + getColor() + '\'' +
                ", department='" + getDepartment() + '\'' +
                '}';
    }
}
