import java.time.LocalDate;

public class Main {
    public static void Task1() {
        System.out.println("Task1:");
        int year = 2017;
        CheckLeapYear(year);
        System.out.println("##########\n");
    }

    public static void Task2() {
        System.out.println("Task2:");
        int clientOS = 1;
        int clientDeviceYear = LocalDate.now().getYear();
        determineVersion(clientOS, clientDeviceYear);
        System.out.println("##########\n");
    }

    public static void Task3() {
        System.out.println("Task3:");
        int deliveryDistance = 12;
        if (GetDeliveryTimes(deliveryDistance) != 0)
            System.out.println("Потребуется дней: " + GetDeliveryTimes(deliveryDistance));
        else
            System.out.println("На данное расстояние доставки нет.");
        System.out.println("##########");
    }

    public static void CheckLeapYear(int year) {
        if (year % 4 == 0 || year % 400 == 0)
            System.out.println(year + " год является високосным");
        else if(year % 100 == 0)
            System.out.println(year + " год не является високосным");
        else
            System.out.println(year + " год не является високосным");
    }

    public static void determineVersion(int osType, int year) {
        if (osType == 1 && year <= 2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        else if (osType == 1)
            System.out.println("Установите версию приложения для Android по ссылке.");
        else if (osType == 0 && year <= 2015)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        else if (osType == 0)
            System.out.println("Для iOS — «Установите версию приложения для iOS по ссылке».");
    }

    public static int GetDeliveryTimes(int deliveryDistance) {
        if (deliveryDistance <= 20)
            return 1;
        else if (deliveryDistance <= 60)
            return 2;
        else if (deliveryDistance <= 100)
            return 3;
        else
            return 0;
    }

    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
    }
}