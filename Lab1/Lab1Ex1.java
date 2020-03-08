import java.util.Scanner;

public class Lab1Ex1 {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introdu n:");
        int n = keyboard.nextInt();
        for(int i = 0; i <= n; i += 2)
            System.out.print(i+" ");
        System.out.println();
        keyboard.close();
    }
}