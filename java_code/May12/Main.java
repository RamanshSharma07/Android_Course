package java_code.May12;
/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Maruti m = new Maruti();
        Tata t = new Tata();

        if(!m.isCarStated()) {
            m.startCar();
        }

        
    }
}