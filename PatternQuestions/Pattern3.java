/*Pattern To DRAW!
1
22
333
4444
55555
*/

package PatternQuestions;

public class Pattern3 {
    public static void main(String[] args){
        for (int i = 0; i < 6; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
        }
    }
}
