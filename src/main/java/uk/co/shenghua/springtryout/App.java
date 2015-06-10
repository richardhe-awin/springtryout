package uk.co.shenghua.springtryout;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("app-context.xml");
        HelloWorldPrinter helloWorldPrinter = (HelloWorldPrinter) appContext.getBean("helloWorldPrinter");
        helloWorldPrinter.print();
        appContext.registerShutdownHook();
    }
}
