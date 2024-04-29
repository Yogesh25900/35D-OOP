package WEEK4;

public class jumpStatement {
    public static void main(String[] args) {
        /* break and continue are jump statment in java 
         * break will terminate the loop*/
//         for(int index = 0; index < 5; index++) {
//             if(index == 3) {
//                 break;
        
//     }System.out.println("Index " + index );

    
// }/*Can be used on any loop */
//     int count =0;
//     while(count <=10) {

//         if(count == 1) {
//             break;
//         }
//         System.out.println("Count " + count);
//         count++;
//     }
    /*Continue statement will skip the loops */
    // for(int index = 0; index < 5; index++) {
    //     if(index == 1) {
    //         continue;
    //     }
    //     System.out.println("Index " + index);
    // }

    //Task1 WAP to run for loop from -5 to 5
    // break the loop if the index is positive
        for(int index = -5; index <=5; index++) {
            if(index >=0){
                break;
            }else{
                System.out.println("Index: "+ index);
            }
        }


    /*Task2 
    Loop from 1-20 ising any loop 
    only print the value if it is even
    usse continue to do this task
     */
    int count = 1;
    while(count <=20){
    
        if(count %2 !=0){
            count++;
            continue;
        }else{
            System.out.println("Count:" +count);
            
        }
        count++;
    }

    }
}