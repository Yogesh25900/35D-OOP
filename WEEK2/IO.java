package WEEK2;

import java.util.Scanner;
public class IO {
    public static void main(String[] args) {
        //user input 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("The following take whole sentence: " );
        String wholeOutput = scan.nextLine();
        System.out.println("The input taken is " + wholeOutput);

        System.out.println("The following take interger");
        int intInput = scan.nextInt();
        System.out.println("the input is " + intInput);

        System.out.println("the following take double");
        double doubleInput = scan.nextDouble();
        System.out.println("The input is " + doubleInput);

        System.out.println("the following take boolean");
        boolean booleanInput = scan.nextBoolean();
        System.out.println("The input is " + booleanInput);

        scan.close();

    }
    
}
