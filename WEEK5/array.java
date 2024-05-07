package WEEK5;

public class array {
    public static void main(String[] args) {
        int[] myFirstArray;
        // initializing the array we need new reference 
        myFirstArray = new int[6]; // here in int[6] refers to the size of the array
        //the size of the array  can be further accessed by length
        int myFirstArrayLength = myFirstArray.length;
        System.out.println("My first array length: " + myFirstArrayLength);

        // using index for arrya operations
        myFirstArray[0] = 10;
        myFirstArray[1] =30;
        myFirstArray[2] =100;
        // to print out the array use the same index
        System.out.println("THe first array is in index 0"+myFirstArray[0]);
        //can also create a new int value
        int secondarrayindex =myFirstArray[1];
        System.out.println("The second element stored "+ secondarrayindex);

        //Declaration and initialization
        int[] myThirdArray = {10,20,30,40,50};
        //or using contructor
        int[] myFourthArray = new int[]{10,20,30,40,50};





       
    }
    
}
