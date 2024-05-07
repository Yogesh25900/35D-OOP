package WEEK5;
public class staticFunction{
    // in the following public and static is optional 
    public static int addTwoNumber(int a, int b){
        int sum = a + b;
        return sum;

    }
    public static String vendingMachine(int  menu){
        if(menu ==1){
            return "Coke";

        }
        if(menu == 2){
            return "water";

        }
        if(menu == 3){
            return "Frooti";
        }return "Nothing";
    }
    public static boolean checkEven(int number){
        boolean check = number %2==0;
        return check;
    }
    public static String checkEligible(int age,String name){
        if(age <18){
            return name +" ,Sorry you are not eligible";
        }else{ 
            return name +" ,you are  eligible";

        }
    

    }
    public static void makeMultiply(double dub1,double dub2){
        double result = 0;
        for (int i = 1; i <= 10; i++) {
            result += dub1;
            System.out.println(dub1 + " x " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        //if a function is static then no need to make object
        //if the function is static in same class you can  simple call the method
        int sumReturn = addTwoNumber(10, 30);
        System.out.println("The sum is "+ sumReturn);
        String order  = vendingMachine(3);
        System.out.println("MR.Dhakal ordered "+ order);

        //task make a function checkEven
        //that take one int
        //that return a bool
        //if the int is even return true else false
        boolean ans = checkEven(10);
        System.out.println("Even:"+ans);

        System.out.println(checkEligible(19, "Yogesh"));
        makeMultiply(2, 3);
        
    }
}