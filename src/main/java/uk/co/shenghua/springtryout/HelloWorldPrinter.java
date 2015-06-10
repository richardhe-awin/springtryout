package uk.co.shenghua.springtryout;

public class HelloWorldPrinter {
    private final HelloWorld helloWorld;

    public HelloWorldPrinter(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public void print() {
        System.out.println(helloWorld.getMessage());
    }
}
