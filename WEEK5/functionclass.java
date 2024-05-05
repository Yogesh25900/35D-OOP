package WEEK5;

public class functionclass {
    void printSomething(){
        System.out.println("This function prints ");
    }
        int returnInteger(){
            int returnThis =1;
            return returnThis;
    }
        //with return and params
        boolean returnString(int num1,int num2){
            boolean check = num1 == num2;
            return check;
    }

    public static void main(String[] args) {
        //TO use a function you need to make object 
    // note :just remember the syntax for now
    functionclass fc = new functionclass();
     fc.printSomething();
     int callIntfunction  =fc.returnInteger();
     System.out.println("Return integer function:"+ callIntfunction);
    boolean all = fc.returnString( 10,20);
    System.out.println("BOolean exp : "+ all);

     
    }

}

    
    
    

