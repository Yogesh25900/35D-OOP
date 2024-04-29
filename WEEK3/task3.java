package WEEK3;

import java.util.Scanner;

public class task3 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        /*1. Write a JAVA program to find the maximum between three numbers. */
    //    Scanner scanner = new Scanner(System.in);

    //     System.out.println("Enter three numbers:");
    //     int num1 = scanner.nextInt();
    //     int num2 = scanner.nextInt();
    //     int num3 = scanner.nextInt();

    //     int max = num1; 

    //     if (num2 > max) {
    //         max = num2;
    //     }

    //     if (num3 > max) {
    //         max = num3;
    //     }

    //     System.out.println("The maximum of the three numbers is: " + max);
    //     scanner.close();
    // 2. Write a JAVA program to check whether a number is negative, positive, or zero.
    // int number = 23;
    // String check =  (number > 0) ? "Positive"
    //             :(number <0)? "Negative"
    //             :"Zero";
    // System.out.println("THe number is: " + check);

    // 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not
    // int number = 115;
    // if (number % 5 ==0 && number % 11 == 0){
    //     System.out.println("divisible by 5 and 11");
        
    // }else{
    //     System.out.println("not Divisible by 5 and 11");
    // }

    // 4. Write a JAVA program to check whether a number is even or odd.
    // int check = 13;
    // String see = (check %2 == 0) ? "even" : "odd";
    // System.out.println(see);

    // 5. Write a JAVA program to check whether a year is a leap year or not. 

        // int year =2016;
        // if(((year %4 ==0)&&(year % 100 !=0)) || ( year % 400 ==0)){
        //     System.out.println("Leap year");
        // }else{
        //     System.out.println("Not leap year");
        // }
        // 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("ENter the aplhabet:");
        // char ch = scanner.next().charAt(0);
        // char[] vowel = {'a','e','i','o','u'};
        // for(char c : vowel){
        //     if(ch ==c){
        //         System.out.printf("%c is vowel",ch);
        //         break;
        //     }else{
        //         System.out.printf("%c is consonant",ch);
        //         break;
        //     }
        // }
        // scanner.close(); 

        // 1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value. Use a switch case statement to handle different grades.
        
            // Scanner scanner = new Scanner(System.in);
            // System.out.println("ENter your grade");
            // char grade = Character.toUpperCase(scanner.next().charAt(0));
            // /*Using switch case */
            // float GPA;
            // switch (grade) {
            //     case 'A':
            //         GPA = 4.0f;
            //         break;
            //     case 'B':
            //         GPA = 3.0f;
            //         break;
            //     case 'C':
            //         GPA = 2.0f;
            //         break;
            //     case 'D':
            //          GPA = 1.0f;
            //          break;


            //     default:
            //         System.out.println("invalid grade " );
            //         return;


            // }
            // System.out.println("Your GPA is " + GPA);
            // scanner.close();

            // 2. Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and performs the corresponding arithmetic operation using a switch case statement.
            // Scanner scanner = new Scanner(System.in);
            // System.out.println("Enter first number:");
            // int num1 = scanner.nextInt();
            // System.out.println("Enter second number:");
            // int num2 = scanner.nextInt();
            // System.out.println("Enter operator(+,-,*,/):");
            // char operator = scanner.next().charAt(0);
            // int result;
            // switch (operator) {
            //     case '+':
            //         result = num1 + num2;
                    
            //         break;
            //     case '-':
            //         result = num1 - num2;
            //         break;
            //     case '*':
            //         result = num1 * num2;
            //         break;

                
            //     case '/':
            //         if(num2 !=0){
            //             result = num1 / num2;
            //         }else{
            //             System.out.println("Zero divison error");
            //             return;
            //         }
            //         break;
            //     default:
            //         System.out.println("Invalid operator");
            //         return;
            // }
            // System.out.println("The result is: " + result);


            // 3. Write a Java program that takes an integer input (1 to 12) representing a month and prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case.
            // Scanner mn= new Scanner(System.in);
            // System.out.println("ENter  a month(1-12)");
            // int month=mn.nextInt();
            // String season;
            // switch (month) {
            //     case 1,2,3:
            //         season = "Winter";

                    
            //         break;
            //     case 4,5,6:
            //         season = "Spring";
            //         break;
            //     case 7,8,9:
            //         season = "Summer";
            //         break;
            //     case 10,11,12:
            //         season = "Fall";
            //         break;
            
            //     default:
            //         System.out.println("ENter a valid month");
            //         return;
            // }
            // System.out.println("the following month falls on " + season);

            // 4. Implement a Java program that calculates the area of different shapes (circle, rectangle, square, triangle) based on the user's choice using a switch case
            Scanner scanner = new Scanner(System.in);
            System.out.println("Calculate area of following shapes: \nA. Square\nB. Triangle\nC.Rectangle\nD.Circle");
            System.out.println("Enter yout choice(A, B, C, D)");
            char ch = Character.toUpperCase(scanner.next().charAt(0));
            int area;
            String shape;
            switch (ch) {
                case 'A':
                    shape = "Square";
                    System.out.println("Enter the length of square");
                    int length = scanner.nextInt();
                    area = length*length;

                    
                    break;
                case 'B':
                    shape = "Triangle";
                    System.out.println("Enter the base of triangle");
                    int base = scanner.nextInt();
                    System.out.println("Enter the height of the triangle");
                    int height = scanner.nextInt();
                    area = (base *height/2);

                    
                    break;

                case 'C':
                    shape= "Rectangle";
                    System.out.println("Enter the length of rectangle");
                    int lengthrec = scanner.nextInt();
                    System.out.println("Enter the breadth of the rectangle");
                    int breadth = scanner.nextInt();
                    area = lengthrec * breadth;

                    
                    break;
                case 'D':
                    shape = "Circle";
                    System.out.println("Enter the radius of circle");
                    int radius= scanner.nextInt();
                    area =(int) Math.PI*radius*radius;

                    
                    break;
            
                default:
                    System.out.println("Invalid choice");
                    return;

            }
            System.out.printf("THe area of %s is %d ",shape ,area);
            

    }
}
