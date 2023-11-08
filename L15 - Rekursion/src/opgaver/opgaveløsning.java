package opgaver;

public class opgaveløsning {
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(power(4, 5));
        System.out.println(power2(4, 5));
        System.out.println(product(5, 5));
        System.out.println(productRus(5, 5));
        System.out.println(reverse("RANSLIRPA"));
        System.out.println(sfd(10, 20));
        System.out.println(waysToCoverStrips(25));
    }

    //OPGAVE 1
    public static int factorial(int n) {
        int result = 0;
        if (n == 0) {
            result = 1;
        }
        else {
            result = n * factorial(n - 1);
        }
        return result;
    }

    //OPGAVE 2

    public static int power (int n, int p) {
        int result = 0;
        if (p == 0) {
            result = 1;
        }
        else {
            result = n * power(n, p - 1);
        }
        return result;
    }

    //OPGAVE 2.1
    public static int power2 (int n, int p) {
        int result = 0;
        if (p == 0) {
            result = 1;
        } else if (p % 2 == 0) {
            result = power2(n * n, p / 2);
        } else {
            result = n * power2(n, p - 1);
        }

        return result;
    }

    //OPGAVE 3
    public static int product(int a, int b) {
        int result = 0;
        if (a == 0) {
            result = 0;
        } else {
            result = b + product(a - 1, b);
        }
        return result;
    }

    //OPGAVE 3.1
    public static int productRus(int a, int b) {
        int result = 0;
        if (a == 0) {
            result = 0;
        }
        else if (a % 2 == 1) {
            result = b + productRus(a - 1, b);
        } else {
            result = productRus(a / 2, b + b);
        }
        return result;
    }

    //OPGAVE 4
    public static String reverse (String s) {
        String temp = "";
        String result = "";
        if (s.length() == 0) {
            return result;
        } else {
            result = s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
        }
        return result;
    }

    //OPGAVE 5
    public static int sfd (int a, int b) {
        int result = 0;
        if (b <= a && b % a == 0) {
            result = a;
        } else if (a < b) {
            result = sfd(b, a);
        }
        else {
            result = sfd(b, a % b);
        }
        return result;
    }

    //OPGAVE 6
    public static int waysToCoverStrips(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            int a = 1;
            int b = 2;
            for (int i = 3; i <= n; i++) {
                int temp = b;
                b = a + b;
                a = temp;
            }
            return b;
        }
    }
}
