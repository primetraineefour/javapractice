package exceptions;

/**
 * Created by Jay
 */
public class RuntimeExceptionDemo {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Program start");
        try {
            int divide = a / b;
            System.out.println("Result = " + divide);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Always Execute");
        }
        System.out.println("Program End");

//        int[] numbers = {1, 2, 3};
//        System.out.println(numbers[2]);

    }

}
