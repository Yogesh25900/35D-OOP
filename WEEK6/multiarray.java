package WEEK6;
import java.util.Scanner;

public class multiarray {
    public static void main(String[] args) {
        // create N  dimensions array add number of square brackets
        //1D array 
        int oneDarray[];
        //2D array
        // int twoDarray[][];
        //3d array
         int threeDarray[][][];

         //Allocating memory size 
        //  twoDarray = new int[3][5];
         //First size 3 represent number of inner arrays
         // second size 5 represent value of inner arrays

         //tO Take the first array we use twoDarray[0]
         //to take the value of the inner array we use twoDarray[0][0]
        //  twoDarray[0][0] =10;
        //  twoDarray[0][1] =20;
        //  twoDarray[1][2]=100;
        // twoDarray[2][4]=200;
        int[][] twoDarray = {
            {10, 20, 30, 40, 50},
            {60, 70, 80, 90, 100},
            {110, 120, 130, 140, 150},
            {120, 140, 160, 180}
        };
        
//         Scanner scan = new Scanner(System.in);

//         for (int i = 0; i <=2; i++) {
//             for (int j = 0; j <=4; j++) {
//                 System.out.println("ENter value:");
//                 twoDarray[i][j] = scan.nextInt();

        

         

    
// }
// }
// scan.close();
for (int i = 0; i <twoDarray.length; i++) {
    for (int j = 0; j <twoDarray[i].length; j++) {
        System.out.println("INdex [" + i + "][" + j+ "] :" + twoDarray[i][j]);
    }
}
    }
}