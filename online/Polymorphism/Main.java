package Lesson06.online.Polymorphism;

import Lesson06.online.Polymorphism.Interface.BankInterface;
import Lesson06.online.Polymorphism.Interface.DepartmentInterface;
import Lesson06.online.Polymorphism.Interface.EmployerInterface;
import Lesson06.online.Polymorphism.Interface.GoodsInterface;
import Lesson06.online.Polymorphism.bank.Sberbank;
import Lesson06.online.Polymorphism.bank.Tinkoff;
import Lesson06.online.Polymorphism.bank.VTB;
import Lesson06.online.Polymorphism.department.AbstractDepartment;
import Lesson06.online.Polymorphism.department.KitchenElectDepartment;
import Lesson06.online.Polymorphism.department.MobileDepartment;
import Lesson06.online.Polymorphism.employe.Employer;
import Lesson06.online.Polymorphism.goods.ElectroGoods;
import Lesson06.online.Polymorphism.goods.Mobile;
import Lesson06.online.Polymorphism.goods.Refrigerator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MobileDepartment> mobileDepartmentList = new ArrayList<>();
        List<KitchenElectDepartment> kitchenElectDepartmentList = new ArrayList<>();
           /*Televisor televisor=new Televisor("Samsung",25000.00);
           Mobile mobile=new Mobile("Apple",19400.99);
           Knife knife=new Knife("Kaufman",2000.00);
           List<ElectroGoods> electroGoodsList = new ArrayList<>();
           electroGoodsList.add(televisor);
           electroGoodsList.add(mobile);
           electroGoodsList.forEach(g-> System.out.println(g));
           System.out.println(televisor.getInfo());
           System.out.println( televisor.getName());
           System.out.println(mobile.getPrice());*/
       List<List<? extends DepartmentInterface>> allListDep = new ArrayList<>();

        List<Mobile> listMobile = new ArrayList<>();
        List<Refrigerator> listRefr = new ArrayList<>();
        List<BankInterface> bankInterfaceList=new ArrayList<>();


     /*    MobileDepartment mobileDepartment = new MobileDepartment("Mobile_Android");
        MobileDepartment mobileDepartment1 = new MobileDepartment("Mobile_IOS");
        MobileDepartment mobileDepartment2 = new MobileDepartment("Mobile_");
        GoodsInterface mobile = new Mobile("Huawei", 30400.99, mobileDepartment);
        Mobile mobile1 = new Mobile("Apple", 19400.99, mobileDepartment1);

        mobileDepartmentList.add(mobileDepartment);
        mobileDepartmentList.add(mobileDepartment1);



        KitchenElectDepartment kitchenERefrigSamsung = new KitchenElectDepartment("Refrigeration Samsung");
        Refrigerator refrigerator = new Refrigerator("Samsung", 50000.00, kitchenERefrigSamsung);
        Refrigerator refrigerator1 = new Refrigerator("LG", 56000.00, kitchenERefrigSamsung);
        kitchenElectDepartmentList.add(kitchenERefrigSamsung);



        allListDep.add(mobileDepartmentList);
        allListDep.add(kitchenElectDepartmentList);
        AbstractDepartment.getListAllListDepart(allListDep);
        ((Mobile)mobile).call(); //dawncast

        listMobile.add((Mobile) mobile);
        listMobile.add(mobile1);


        listRefr.add(refrigerator);
        listRefr.add(refrigerator1);

        kitchenERefrigSamsung.setGoodsList(listRefr);
        mobileDepartment2.setGoodsList(listMobile);


        System.out.println(mobileDepartment2.getGoodsList());
        System.out.println(kitchenERefrigSamsung.getGoodsList());*/


        Sberbank sberbank=new Sberbank("SberbankMoscow");
        Tinkoff tinkoff=new Tinkoff("TinkoffMoscow");
        VTB vtb= new VTB("VTB");
        sberbank.setCreditVolume(10.2);
        tinkoff.setCreditVolume(5.0);
        vtb.setCreditVolume(12.5);
        sberbank.setInstallment(true);
        tinkoff.setInstallment(true);
        vtb.setInstallment(false);
        bankInterfaceList.add(sberbank);
        bankInterfaceList.add(vtb);
        bankInterfaceList.add(tinkoff);



        Employer employer=new Employer("Misha");
       EmployerInterface employer1=new Employer("Kate");
      List<EmployerInterface> employerList=new ArrayList<>();
employerList.add(employer);
        employerList.add(employer1);
       sberbank.setEmployer(employerList);

        System.out.println(sberbank.getEmployerList());

    }
}
