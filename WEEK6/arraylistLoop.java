package WEEK6;

import java.util.ArrayList;
import java.util.Arrays; 

public class arraylistLoop {
    public static void main(String[] args) {
        
        ArrayList<String> name = new ArrayList<>();
        name.add("Aayam");
        name.add("Adhar");
        name.add("Yausan");
        name.add("Niraj");
        name.add("Ayush");
        name.add("Rijan");
        /*To loop ,find the length /element count , .size() */
        int namelenght = name.size();
        /*Loop same as array */
        for(int index = 0; index < namelenght; index++){
            //Get each element with .get(index)
            String singleName = name.get(index);
            System.out.println("|Index: " + index + "| value: " + singleName);

        

        }
        //Using foreach in java
        for(String element : name){
            System.out.println(element);

        }
        /*Task
         * make ande arraylist animals
         * ["Cat","Tiger","Dog","Elephant"]
         * make two more arraylist called wildanimal ,domestic animal
         * loop the animals
         * if the element/value is "Cat", 'Dog" add in domestic animal
         * same for 'Tiger AND "elephant'
         * print domestic animal and wild animal
         * 
         */
                ArrayList <String> animals = new ArrayList<String>(Arrays.asList("Cat","Tiger","Dog","Elephant"));
                ArrayList<String> wildanimal = new ArrayList<>();
                ArrayList<String> domesticanimal = new ArrayList<>();
                for(String animal : animals) {
                    if(animal == "Cat" || animal == "Dog") {
                        domesticanimal.add(animal);
                }else{
                    wildanimal.add(animal);
                }


    }
    System.out.println("Wild animal: "+ wildanimal);
    System.out.println("Domestic animal: "+ domesticanimal);
}
}