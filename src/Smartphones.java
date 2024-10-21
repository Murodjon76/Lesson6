import java.util.Locale;
import java.util.Scanner;
import java.util.Set;


class Smartphones extends Parament {
    String model, network;
    String screenSize;

    public Smartphones(String model, String network, String os, String ram, String hard, String cpu, String screenSize, double price) {
        super(price, ram, hard, os, cpu);
        this.model = model;
        this.network = network;
        this.screenSize = screenSize;
    }


    @Override
    public String toString() {
        return "Smartphones{" +
                " model='" + model + '\'' +
                ", network='" + network + '\'' +
                ", ram=" + ram +
                ", hard=" + hard +
                ", os='" + os + '\'' +
                ", cpu='" + cpu + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", price=" + price +
                '}';
    }

    public static Smartphones addsmart() {
        Scanner sfb = new Scanner(System.in);
        sfb.useLocale(Locale.US);
        System.out.print("Введите наименование бренда смартфона: ");
        String m = sfb.nextLine();
        System.out.print("Введите вид связи смартфона: ");
        String netw = sfb.nextLine();
        System.out.print("Введите наименование ОС: ");
        String soss;
        soss = sfb.nextLine();
        System.out.print("Введите размер ОЗУ: ");
        String rr = sfb.nextLine();
        System.out.print("Введите размер ПЗУ: ");
        String shar = sfb.nextLine();
        System.out.print("Введите наименование процессора смартфона: ");
        String scp = sfb.nextLine();
        System.out.print("Введите размер диагонали дисплея смартфона: ");
        String sreen = sfb.nextLine();
        System.out.print("Введите цену смартфона: ");
        double sprice;
        sprice = sfb.nextDouble();
        sfb.nextLine();


        return new Smartphones(m, netw, soss, rr, shar, scp, sreen, sprice);
    }

    public static Integer smartfiltr(Set<Smartphones> sphones) {
        if (sphones.isEmpty()) {
            System.out.println("Данных по смартфонам не имеется");
            return 0;
        }
            System.out.println("Для фильтрации данных, прошу Вас, выбрать параметр.");
            System.out.println("1 - по наименованию модели, 2 - по размеру ОЗУ\n3 - по размеру ПЗУ, 4 - по наименованию процессора:");
            Scanner sc = new Scanner(System.in);
            int scom = sc.nextInt();
            sc.nextLine();
            int sco = 0;
            switch (scom) {
                case 1:
                    System.out.println("Введите наименование модели: ");
                    String sm;
                    sm = sc.nextLine();
                    for (Smartphones sphone : sphones) {
                        if (sphone.model.equals(sm)) {
                            sco++;
                            System.out.println(sphone);
                        }
                    }
                    return sco;
                case 2:
                    System.out.println("Введите размер ОЗУ: ");
                    String sr = sc.next();
                    for (Smartphones sphone : sphones) {
                        if (sphone.ram.equals(sr)) {
                            sco++;
                            System.out.println(sphone);
                        }
                    }
                    return sco;
                case 3:
                    System.out.println("Введите размер ПЗУ: ");
                    String sh = sc.nextLine();
                    for (Smartphones sphone : sphones) {
                        if (sphone.hard.equals(sh)) {
                            sco++;
                            System.out.println(sphone);
                        }
                    }
                    return sco;
                case 4:
                    System.out.print("Введите наименование процессора: ");
                    String scp = sc.next();
                    for (Smartphones sphone : sphones) {
                        if (sphone.cpu.equals(scp)) {
                            sco++;
                            System.out.println(sphone);
                        }
                    }
                    return sco;
                default:
                    System.out.println("Осуществлен ввод неверных параметров.");
                    return 0;
            }
        }

}



