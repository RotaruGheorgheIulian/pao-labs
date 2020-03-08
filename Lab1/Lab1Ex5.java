import java.util.Scanner;

public class Lab1Ex5 {

    static boolean is_prim(int N) {
        for(int i=2;i*i<=N;++i)
            if(N%i==0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introdu n:");
        int n = keyboard.nextInt();
        if(is_prim(n))
            System.out.print("n este prim");
        else
            System.out.print("n nu este prim");
        keyboard.close();
    }
}