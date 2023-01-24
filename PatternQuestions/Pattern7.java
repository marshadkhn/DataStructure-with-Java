package PatternQuestions;

public class Pattern7 {
    public static void main(String[] args) {
        //int num = 0;
        for (int i = 1; i <= 5; i++) {
           System.out.println(" ");
            for (int j = 1; j <= i; j++) {
                if(j % 2 == 1)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
               // System.out.println(" ");
            }
        }
    }
}
