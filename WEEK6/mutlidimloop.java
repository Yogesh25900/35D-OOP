package WEEK6;

public class mutlidimloop {
    public static void main(String[] args) {
        int[][] newArray  = {{10,20},
                            {-10,-20},
                            {100,200},
                            {-100,-200}};
    // int outerlength = newArray.length;
    // for(int outer = 0; outer < outerlength; outer++){
    //     for(int index = 0; index < newArray[outer].length; index++){
    //         System.out.println("Index [" + outer+ "][" + index+ "] :" + newArray[outer][index]);

    // }
    // }
    //make an array of string names
    String[][] names = {
                        {"Sanskriti","Nikita","Anji"},
                        {"Miraj","Niraj","Oscar"}
    };
    for(int outer = 0; outer < names.length; outer++){
        for(int index = 0; index < names[outer].length; index++){
            System.out.println("Index [" + outer+ "][" + index+ "] :" +names[outer][index]);

    }
    }
   
    
}
}