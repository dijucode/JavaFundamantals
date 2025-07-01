public class Intern {

    public static void main(String [] args){

        String name1 = "Yogi";
        String name2 = "Yogi";
        String name3 = new String("Yogi");

        String name4 = name3.intern();
        System.out.println(name1 == name4);
        System.out.println(name1 == name3);
    }
}
