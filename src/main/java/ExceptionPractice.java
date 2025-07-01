import builderdesignpattern.Car;

public class ExceptionPractice {

    public static void main(String[] args) {
        method1(); // This will throw a Car exception and print the stack trace
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        // Properly use the builder to create and throw the Car object
        Car c = new Car.Builder("Toyota")
                .year(2021)
                .color("Blue")
                .build();

        System.out.print(c.color); // Print the color of the car
    }
}
