package Lesson06.online.Polymorphism.Interface;

import java.util.List;

public interface DepartmentInterface {
    List<? extends GoodsInterface> getGoodsList();

    String getNameDepartment();
}


