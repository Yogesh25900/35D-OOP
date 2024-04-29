package WEEK2;

public class task_todo {
    public static void main(String[] args) {
        /* * 1. Write a program to check whether a person can cast a vote or not. 
        The condition is you must be over 18 years old to vote.*/
        // int age = 19;
        // if(age > 18){
        //     System.out.println("You are eligilbe to vote");
        // }else{
        //     System.out.println("Sorry, you are not eligible to vote");
        // }
        /*2. Write a program to calculate SI. 

        Formula Simple Interest = (PrincipleAmount*Time*Rate/100); */
        // int Principle = 12000;
        // int Time = 2;
        // int Rate =5;
        // int SI = ((Principle*Time*Rate)/100);
        // System.out.println("The simple interest is:"+SI);
    /*3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.

Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side; */
        // int length =10;
        // int width = 12;
        // int height  = 12;
        // int area_trianle = 1/2*(length * width);
        // int vol_cube = (length)^3;
        // int vol_cuboid = (length*width*height);
        // System.out.println("The area of traingle is:"+ area_trianle);
        // System.out.println("The volume of cube is:"+ vol_cube);
        // System.out.println("The volume of  cuboid is:"+ vol_cuboid);
        // 4. Write the ternary operator for question no. 1
        int age = 18;
        String check = (age >18)? ("You are eligilbe to vote") :("Sorry, you are not eligible to vote");
        System.out.println(check);
    }


    
}
