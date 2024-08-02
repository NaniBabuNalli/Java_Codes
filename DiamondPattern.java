/*
Input : 5


        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
 */

import java.util.Scanner;
class  DiamondPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        //First half
        for(i=1;i<=n;i++){
            for(j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            for(j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Second Half
        for(i=n-1;i>=1;i--){
            for(j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            for(j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}