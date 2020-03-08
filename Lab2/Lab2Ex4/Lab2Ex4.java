import java.util.Scanner;

public class Lab2Ex4 {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = Integer.parseInt(keyboard.nextLine());
        Student Studenti[] = new Student[n];
        for(int i = 0; i < n; i++) {
            String linie = keyboard.nextLine();
            String[] chestii = linie.split(" ");
            String nume = chestii[0];
            int nota = Integer.parseInt(chestii[1]);
            Studenti[i] = new Student(nume,nota);
        }
        for(int i = 0; i < n ; i++)
            Studenti[i].get_informatii();
        keyboard.close();
    }
}