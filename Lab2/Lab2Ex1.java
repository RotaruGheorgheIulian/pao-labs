import java.util.Scanner;

public class Lab2Ex1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int ok = 1;
        int sum = 0;
        int nrnum = 0;
        while(ok==1)
        {
            System.out.println("Introdu o nota:");
            int nr = keyboard.nextInt();
            if(nr==-1) ok = 0;
            else
            {
                sum += nr;
                nrnum++;
            }
        }
        double media = (double)sum/(double)nrnum;
        System.out.println(media);
        keyboard.close();
    }
}
