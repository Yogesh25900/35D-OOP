package WEEK1;
//Write a program that prints Hello World! to the console. Save the program as Hello.java.
// public class hello {
//     public static void main(String[] args){
//         System.out.println("Hello World!");
//     }
// }


// 2. Extend/Modify the above program to print two additional lines:

// This is my first program

// I am on module ST4003CEM

// System.out.print (not println) and produces the same output.

// public class hello{
//     public static void main(String[] args){
//         System.out.print("This is my first program!\n");

//         System.out.print("I am on module ST4003CEM");
//     }
// }

// 3. Write a program that prints the following output:

// A "quoted" String is

// 'much' better if you learn

// the rules of "escape sequences."

// Also, "" represents an empty

// String. Don't forget: use \"

// instead of " !

// '' is not the same as "

// public class hello{
//     public static void main(String[] args) {
//         System.out.println("A \"quoted\" String is");
//         System.out.println("\'much\' better if you learn");
//         System.out.println("the rules of \"escape sequences.\"");
//         System.out.println("Also, \"\" represents an empty ");
//         System.out.println("String. Don't forget: use \\\"");
//         System.out.println("instead of \"!");
//         System.out.println("\'\'is not the same as");
//     }

// }

// 4. WAP that prints the following pattern:

// *

// **

// ***


// ****


// public class hello{
//     public static void main(String[] args) {
//         System.out.println("*");
//         System.out.println("* *");
//         System.out.println("* * *");
//         System.out.println("* * * *");
//         System.out.println("* * * * *");
//     }
// }

// public class hello {

//      public static void main(String[] args) {
//         for(int i = 0; i <=5; i++) {
//             for(int j = 0; j < i; j++) {
//             System.out.print(" * ");
//      }
//      System.out.println();
// }
// }
// }

// 5. WAP prints the following pattern:

// *********

// *********

// *********

// *********


//using for loop
public class hello{
    public static void main(String[] args) {

        System.out.println("Enter the number for its table: ");
        for (int i =1;i <=4 ; i++){
          for(int j =1; j <=4; j++) {
            
                System.out.print(" * ");
            
    }
    System.out.println();
}
}
}




// 6. WAP that prints the following output:

// A well-formed Java program has a main method with { and } braces.



// A System.out.println statement has ( and ) and usually a String that starts and ends with a " character.

// (But we type \" instead!)

// What is the difference between

// a ' and a "?  Or between a " and a \"?



// One is what we see when we're typing our program. The other is what appears on the "console."

// public class hello{
//     public static void main(String[] args) {
//         System.out.println("A well-formed Java program has a main method with { and } braces.");
//         System.out.println("A System .out.println() statement has  ( and  ) and usually a String that starts and ends with a \" character");
//         System.out.println("(But we type \\\" instead!)");
//         System.out.println("What is the difference between");
//         System.out.println("a \' and a \"? Or between a \" and a \"?");
//         System.out.println("One is what we see when we're typing our program.The other is what appears on the \"console.\"");
//     }

//     }

