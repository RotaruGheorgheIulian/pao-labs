public class Lab2Ex3 {
    
    public static void main(String[] args) {
        manusa DeIarna = new manusa();
        DeIarna.set_cul("neagra");
        DeIarna.set_val(5);
        DeIarna.get_informatii();
        DeIarna.cresc_val();
        DeIarna.get_informatii();
        manusa mare = new manusa(10,"alb");
        mare.get_informatii();
    }
}