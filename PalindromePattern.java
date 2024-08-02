/*
 Input: 5

          1 
        2 1 2 
      3 2 1 2 3 
    4 3 2 1 2 3 4 
  5 4 3 2 1 2 3 4 5 
  
 */

import java.util.Scanner;
class  PalindromePattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            for(j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
