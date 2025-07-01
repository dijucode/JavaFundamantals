public class Dog extends Animal {


    public String sound(){
        return "Bark";
    }



    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.sound());




        System.out.println(((Animal) dog).sound());
    }
}
