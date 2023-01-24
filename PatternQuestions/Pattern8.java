//        A
//        AB
//        ABC
//        ABCD
//        ABCDE
package PatternQuestions;

public class Pattern8 {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            System.out.println();
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j);
            }

        }
    }
}
