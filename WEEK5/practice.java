package WEEK5;

public class practice {
    int factorial(int number){
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        practice print = new practice();
        int result = print.factorial(5);
        System.out.println("Factorial of 5 is: " + result);
    }
}

