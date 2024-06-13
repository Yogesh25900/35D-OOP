package WEEK8;

public class Encap {
    public static void main(String[] args) {
        Laptop laptop2 = new Laptop();
        laptop2.setName("Apple M1");
        System.out.println("Name: "+laptop2.getName());

        laptop2.setBrand("Apple");
        System.out.println("Brand: "+laptop2.getBrand());

        laptop2.setPrice(10000);
        System.out.println("Price: "+laptop2.getPrice());

        laptop2.setYear(2023);
        System.out.println("Year: "+laptop2.getYear());




        
    }
    
}

//bundle similar properties and functions into class
class Laptop{
    //data hiding can be done using private access modifier
    private String name;
    private String brand;
    private double price;
    private int year;
    //make read only access using getter 
    public String getName(){
        return this.name;

    }
    //make write only access using setter
    public void setName(String name){
        this.name = name;
    }

    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;

    }
    
    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }

}