package FunctionsMethods;
import java.util.Scanner;
public class CheckEvenOrOdd {
    public static void  EvenOrOdd (int n){
        if (n%2==0)
            System.out.print("Even Number");
        else
            System.out.print("Odd Number");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        EvenOrOdd(n);
    }
}

/*
 * Function :- A block of code which takes input and performs operation and  produce output.
 * 
 */