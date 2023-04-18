public class Main {
    public static void main(String[] args) {
        //ex1;
        System.out.println("условный оператор 2 Задача -1-2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientDeviceYear <= 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS <= 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //ex1;
        System.out.println("условный оператор 2 Задача -3");
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(+year + " год является високосным.");
        } else {
            System.out.println(+year + " год не является високосным.");
        }

        //ex1;
        System.out.println("условный оператор 2 Задача -4");
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance > 20) {
            deliveryDay++;
        }
        if (deliveryDistance > 60) {
            deliveryDay++;
        }
        System.out.println("Потребуется дней: " + deliveryDay);

        //ex1;
        System.out.println("условный оператор 2 Задача -5");
    int monthNumber = 14;
        switch (monthNumber) {
        case 12:
        case 1:
        case 2:
            System.out.println("Зима");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("Весна");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("Лето");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("Осень");
            break;
        default:
            System.out.println("Ошибка " + monthNumber);
    }
}}









