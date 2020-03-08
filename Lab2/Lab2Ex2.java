import java.util.Scanner;

public class Lab2Ex2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n = keyboard.nextInt();
        int[]x = new int[n];
        int[]y = new int[n];
        int nrimp=0,nrpar=0;
        for(int i=0;i<n;++i)
        {
            int nr = keyboard.nextInt();
            if(nr%2 == 1)
            {
                x[nrimp]=nr;
                ++nrimp;
            }
            else
            {
                y[nrpar] = nr;
                ++nrpar;
            }
        }
        if(nrimp>nrpar)
        {
            for(int i =0 ; i< nrimp;++i)
                System.out.print(x[i]+" ");
        }
        else if(nrimp<nrpar)
        {
            for(int i =0 ; i< nrpar;++i)
                System.out.print(y[i]+" ");
        }
        else System.out.print("Sau gasit un numar egal de numere de paritati diferite");
        keyboard.close();
    }
}
