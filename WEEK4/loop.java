package WEEK4;
import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
    //     int num1 = 0;
    //     while(num1 <0 ){
    //         System.out.println("While checks condition first");

    //     }
    // //Do while checks condition after first iteration
    // do{
    //     System.out.println("Do while checks conditon after");

    // }
    // while(num1 < 0);
    /*use a while loop to
     * ask user input postiive value 
     * prompt user to imput the negative value
     * loop unitl the user input negative int value
     * 
     * 
     */
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number less than zero:");

    int value = input.nextInt();
    while (value > 0) {
        System.out.println("Please enter negative value:");
        value = input.nextInt();
    }
    input.close();
    System.out.println("Loop end :)");
    }

    
}
