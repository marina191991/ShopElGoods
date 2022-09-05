package Lesson06.online.Polymorphism.employe;

import Lesson06.online.Polymorphism.Interface.BankInterface;
import Lesson06.online.Polymorphism.Interface.EmployerInterface;

import java.util.List;

public class AbstractEmployer implements EmployerInterface {
    private String name;



    public AbstractEmployer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' ;
    }
}
