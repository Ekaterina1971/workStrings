public class Main {
    public static void printLeapYearStatus(int year) {
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void applicationSelection(int clientOs, int clientDeviceYear){
        if (clientOs == 0 && clientDeviceYear == 2024) {
            System.out.println("Установите версию приложения iOS по ссылке.");
        } else if (clientOs == 0 && clientDeviceYear < 2024) {
            System.out.println("Установите облегченную версию приложения iOS по ссылке.");
        } else if (clientOs == 1 && clientDeviceYear == 2024) {
          System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOs == 1 && clientDeviceYear < 2024) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
    }
    public static void main(String[] args) {
       // Задача №1
        System.out.println("задача №1");
        int year = 2020;
       printLeapYearStatus(year);
       // Задача №2
        System.out.println("Задача №2");
        int clientOs = 0;
        int clientDeviceYear = 2020;
        applicationSelection(clientOs, clientDeviceYear);
    }
}