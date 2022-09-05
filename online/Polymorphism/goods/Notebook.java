package Lesson06.online.Polymorphism.goods;

import Lesson06.online.Polymorphism.department.ElectronicDepartment;

public class Notebook extends ElectroGoods {
    private String screenResolution;
    private String keyboardBacklight;

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getKeyboardBacklight() {
        return keyboardBacklight;
    }

    public void setKeyboardBacklight(String keyboardBacklight) {
        this.keyboardBacklight = keyboardBacklight;
    }

    public Notebook(String name, Double price, ElectronicDepartment department) {
        this.setName(name);
        this.setPrice(price);
        this.setDepartment(department);
    }
}
