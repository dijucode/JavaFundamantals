package builderdesignpattern;

public class Car extends RuntimeException { // Car now extends RuntimeException
    private String make;
    private String model;
    private int year;
    public String color;

    public Car(Builder builder) {
        super("Car Exception Thrown"); // Provide a message for the exception
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
    }

    public static class Builder {
        private String make;
        private String model;
        private int year;
        private String color;

        public Builder(String make) {
            this.make = make;

        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
