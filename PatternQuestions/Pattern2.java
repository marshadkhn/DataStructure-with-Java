/*
Pattern to DRAW!
*
**
***
****
*****
*/
package PatternQuestions;

public class Pattern2 {
    public static void main(String[] args) {
    char star = '*';
        for (int i = 1; i <= 6; i++) {
            System.out.println();
            for (int j = 1; j < i; j++) {
                System.out.print(star);
            }
        }
    }
}
