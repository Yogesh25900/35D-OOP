package WEEK9;

public class inheritance {
    public static void main(String[] args) {
        Tshirt t = new Tshirt();
        t.nameDifferenceI("New");
        @SuppressWarnings("unused")
        Tshirt t2 = new Tshirt("My shirt");

        halfpant newp = new halfpant();

        newp.changePant("white");

        car newc = new car("toyota", 2012);
        newc.display();

        FictionBook newbook = new FictionBook("MAnylod", "yogesh");
        newbook.displayDetails();
        

    
        
    }
    
}

class Shirt{
    String name = "Parent Shirt";
    String type;
    Shirt(){
    System.out.println("Parent constructor");
    }
    Shirt(String name){
        this.name = name;
        System.out.println("parent constructor with string param");
    }
}

class Tshirt extends Shirt{
    String name = "Class Shirt";

    Tshirt(){
        super("parent name");

        //default parent constructor is called automatically
        //super();
        System.out.println("Child constructor");
    }

    Tshirt(String name){
        this.name = name;
        System.out.println("Counstrcutor with String param");
    }
    void nameDifferenceI(String name ){
        System.out.println("param name: " + name);
        System.out.println("Class name: " + this.name);
        System.out.println("Parent name: " + super.name);
    }
}

class pant{
    String texture;
    String color;

    pant(){
        System.out.println("constructor of pant");
    }
    

    pant(String texture,String color){
        this.texture = texture;
        this.color = color;
        System.out.println("texture: " + texture);
        System.out.println("color: " + color);

    }

   
}

class halfpant extends pant{

    String color;

    halfpant(){
    
        super("wool","red");
    
        System.out.println("Constructor of half pant");
    }

    void changePant(String color){
        super.color = color;
        this.color = color;
        System.out.println("pant color changed to "+ color);


    }
}

//make a class pant
//make 2 atrribute, texture and color
//make a class halfpatn that extends pant
//make 1 attribute color
//make a constructor of pant that takesz textture and color
//make a non-param constructor for half pant and call 
//parent parameterized constructor with "wool" and 'red' 
//make a function in half pant called changepant
//takes color as params and set the current color of pant to halfpant
//change te new color of half pant


/* 
1. Write a Java program to create a class called Vehicle with a method called drive(). 
Create a subclass called Car with method display() method to print details of the Car.
*/
class vehicle{

    void drive() {
        System.out.println("the vehicle can be driven");

    }
    

}

class car extends vehicle{
    String brand;
    int year;

    car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    void display() {
        System.out.println("Brand: "+ brand);
        System.out.println("year: "+ year);
    }
}

/*


Let's examine the Java program given. 
It involves multiple classes that depict different book types, 
including Book, FictionBook, NonFictionBook, and TechnicalBook. 
The Book class features a constructor and a method called displayDetails(). 
This method is responsible for outputting the title and author of a book. 
The remaining classes inherit both the constructor 
and methods of the Book class as they extend it.
*/ 
class book{
    String title;
    String author;
    book(){

        System.out.println("Book constructor");
    }

    void displayDetails(){

        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
    }
}

class FictionBook extends book{
    String title;
    String author;
    FictionBook(String title,String author){
        super.title = title;
        super.author = author;
        
        
    }

}