public class Factorial {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(factorial(num));
    }

    private static int factorial(int num) {
        if (num == 0)
            return 1;
        else
            return num * factorial(num - 1);
    }
}
