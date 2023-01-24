//        A
//        BB
//        CCC
//        DDDD
//        EEEEE
package PatternQuestions;

public class Pattern9 {
    public static void main(String[] args){
        for (char i = 'A'; i <= 'E'; i++){
            System.out.println();
            for (char j = 'A'; j <= i; j++){
                System.out.print(i);
            }
        }
    }
}
