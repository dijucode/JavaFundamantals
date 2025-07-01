public class CheckedExceptionPractice {

    public static void main(String[] args){
        method1();
    }

    private static void method1() {

        try {
            throw new ClassNotFoundException();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
