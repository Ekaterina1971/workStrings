public class Main {
    public static void main(String[] args) {
        // Задача №1
        System.out.println("Задача №1");
        String fistName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = fistName + " " + middleName + " " + lastName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        // Задача №2
        System.out.println("Задача №2");
        String fuulName = fistName + " " + middleName + " " + lastName;
        System.out.println(fuulName.toUpperCase());
        // Задача №3
        System.out.println("Задача №3");
        String fullName1 = "Иванов Семён Семёнович";
        String fullNameTrue = fullName1.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника - " + fullNameTrue);
    }
}