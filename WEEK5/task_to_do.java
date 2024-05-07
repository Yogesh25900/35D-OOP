package WEEK5;
import java.util.ArrayList;
public class task_to_do{
    // 1. Make a method to check if a number is prime or not.
    public static void checkPrime(int number) {
        int count =0;
        for(int i =1;i <=number; i++){
            if(number %i ==0){
                count= count + 1;
            }
        }if (count == 2){
            System.out.println("Number is prime");
    }else{
        System.out.println("Number is not prime");
    }
}
// 2. Make a method to check if a given number n is even or not.
    public static void checkEven(int num1){
        if(num1 %2 !=0){
            System.out.println("It is odd");
        }else{
            System.out.println("It is even");
        }
    }

    // 3. Make a method to print the table of a given number n.
    public static void  printTable(int num2){
        for(int i =1;i <= 10;i++){
            System.out.println(num2 +"X"+ i+"="+num2*i);
        }
    }

    // 4. Write a program for multiplying 3 numbers using a method and return the result and print the result from the main method.
    public int multiplyNumbers(int num4, int num5,int num6){
        return(num4*num5*num6);
    }

    // 5. Write a program for calculating Simple Interest using a method and print the result from the method itself.
    public static void calculateSimpleInterest(double p, double r,int t){
        int SI= (int)((p*t*r)/100);
        System.out.println("Simple Interest: " + SI);
    }
    // 6. Write a program to calculate the area of a rectangle using a method of your choice.
    public static void areaRectangle(int len,int bre){
        System.out.println("The area of rectangle is "+ len*bre);
    }
    // 7. Calculates the factorial of a given number using the Java method.
    static void factorial(int number){
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.printf("The factorial of %d is "+result,number);
        System.out.println();
    }
    // 8. Calculate the nth Fibonacci number using the method.
    static void printFibonacci(int n){
        int a =0;
        int b =1;
        int c ;
        for(int i=1; i <=n;i++){
            System.out.print(a+" ");
            c = a+b;
            a=b;
            b=c;

            
        }
    }
    // 9. Write a Java program to find the greatest common divisor (GCD) of two numbers.
    static int  findGCD(int a, int b){
        ArrayList<Integer> GCDs = new ArrayList<>();
        for(int i =1; i <=a && i <=b; i++){
            if(a % i ==0 && b % i ==0){
                GCDs.add(i);

        }
    }
        int max =GCDs.get(0);
        for(int num:GCDs){
            if(num > max){
                max = num;
        }

        }

        return max;
    
}






public static void main(String[] args) {
    
    checkPrime(17);
    checkEven(13);
    printTable(2);
    task_to_do multiply = new task_to_do();
    System.out.println("THe mutlplication of the numbers is "+ multiply.multiplyNumbers(2,3,1));
    calculateSimpleInterest(1500, 5, 2);
    areaRectangle(5, 4);
    factorial(5);
    printFibonacci(10);
    System.out.println("\nTHe Gcd of the numbers is "+ findGCD(4, 8));
}
}
