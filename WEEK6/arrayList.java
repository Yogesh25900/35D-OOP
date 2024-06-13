package WEEK6;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {
    public static void main(String[] args) {
        /*To use Arraylist import at the top like scanner from java.util */
    
    @SuppressWarnings("unused")
    ArrayList<Integer> newArrayList = new ArrayList<>();
    ArrayList<String> animals = new ArrayList<>();
    /* Size is automatically allocated according to the element */
    animals.add("Cat");
    animals.add("Dog");
    animals.add("Elephant");
    System.out.println(animals);
    /*Can add element directly to index, it will shift rest to +1 0f index */
    animals.add(1,"Tiger");
    System.out.println(animals);
    /*Notice how the previous 1 and rest are shifted by 1 index */
    /*to remove ise.remove(Index) */

    animals.remove(2);
    /*It will remove the item/element in 2nd index */
    //to update .set(index,value)
    animals.set(1,"Snake");
    System.out.println(animals);
    //to access cannot use [index] -> square bracket use .get(index)
    System.out.println(animals.get(0));  //get oth indexed element
    
        /*task
         * make an arraylist of int
         * [100,200,300,400,500]
         * remove the value  300
         * add -100 at the first of array list
         * change 200 -210
         * change 400- 420
         * print the arrylist
         */
        ArrayList <Integer> intList = new ArrayList<Integer>(Arrays.asList(100,200,300,400,500));
        // intList.add(100);
        // intList.add(200);
        // intList.add(300);
        // intList.add(400);
        // intList.add(500);

        intList.remove(2);
        intList.add(0,-100);
        intList.set(2,210);
        intList.set(3,420);
        System.out.println(intList);

    
}
}

