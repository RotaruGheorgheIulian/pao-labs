import java.util.Scanner;

public class Lab1Ex7 {

    static int fibo(int N) {
        if(N<3) return 1;
        int a=1,b=1,c;
        for(int i=3;i<=N;++i)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introdu n:");
        int n = keyboard.nextInt();
        System.out.print("Al n-lea termen Fibonacci este "+fibo(n));
        keyboard.close();
    }
}