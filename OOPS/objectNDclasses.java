package OOPS;

//Creating a class other than MAIN
class Pen{
    String name;
    int price;
    void speakName(){
        System.out.println(this.name + "is pens name");
    }
    //Creating own Constructors
    Pen(String name, int price){    //Parameterized constructor
        this.name = name;           //this keyword points to its refrence variable
        this.price = price;
    }

    Pen(){                          //Non-parameterized constructor
        this.name = "Renold";       //this keyword points to its refrence variable
        this.price = 90;
    }
}
public class objectNDclasses {
    public static void main(String[] args) {
        // Pen pen1 = new Pen("Trimax",20);
        // Pen pen2 = new Pen();
    }
}
