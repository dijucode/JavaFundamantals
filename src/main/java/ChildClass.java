public class ChildClass extends ParentClass{
    ChildClass(int x){
        super();
        System.out.println("This is child class constructor.");
    }


    public static void main(String[] args){


        ChildClass childClass = new ChildClass(2);

    }

}
