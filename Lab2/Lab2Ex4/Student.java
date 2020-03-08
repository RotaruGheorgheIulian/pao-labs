public class Student {
    private String nume;
    private int nota;

    public Student() {
        this.nume = "nare nume";
        this.nota = 0;
    }

    public Student(String a,int b) {
        this.nume = a;
        this.nota = b;
    }

    public void set_nume(String a) {
        this.nume = a;
    }

    public void set_nota(int b) {
        this.nota = b;
    }

    public int get_nume() {
        return this.nume;
    }

    public int get_nota() {
        return this.nota;
    }

    public void get_informatii() {
        System.out.println("Studentul: "+this.nume+" are nota: "+this.nota);
    }
}