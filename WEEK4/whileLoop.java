package WEEK4;
import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        int count = 0;
        //while loop takes boolean expression inside {}
        //the loop will run repeatedly when the boolean is ture  if the boolean is false the loop will end
        while(count <5){
            ;
            System.out.println("While loop: "+ count);
            count++;
        }
    // in while loop the condition ischecked at the beginning 
    //If the condition is false in initail check the loop will not run
        System.out.println("Please type the value between 0-100 :");
        Scanner scanner = new Scanner(System.in);
        int InputValue = scanner.nextInt();
        while (InputValue < 0 || InputValue >100) {
            System.out.println("Enter the value between 0-100 :");
            InputValue = scanner.nextInt();


            
            
        }
        System.out.println("End loop: ");
        scanner.close();

    }

    

    
}
