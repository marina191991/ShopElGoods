package Lesson06.online.practic;

import java.util.ArrayList;
import java.util.List;

import static javax.swing.UIManager.get;
/*о Generics
Создали три класса Руслан, Вера и Человек.
Человек -класс родитель
Руслан, Вера -дочерние классы от Человека
У каждого дочернего метода переопределен класс jump.
Здесь мы пробуем при помощи метода main понять , как работает обобщение.
Метод main принимает на вход класс Человек , а значит и примет любые ее дочерние классы.
Если объект будет от типа Руслан, то выведется переопределенный метод jump в Руслане
Если объект будет от типа Человек, то выведется родительский метод jump

НО!
Данное использование входящего праметра в методе main, когда мы используем тип Человек и все дочерние типы тоже можно использовать.
Это работает, если мы имеем дело с одиночным объектом.
Если же у нас список обьектов(коллекции), то это уже не работает .
В таком случае, если мы хотим что бы метод обрабатывал и принимал на вход и родителя и дочерние классы,
нужно указывать тип входящего параметра так: List<? extends Human> list.
Если мы укажем вот так: void methodList(List<Human> list), то на вход будет приниматься только объекты типа Человек

*/

public class GenericsPractic { public static void main(String[] args) {
    Ruslan ruslan=new Ruslan();
    ruslan.jump();
    Human ruslan1=new Ruslan();
    ruslan1.jump();
    Human human = new Human();
    GenericsPractic main=new GenericsPractic();
    ChildRus childRus=new ChildRus();
    List<Ruslan> ruslanList=new ArrayList<>();
    ruslanList.add(ruslan);
    List<Human> humanList=new ArrayList<>();
    humanList.add(human);


    main.method(ruslan);
    main.method(ruslan1);
    main.method(human);
    main.method(childRus);
    main.methodList(humanList);
    main.methodList(ruslanList);

}
//метод будет принимать в качестве параметров все типы объектов, унаследованные от Human(включительно его тоже)
void methodList(List<? extends Human> list) {
 list.forEach(hum-> System.out.println(hum));
}
void   method(Human human) {
     human.jump();
}
}
class ChildRus extends Ruslan {
    @Override
    void jump() {
        System.out.println("I'm ChildRus and i can run");
    }
}
class Ruslan extends Human {
    private String  dick;

    @Override
    void jump() {
        System.out.println("I'm Ruslan and i can run");
    }

    @Override
    void speak() {
        System.out.println("I'm Ruslan and i can speak");
    }

    public String getDick() {
        return dick;
    }

    public void setDick(String dick) {
        this.dick = dick;
    }
    //переопределяем метод toString() , что бы можно было выводить в читабельном виде листы с объектами
    @Override
    public String toString() {
        return "Ruslan{" +
                "dick='" + dick + '\'' +
                ", sex='" + sex + '\'' +
                ", name='" + getName() + '\'' +
                '}';
    }
}
class Vera extends Human{
    private String vagina;

    public String getVagina() {
        return vagina;
    }

    public void setVagina(String vagina) {
        this.vagina = vagina;
    }
}
class Human {
    private String name;
    public String sex;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    void jump() {
        System.out.println("I'm human adn i can run");
    }
    void speak() {
        System.out.println("I'm human adn i can speak");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
