package CodeWithErrors;

public class ErrorB {

    public static void main(String[] args) {
        int var1 = 15;
        int var2 = 5;
        int var3 = 0;
        int ans1 = var1 / var2;

        try {
            int ans2 = var1 / var3;
            System.out.println("Division of va1 by var3 is: " + ans2);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
        System.out.println("Division of va1 by var2 is: " + ans1);
    }
}
