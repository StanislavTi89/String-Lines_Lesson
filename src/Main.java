public class Main {
    public static void main(String[] args) {
        System.out.println("Строки-Length!");

        //Задание 1
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        //Задание 2
        System.out.println("Задание 2");
        String upFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upFullName);

        //Задание 3
        System.out.println("Задание 3");
        String fullName2 = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName2.replace("ё", "е"));

    }
}