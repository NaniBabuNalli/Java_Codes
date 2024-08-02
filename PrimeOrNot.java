package FunctionsMethods;
import java.util.Scanner;
public class PrimeOrNot {
    public static boolean  prime (int n1){
        for(int i=2 ;i<=(n1/2);i++){
            if (n1%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.print(prime(n1));
    }
}

/*
 * Function :- A block of code which takes input and performs operation and  produce output.
 * 
 */