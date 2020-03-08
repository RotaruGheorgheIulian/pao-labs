public class manusa {
    private int valoare;
    private String culoare;

    public manusa() {
        this.valoare = 0;
        this.culoare = "fara culoare";
    }

    public manusa(int value,String colour) {
        this.valoare = value;
        this.culoare = colour;
    }

    public void set_val(int value) {
        this.valoare = value;
    }

    public void set_cul(String color) {
        this.culoare = color;
    }

    public int get_val() {
        return this.valoare;
    }

    public int get_cul() {
        return this.culoare;
    }

    public void cresc_val() {
        this.valoare++;
    }

    public void get_informatii() {
        System.out.println("Manusa are valoarea: "+this.valoare+" si culoarea: "+this.culoare);
    }
}