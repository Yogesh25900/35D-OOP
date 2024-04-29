package WEEK2;
import java.util.Scanner;
public class task_todo {
    public static void main(String[] args) {
        /* * 1. Write a program to check whether a person can cast a vote or not. 
        The condition is you must be over 18 years old to vote.*/
        // int age = 19;
        // if(age > 18){
        //     System.out.println("You are eligilbe to vote");
        // }else{
        //     System.out.println("Sorry, you are not eligible to vote");
        // }
        /*2. Write a program to calculate SI. 

        Formula Simple Interest = (PrincipleAmount*Time*Rate/100); */

        // int Principle = 12000;
        // int Time = 2;
        // int Rate =5;
        // int SI = ((Principle*Time*Rate)/100);
        // System.out.println("The simple interest is:"+SI);
    /*3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.

Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side; */
        // int length =10;
        // int width = 12;
        // int height  = 12;
        // int area_trianle = 1/2*(length * width);
        // int vol_cube = (length)^3;
        // int vol_cuboid = (length*width*height);
        // System.out.println("The area of traingle is:"+ area_trianle);
        // System.out.println("The volume of cube is:"+ vol_cube);
        // System.out.println("The volume of  cuboid is:"+ vol_cuboid);
        // 4. Write the ternary operator for question no. 1
        // int age = 18;
        // String check = (age >18)? ("You are eligilbe to vote") :("Sorry, you are not eligible to vote");
        // System.out.println(check);

        // 5. Write a program to take two integer inputs from the user and print the sum and product of them.
        //  Scanner num = new Scanner(System.in);
        //  System.out.print("Enter the first number:");
        //  int num1 = num.nextInt();
        //  System.out.print("Enter the second number:");
        //  int num2 = num.nextInt();
        //  int sum = num1 + num2;
        //  int product = num1 *num2;
        //  System.out.println("The sum is " + sum + " and the product is " + product);
        //  num.close();

        // 6. Take two integer inputs from the user. First, calculate the sum of two,
        //  then the product of two. Finally, calculate the division of the thus obtained sum and product and print the result.
        // Scanner num = new Scanner(System.in);
        // System.out.print("Enter the first number:");
        // int num1 = num.nextInt();
        // System.out.print("Enter the second number:");
        // int num2 = num.nextInt(); 
        // int sum = num1 + num2;
        // int product = num1 *num2;
        // System.out.println("The division of result obtained sum and product is "+ sum/product);
        /*TO get better precison we can change the type of either varibale  like to float or decimal */

            /*7. Take the name, roll number, and field of interest from the user and print in the format below:
             Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. */
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter your name:");
        // String nameString = scan.nextLine();
        // System.out.print("Enter your roll number:");
        // String rollNumberString = scan.nextLine();
        // System.out.print("Enter your field of interest:");
        // String fieldOfInterestString = scan.nextLine();

        // System.out.printf("Hey, my name is %s and my roll number is %s. My field of interest is %s.\n", nameString, rollNumberString, fieldOfInterestString);
        // scan.close();

        /*  8. Take side of a square from user and print area and perimeter of it. 
        Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input.*/
            // Scanner scan = new Scanner(System.in);
            // System.out.println("Enter the side of square: ");
            // int length = scan.nextInt();
            // System.out.printf("The area of the square is %d\n", length*length);
            // System.out.printf("The perimeter of the square is %d", 4*length);
            // scan.close();
            /*9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int. */
            // Scanner scan = new Scanner(System.in);
            // System.out.println("Enter the length of the rectangle:");
            // double length = scan.nextDouble();
            // System.out.println("Enter the breadth of the rectangle:");
            // double breadth = scan.nextDouble();
            // int area = (int)(length*breadth);
            // System.out.printf("The area of the rectangle is %d",area);
            // scan.close();

            /*10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;

            a. If equal to or more than 70 -> First Class

            b. If more than 59 -> Upper Second Class

            c. If more than 49 -> Second class

            d. If more than 39 -> Third class and if below than 40 the result is fail. 

            Hint: Use ternary operator

            

 */
Scanner scanner = new Scanner(System.in);
System.out.println("Enter marks of four subjects:");
int subject1 = scanner.nextInt();
int subject2 = scanner.nextInt();
int subject3 = scanner.nextInt();
int subject4 = scanner.nextInt();

int totalMarks = subject1 + subject2 + subject3 + subject4;
double percentage = totalMarks / 4.0;

String result = (percentage >= 70) ? "First Class"
              : (percentage > 59) ? "Upper Second Class"
              : (percentage > 49) ? "Second Class"
              : (percentage > 39) ? "Third Class"
              : "Fail";

System.out.println("Total Marks: " + totalMarks);
System.out.println("Percentage: " + percentage + "%");
System.out.println("Result: " + result);

scanner.close();


    }


    
}
