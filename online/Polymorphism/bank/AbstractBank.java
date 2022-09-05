package Lesson06.online.Polymorphism.bank;

import Lesson06.online.Polymorphism.Interface.BankInterface;
import Lesson06.online.Polymorphism.Interface.EmployerInterface;
import java.util.List;

public abstract class AbstractBank implements BankInterface {
    private String name;
    private double creditVolume;//кредитная ставка
    private List<BankInterface> bankList;
    private boolean installment;//рассрочка
    List<? extends EmployerInterface> employerList;


    public double getCreditVolume() {
        return creditVolume;
    }

    public void setCreditVolume(double creditVolume) {
        this.creditVolume = creditVolume;
    }

    public boolean isInstallment() {
        return installment;
    }

    public void setInstallment(boolean installment) {
        this.installment = installment;
    }


    public AbstractBank(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public List<? extends EmployerInterface> setEmployerList(List<EmployerInterface> employerList) {
        return this.employerList = employerList;
    }

    @Override
    public List<? extends EmployerInterface> getEmployerList() {
        return this.employerList;
    }


    public void setEmployer(List<? extends EmployerInterface> employerList) {
        this.employerList = employerList;
    }


}
