import java.util.Scanner;

public class Lab1Ex4 {

    static int factorial(int N) {
        int ans = 1;
        for(int i=2;i<=N;++i)
            ans*=i;
        return ans;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introdu n:");
        int n = keyboard.nextInt();
        int fact=factorial(n);
        System.out.print("n! este: "+fact);
        keyboard.close();
    }
}