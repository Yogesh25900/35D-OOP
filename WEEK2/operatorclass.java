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

    /*Relational Operator */
    int rNumber1 =10,  rNumber2 =20;
    System.out.println("rNumber equal to rNumber2 :"+ (rNumber1 == rNumber2));
    System.out.println("rNumber1 greater than rNumber2:"+ (rNumber1 > rNumber2));
    System.out.println("rNumber1 less than rNumber2:"+ (rNumber1 < rNumber2));
    System.out.println("rNumber2 not equal to rNumber2:"+ (rNumber1 !=rNumber2));

    /*Logical Operator */
    int lNumber1 =10,  lNumber2 =20;
    boolean lExpression1 =lNumber1 ==lNumber2;
    boolean lExpression2 = lNumber1 <=lNumber2;
    System.out.println("And operator uses &&:"+ (lExpression1 && lExpression2));
    System.out.println("Or operator use ||:"+ (lExpression1 || lExpression2));
    System.out.println("Not operator uses !"+ (!lExpression1 ));
}
    
}
