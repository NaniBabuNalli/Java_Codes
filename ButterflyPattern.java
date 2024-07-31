/* Implement Java Code to implement Following Pattern
 I/P : 4
 4
        *             * 
        * *         * * 
        * * *     * * * 
        * * * * * * * * 
        * * * * * * * * 
        * * *     * * * 
        * *         * * 
        *             * 
  
 */




import java.util.Scanner;
class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int b = 0;
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                b += 1;
            }
            b *= 2; 
            b = n*2 - b;
            for (int j = 1; j <= b; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i !=0; i--) {
            int b = 0;
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                b += 1;
            }
            b *= 2; 
            b = n*2 - b;
            for (int j = 1; j <= b; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
