package telran.introduce;

public class Calculations {
    public static int sum(int op1, int op2) {
        return op1 + op2;
    }

    public static int multiply(int op1, int op2) {
        return op1 * op2;
    }

    public static int divide(int op1, int op2) {
        int res = 0;
        try {
            res = op1 / op2;
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
        }
        return res;
    }

    public static int subtract(int op1, int op2) {
        return op1 - op2;
    }

    public static int sumOfDigits(int number) {
        int res = 0;
        number = Math.abs(number);
        while (number > 0) {
            res = res + number % 10;
            number = number / 10;
        }
        return res;
    }

    public static int maxDigit(int number) {
        int max = 0;
        number = Math.abs(number);
        while (number > 0) {
            if (max < number % 10) {
                max = number % 10;
            }
            number = number / 10;
        }
        return max;
    }

    public static boolean isDividedOn(int number, int divider) {
        boolean res = false;
        try {
            res = number % divider == 0;
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
        }
        return res;
       
    }

}