package WEEK3;

public class SwitchCase {
    public static void main(String[] args) {
        char value ='b';
        int intVal  =10;
        switch (value){
            case 'a': 
                System.out.println("Apple");
                break;
            case 'b': 
                System.out.println("Ball");
                break;
            case 'c': 
                System.out.println("Cat");
                break;
            default:
                System.out.println("No word");
                break;
            
        }
        switch (intVal) {
            case 1:
                System.out.println("Value 1");
                break;
        
            default:
                System.out.println("Invalid");
                break;
        }
        
    }
    
}
