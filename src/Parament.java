public class Parament {
    double price;
    String ram, hard, os, cpu;

    public String getParamentType() {
        return getClass().getSimpleName();
    }
    public Parament(double price, String ram, String hard, String os, String cpu) {
        this.price = price;
        this.ram = ram;
        this.hard = hard;
        this.os = os;
        this.cpu = cpu;
    }

}
