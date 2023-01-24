/*
Pattern to DRAW!
*****
*****
*****
*****
*****
*/

package PatternQuestions;

public class Pattern1 {
    public static void main(String[] args) {
        System.out.println();
        char star = '*';
        for (int i = 0; i < 5; i++){
            System.out.println();

            for (int j = 0; j < 5; j++) {
                System.out.print(star);
            }
        }
    }
}
