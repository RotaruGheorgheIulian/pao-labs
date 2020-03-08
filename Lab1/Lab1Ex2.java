import java.util.Scanner;

public class Lab1Ex2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introdu primul numar:");
        int a = keyboard.nextInt();
        System.out.println("Introdu al doilea numar:");
        int b = keyboard.nextInt();
        if(a>b) System.out.println("Numarul mai mare este: "+a);
        else System.out.println("Numarul mai mare este: "+b);
        keyboard.close();
    }
}