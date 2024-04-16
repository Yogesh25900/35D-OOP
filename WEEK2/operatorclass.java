package WEEK2;

public class operatorclass {
    public static void main(String[] args) {
    /*Arithmetic Operators */
    int a = 10 ,b =10;
    int sum = a + b; //here the '+' is an arithmetic operator
    System.out.println("Addition for a+b is " + sum  );
    System.out.println("Difference for a-b is " + (a-b));
    System.out.println("Multiplication for axb is " + (a*b));
    System.out.println("Divsion for a/b is " + (a/b));
    System.out.println("Modulo of a % b is " + (a%b)); 
    
    /*Assignment Operator */
    int aNumber1 ;
    aNumber1 =10;
    /*or declare and assign  */
    int aNumber2 = 20;
    /*assign with another variable */
    int aNumber3= aNumber1;
    System.out.println("Assignment with += "+ (aNumber1+=10));
    aNumber2 -=30; //same as aNumber2  = aNumber2-30
    System.out.println("Assignment with -= "+ (aNumber2));
}
    
}
