import java.util.Scanner;

public class Lab1Ex6 {

    static int lg_put(int a,int b) {
        int ans=a;
        for(int i=2;i<=b;++i)
            ans*=a;
        return ans;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introdu a:");
        int a = keyboard.nextInt();
        System.out.println("Introdu b:");
        int b = keyboard.nextInt();
        System.out.print("a^b: "+lg_put(a,b));
        keyboard.close();
    }
}