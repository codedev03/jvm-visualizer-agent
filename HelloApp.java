public class HelloApp {
    public static void main(String[] args) {
        System.out.println("Hello from main application!");
        Sample.doSomething();
    }
}

class Sample {
    static void doSomething() {
        System.out.println("Doing something...");
    }
}