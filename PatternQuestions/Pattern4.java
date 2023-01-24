/*
Pattern to DRAW!
1
12
123
1234
12345
*/
package PatternQuestions;

public class Pattern4 {
    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            System.out.println();
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
        }
    }
}
