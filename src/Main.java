public class Main {
    public static void leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void systemPhone(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите новую версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите новую версию приложения для iOS по ссылке");
        } else {
            System.out.println("На вашем устройстве последняя версия приложения");
        }

    }

    public static void deliveryDistance(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется сутки");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется 3 дня");
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");

        int[] years = new int[125];
        for (int i = 0; i <= years.length - 1; i++) {
            years[i] = (i + 1900);

        }
        for (final int i : years) {
            leapYear(i);
        }


        //Задача 2
        System.out.println("Задача 2");

        systemPhone(1, 2015);


        //Задача 3
        System.out.println("Задача 3");

        deliveryDistance(32);




    }

}