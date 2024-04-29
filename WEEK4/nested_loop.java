package WEEK4;

public class nested_loop {
    public static void main(String[] args) {
        //nested loop
        for(int outer = 0; outer < 3; outer++) {
            for(int inner = 2; inner >=0; inner--) {
            System.out.println("Inner= "+ inner);
        }
            System.out.println("Outer= "+ outer);
        }
    }
}
