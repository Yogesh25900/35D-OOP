package WEEK2;
public class IOargs {
    public static void main(String[] args) {
        
    
    // Scanner scan = new Scanner(System.in);
    if (args.length  <2){
        System.out.println("Not enough arguments");
        return;

    }
    System.out.println("First argument is " + args[0]);
    System.out.println("Second argument is " + args[1]);
    }

    
}
