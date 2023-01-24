package OOPS;

public class Inheritance {
    static class penParent {
        int price;
        String name;
    }

    //This pen class is child and inheriting some properties from Parent Pen!
    static class penChild extends penParent {
        int len;
        int timeTillUsed;
    }

    static class penChild2 extends penChild{
        String body;

        public penChild2(int price, String name, String body, int len, int timeTillUsed) {
            super.price = price;
            super.name = name;
            this.body = body;
            super.timeTillUsed = timeTillUsed;
            super.len = len;
        }
    }
    public static void main(String[] args) {
        penChild Pen = new penChild();
        System.out.println(Pen.price = 25);
        System.out.println(Pen.name = "Trimax");
        System.out.println(Pen.len = 4);
        System.out.println(Pen.timeTillUsed = 4);

        penChild2 Pen2 = new penChild2(25,"Fountain","Metallic",3,6);
        System.out.println(Pen2.body);
    }
}
