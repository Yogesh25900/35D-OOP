package WEEK9;

public class abstractClass{
    public static void main(String[] args) {
        samsung smini = new samsung();
        smini.call();
        smini.message();

        apple Iphone = new apple();
        Iphone.text("hello");
        Iphone.call();
        Iphone.message();


        
    }
}
        //to make abstract class use abstract keyword before class
        //if a class is abstract it cannot be make object of 
        abstract class Smartphone{
            //abstract function do not have a body
            //abstract class may or may not contain abstract function
            //if there is at least one abstract function class have to be abstract4

            abstract public void call();
            abstract public void message();
            abstract public boolean text(String text);
        }

        class samsung extends Smartphone{
            @Override
            public void call(){
                System.out.println("samsung calling");

            }
            @Override
            public void message(){
                System.out.println("Samsung message");

            }
            @Override
            public boolean text(String text){
                return true;
            }
        
}///task create a class Apple that extends smaprtphone
//override the function
//make an object of samsung and apple 
// and call all the functions

    class apple extends Smartphone{
        @Override
        public void call(){
            System.out.println("Apple calling");

        }
        @Override
        public void message(){
            System.out.println("Apple message");
        }
        @Override
        public boolean text(String text){
            return true;
        }

    }
