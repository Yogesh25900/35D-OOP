package WEEK5;

public class tasktodo {

    public static void anothertask(){
        int[] firstarray = new int[]{10,20,30,40,50,60,70,80,90,100};
        int [] secondarray = new int[10];
        for(int i=0; i<firstarray.length; i++){
            secondarray[i] = -firstarray[i];
        }
        System.out.print("Array:");
        for(int i=0; i<secondarray.length; i++){
            System.out.print( secondarray[i]+ " "); // to print the second array
        }


    }
    public static void main(String[] args) {
        // int[]  myFiftharray = new int[5];
        // myFiftharray = new int[]{10,20,30,40,50};
        // for (int i = 0; i < myFiftharray.length;i++) {
        //     System.out.println(myFiftharray[i]+ "\t"+myFiftharray[i] *2);
        // }
            anothertask();

    }
    
}
 