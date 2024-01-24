/**
 * JavaProb45
 */
public class JavaProb45 {

    public static void main(String[] args) {
        int numRows = 5;

        for (int i = 1; i < numRows+1; i++) {
            for (int j = 0; j < numRows - i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1)/2; k++) {
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }
}