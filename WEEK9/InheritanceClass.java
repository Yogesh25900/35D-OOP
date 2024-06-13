package WEEK9;

public class InheritanceClass {
    public static void main(String[] args) {
        childClass newc = new childClass();
        newc.lastname ="Chaudhary";
        newc.FirstName = "Yogesh";
        newc.info();
        newc.greet();

        grandChild newgc = new grandChild();
        newgc.FirstName="Yogesh";
        newgc.middlename="Thapa";
        newgc.lastname="Chaudhary";
        newgc.info();
        newgc.call();

        labrador lb = new labrador();
        lb.lifespan= 10;
        lb.speaks();

        lb.legs = 4;
        lb.fur();

        lb.diet = "Meat";
        lb.barks();

        



        
    }
    
}


class ParentClass{
    String lastname;
    @SuppressWarnings("unused")
    private int salary;
    protected String address;
    void info(){
        System.out.println("Last name: " + lastname);

    }
}
//extends keyword is used to create a child class
//single level ,one parent class one child class
class childClass extends ParentClass{
    String FirstName;
    void greet(){
        System.out.println("First Name: " + FirstName+ " Last Name: " +lastname);
    }
}


//multilevel
class grandChild extends childClass{
    String middlename;
    void call(){
        System.out.println(FirstName+ " "+middlename+" "+lastname);
    }
}


class uncleClass extends ParentClass{
    String job;
    void detail(){
        System.out.println(job+" "+lastname);
    }
}



class animal{
    int lifespan;
    void speaks(){
        System.out.println("Animal speaks");
    }
}

class  mammal extends animal{
    int legs;

    void fur(){
        System.out.println("It has fur");
    }

}

class reptile extends animal{
    int eggs;
    void shed(){
        System.out.println("repitle sheds its skin ");
    }
}

class dog extends mammal{
    String diet;
    void barks(){
        System.out.println("dog barks");
    }
}

class Germanshepherd extends dog{
    

}

class labrador extends dog{

}