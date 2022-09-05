package Lesson06.online.Polymorphism.Interface;

import java.util.List;

public interface BankInterface {
    String  getName();
    List<? extends EmployerInterface> getEmployerList();


}
