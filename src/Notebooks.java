import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

class Notebooks extends Parament {

    public String brand;
    public String color;


    public Notebooks(String brand, String ram, String hard, String os, String cpu, String color, double price) {
        super(price, ram, hard, os, cpu);
        this.brand = brand;
        this.color = color;

    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", hard=" + hard +
                ", os='" + os + '\'' +
                ", cpu='" + cpu + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
    public static Notebooks addnote() {
        Scanner nb = new Scanner(System.in);
        nb.useLocale(Locale.US);
        System.out.print("Введите наименование бренда ноутбука: ");
        String b=nb.nextLine();
        System.out.print("Введите размер ОЗУ: ");
        String r =nb.nextLine();
        System.out.print("Введите размер ПЗУ: ");
        String har=nb.nextLine();
        System.out.print("Введите наименование ОС: ");
        String oss;
        oss = nb.nextLine();
        System.out.print("Введите наименование процессора ноутбука: ");
        String cp=nb.nextLine();
        System.out.print("Введите цвет ноутбука: ");
        String col=nb.nextLine();
        System.out.print("Введите цену ноутбука: ");
        double price;
        price = nb.nextDouble();
        nb.nextLine();


        return new Notebooks(b,r,har,oss,cp,col,price);
    }

    public static Integer notefiltr (Set<Notebooks> nbooks) {
        if(nbooks.isEmpty()) {
            System.out.println("Данных по ноутбукам не имеется");
            return 0;
        }
        System.out.println("Для фильтрации данных, прошу Вас, выбрать параметр.");
        System.out.println("1 - по наименованию модели\n2 - размер ОЗУ\n3 - размер ПЗУ\n4 - по процессору");
        Scanner nc = new Scanner(System.in);
        int notecom = nc.nextInt();
        int nco=0;
        switch (notecom) {
            case 1:
                System.out.println("Введите наименование модели: ");
                String nm = nc.nextLine();
                for(Notebooks note: nbooks) {
                    if(note.brand.equals(nm)) {
                        nco++;
                        System.out.println(note);
                    }
                }
                return nco;
            case 2:
                System.out.println("Введите размер ОЗУ: ");
                String nr = nc.nextLine();
                for(Notebooks note:nbooks) {
                    if(note.ram.equals(nr)) {
                        nco++;
                        System.out.println(note);
                    }
                }
                return nco;
            case 3:
                System.out.println("Введите размер ПЗУ: ");
                String nh = nc.nextLine();
                for(Notebooks note: nbooks) {
                    if(note.hard.equals(nh)) {
                        nco++;
                        System.out.println(note);
                    }
                }
                return nco;
            case 4:
                System.out.println("Введите наименование процессора: ");
                String ncp = nc.nextLine();
                for(Notebooks note: nbooks) {
                    if(note.cpu.equals(ncp)) {
                        nco++;
                        System.out.println(note);
                    }
                }
                return nco;
            default:
                System.out.println("Осуществлен ввод неверных параметров.");
                return null;
        }


    }
}