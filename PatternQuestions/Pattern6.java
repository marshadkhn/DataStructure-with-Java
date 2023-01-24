/*
        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
*/
package PatternQuestions;
public class Pattern6 {
    public static void main(String[] args) {
        char star = '*';
        for (int i = 1; i <= 6; i++) {
            System.out.println();
            for (int j = 1; j < i; j++) {
                System.out.print(star);
            }
        }
        for (int i = 5; i > 0; i--) {
            System.out.println();
            for (int j = i; j > 1; j--) {
                System.out.print(star);
            }
        }
    }
}
