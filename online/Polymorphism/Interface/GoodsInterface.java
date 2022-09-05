package Lesson06.online.Polymorphism.Interface;

import java.util.List;

public interface GoodsInterface {
    String getName();

    String getProducer();

    String getInfo(); //full info: name,producer,country and other

    Double getPrice();

    DepartmentInterface getDepartment(); //будет работать с теми департаментами, которые унаследовались от интерфейча департаметов
//List<? extends DepartmentInterface> getListDepartments();// для того, что бы просматривать какие департаменты у нас существуют
}
