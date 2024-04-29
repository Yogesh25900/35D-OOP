package WEEK2;
import java.util.Scanner;
public class task {
    public static void main(String[] args) {
        try (Scanner newscan = new Scanner(System.in)) {
            System.out.print("What is your name?");
            String name = newscan.nextLine();
            
            System.out.print("Are you above 18 ?");
            boolean status = newscan.nextBoolean();

            System.out.print("How many siblings do you have?");
            int siblings = newscan.nextInt();

            System.out.printf("Hello, %s \n", name);
            System.out.printf("Over 18 ?, %b\n",status);
            System.out.printf("You have %d siblings",siblings);
        }

        

    }
    
}
