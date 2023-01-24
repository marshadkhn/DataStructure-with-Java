package OOPS;

class PrintMale{
    void name(){
        System.out.println("I am Boy");
    }
}
class PrintFemale extends PrintMale{                //Dynamic Polymorphism that occur at run time!
    @Override
    void name(){
        System.out.println("I am Female");
    }
}

public class Dynamic_Poly {
    public static void main(String[] args) {
        PrintFemale P = new PrintFemale();
        P.name();
    }
}
