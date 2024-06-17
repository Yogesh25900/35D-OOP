package WEEK9;
//find the bug in the following
public class abstractreview {
    public static void main(String[] args) {
        Circle newCircle = new Circle(5);

        newCircle.calculateArea();
        newCircle.calculatePerimeter();

        rectangle newRec= new rectangle(4,3);
        newRec.calculateArea();
        newRec.calculatePerimeter();


        triangle newTriangle = new triangle(2, 3, 4, 6, 7);
        newTriangle.calculateArea();
        newTriangle.calculatePerimeter();

    }
    
}

abstract class Computer{
    abstract void on();
    abstract String off(boolean val);
    void changePassword(){

    }
    abstract boolean usb(int num);
}

abstract class Shape{

    abstract public void calculateArea();
    abstract public  void calculatePerimeter();
}

 class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    public void calculateArea(){
        System.out.println("Area of circle:"+(3.14*(radius*radius)));
    }
    public void calculatePerimeter(){
        System.out.println("The perimeter of the circle is "+ 2*3.14*radius);

    }

 }

 class rectangle extends Shape{
    int length;
    int breadth;
    rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public void calculateArea(){
        System.out.println("Area of rectangle:"+length*breadth);
    }
    public void calculatePerimeter(){
        System.out.println("The perimeter of the rectangle:"+2*(length+breadth));

    }

 }

 class triangle extends Shape{
    int side1;
    int side2;
    int side3;
    int base;
    int height;
    triangle(int side1,int side2,int side3,int base,int height){
       this.side1 =side1;
       this.side2=side2;
       this.side3=side3;
       this.base = base;
       this.height =height;
    }
    public void calculateArea(){
        System.out.println("Area of triangle:"+0.5*base*height);
    }
    public void calculatePerimeter(){
        System.out.println("The perimeter of the rectangle:"+side1+side2+side3);

    }

 }