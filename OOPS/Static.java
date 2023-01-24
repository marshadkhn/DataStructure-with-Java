package OOPS;

class Human{
    int age;
    String name;
    static int population;

    public Human(int age, String name, int population) {
        this.age = age;
        this.name = name;
        Human.population += 1;
    }
}
public class Static {
    public static void main(String[] args) {
        //Human Arshad = new Human(21, "ARSHAD");
        // Human Arshad =  new Human(21, "ARSHAD",1);
        // Human King = new Human(22,"King",1);

        System.out.println(Human.population);
    }
}
