package WEEK2;

public class InputOutput {
    public static void main(String[] args) {
        // User Output
        System.out.println("This sentence  will have line break");
        //System.out.print
        System.out.print("This will not have line break");
        System.out.println("This line will continue ");
        //String formatting using System.out.printf
        // %s String , %d integral , %f floating point , %b boolean 
        //this will also not break line

        System.out.printf("Hello %s ,good morning\n", "world");
        System.out.printf("The number is %d\n",10);
        //can use mutliple formatter
        System.out.printf("The floating %f and boolean  %b", 10.3f,false);


    }
}
