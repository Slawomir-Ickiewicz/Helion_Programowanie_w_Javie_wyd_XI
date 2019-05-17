package Chapter04.EX_4_38_PAGE_226;

public class FactorialRecu {
    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

    private static int factorial(int i) {

        if (i < 1)
            return 1;
        else
            return i * factorial(i - 1);
    }
}
