package ir.hri.view;

import ir.hri.business.MyService;
import ir.hri.business.SimpleService;
import ir.hri.util.SpringUtil;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        SimpleService simpleService = (SimpleService) SpringUtil.getApplicationContext().getBean("simpleServiceBean"); //simpleServiceProxy
        simpleService.printNameId();
        System.out.println("--------------");
        try {
            simpleService.checkName();
        } catch (Exception e) {
            System.out.println("SimpleService: Method checkName() exception thrown..");
        }
        System.out.println("--------------");
        simpleService.sayHello("Ireh");
        System.out.println("--------------");
        simpleService.hello("Ireh");
        System.out.println("====================");
        MyService myService = (MyService) SpringUtil.getApplicationContext().getBean("myServiceBean");
        myService.setName("HamidReza");
        myService.printName();
    }
}
