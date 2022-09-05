package Lesson06.online.Polymorphism.department;

import Lesson06.online.Polymorphism.Interface.DepartmentInterface;
import Lesson06.online.Polymorphism.Interface.GoodsInterface;

import java.util.List;

public abstract class AbstractDepartment implements DepartmentInterface {
    private String name;
    private List<? extends GoodsInterface> goodsList;




    public void setGoodsList(List<? extends GoodsInterface> goodsList) {
        this.goodsList = goodsList;
    }

    public AbstractDepartment() {
    }

       public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public List<? extends GoodsInterface> getGoodsList() {
        return goodsList;
    }

    @Override
    public String getNameDepartment() {
        return getName();
    }

    @Override
    public String toString() {
        return  getName() ;
    }

    public static void getListDepart(List<? extends DepartmentInterface> list) {
        list.forEach(d-> System.out.println(d));
    }

    public static void getListAllListDepart(List<List<? extends DepartmentInterface>> list) {
        list.forEach(d-> System.out.println(d));
    }
}
