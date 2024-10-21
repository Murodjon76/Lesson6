import java.util.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int n = 1;
        Set<Smartphones> phones = new HashSet<>();
        Set<Notebooks> books = new HashSet<>();
        System.out.println("Добро пожаловать!\n" +
                           "Данная программа выполняет операции с разделами 'Смартфоны' и 'Ноутбуки'\n" +
                "Перед началом работы ознакомтель с командами программы и их назначениями, выполнив команду 'Help'");
        while (n == 1) {
            System.out.println("Для работы введите команду:");
            Scanner comm = new Scanner(System.in);
            comm.useLocale(Locale.US);
            String command = comm.nextLine();
            switch (command) {
                case "help":
                    System.out.println("add - Добавить новый продукт\n" +
                            "help - Команды и их назначения\n" +
                            "filter - фильтрация данных\n" +
                            "exit - выход из программы\n" +
                            "print - вывод на печать базы данных");
                    break;
                case "add":
                    System.out.println("В какой раздел добавить новый товар? (1 - ноутбуки/2 - смартфоны)");
                    System.out.println("Введите номер раздела: ");
                    int number = comm.nextInt();
                    if (number == 1) {
                        books.add(Notebooks.addnote());
                        System.out.println("Добавлена новая запись в раздел!");
                    } else if (number == 2) {
                        phones.add(Smartphones.addsmart());
                        System.out.println("Добавлена новая запись в раздел!");
                    } else {
                        System.out.println("Осуществлен ввод неверных параметров");
                    }
                    break;
                case "filter":
                    System.out.println("Выберите раздел для фильтрации (1 - ноутбуки/2 - смартфоны)");
                    int number1 = comm.nextInt();
                    if(number1 == 1) {
                        System.out.printf("Найдено %d записей",Notebooks.notefiltr(books));
                        System.out.println();
                    }
                    else if(number1 == 2) {
                        System.out.printf("Найдено %d записей",Smartphones.smartfiltr(phones));
                        System.out.println();
                    }
                    else {
                        System.out.println("Осуществлен ввод неверных параметров");
                    }
                    break;
                case "print":
                    System.out.println("Выберите раздел для фильтрации (1 - ноутбуки/2 - смартфоны)");
                    int number2 = comm.nextInt();
                    comm.nextLine();
                    if(number2 == 1) {
                        for (Notebooks notebook : books) System.out.println(notebook);
                    }
                    else if(number2 == 2) {
                        for(Smartphones smartphone : phones) System.out.println(smartphone);
                    }
                    else {
                        System.out.println("Осуществлен ввод неверных параметров");
                    }
                    break;
                case "exit":
                    System.out.println("Рады были с Вами поработать! До свидание!");
                    n++;
                    break;
                default:
                    System.out.println("Неверная команда!\nДля получение помощи наберите команду help, для выхода из программы наберите команду exit\n");
                    break;
            }
        }


    }
}
