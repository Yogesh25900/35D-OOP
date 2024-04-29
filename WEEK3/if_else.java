package WEEK3;
public class if_else{
    public static void main(String[] args) {
        //Simple if example 
        if(true){
            System.out.println("True statement");

    }//if takes an expression    with boolean value
    int num1 =10,num2 =20;
    if(num1 >num2){
        System.out.println("Greater");

    }else{
        System.out.println("Lesser");
    }
    //if else two conditions
    if(num1 == num2){
        System.out.println("Equal");

    }else if(num1 <num2){
        System.out.println("Lesser num2");
    }else{
    System.out.println("Greater");
    }
    //Note that else should be at lasr and is not mandatory if sle if ladder multiple conditions

    if(num1>0){
        System.out.println("Num1 is positive");

    }else if(num2 >0){
        System.out.println("Num2 is positive");

    }else if(num1 != num2){

        System.out.println("NOt equal");


    }else if(num1 > num2){
        System.out.println("Greater");

}else{
    System.out.println("Default Statement");

}
//if any condition matches it will skip all remaining conditions
// including else ,condtion will be checked from top-bottom

//nested if conditons
if(num1 >0){
    if(num1> num2){
        System.out.println("positive and greater than num2");
    }else{
        System.out.println("positive and less than num2");
    }

    }else {
        if(num1 > num2){
            System.out.println("Negative and greater than num2");

    }else{
        System.out.println("Negative and less than num2");
    }
}
}
}
