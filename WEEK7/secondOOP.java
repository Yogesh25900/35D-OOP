package WEEK7;

public class secondOOP {

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "John";
        p.age = 20;
        p.printInfo();
        
        Person p2 = new Person();
        p2.name = "Rob";
        p2.age = 23;
        p2.printInfo();
        p2.setPhNumber();

        football newF  = new football();
        newF.homeTeam=" Topper Fc";
        newF.awayTeam=" Prime 5";
        newF.time = 30;
        newF.setNewGoal(5);
        newF.setwinner("Topper Fc");
        newF.details();
    }
    
}

class Person {
    String name;
    int age;
    //access modifier
    private String phNumber;
    public int salary;
    void printInfo(){
        System.out.println(name);
    }
    void setPhNumber(){

        this.phNumber = "9090";
    }
    void setNewPhNumber(String num){

        this.phNumber =num;
    }
    String getphNumber(){
        return phNumber;
    }

    void setThisNumber(String phNumber){
        this.phNumber = phNumber;
}
}

class football{

    String homeTeam ;
    String awayTeam;
    int time;
    private int goal;
    private String winner;


    void setNewGoal(int n){
        this.goal = n;
    }

    int getGoal(){
        return this.goal;


    }

    void setwinner(String winner){
        this.winner = winner;
    }

    void details(){
        System.out.println("winner: " + winner);
        System.out.println("time: "+time);
        System.out.println("Total goal : "+goal);
    }

}

//Task 
// create a class football
//make two attribute
//String homeTeam and awayTeam
//make another atrribute time
//make a private attribute goal
// make a setter for goal
// make a getter for goal
//make a private attribute winner as string
//make only setter for winner
//make functional detail() -> print winner name ,time and total goal
//make object of football and fill all the attrribute
