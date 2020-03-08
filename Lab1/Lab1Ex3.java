import java.util.Scanner;

public class Lab1Ex3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introdu n:");
        int n = keyboard.nextInt();
        for(int i=1;i<=n;++i)
            if(n%i==0)
                System.out.print(i+" ");
        keyboard.close();
    }
}