public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS < 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS > 1) {
            System.out.println("Не существует такого варианта");

        }
        // Задача 2
        System.out.println("Задача 2");
        int clientDeviceYear = 2013;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задача 3
        System.out.println("Задача 3");
        int year = 400;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");

        }

        // Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int timeDelivery = 1;
        if (deliveryDistance >= 20) {
            timeDelivery++;
        }

        if (deliveryDistance >= 60) {
            timeDelivery++;
        }
        System.out.println("Потребуется дней " + timeDelivery);

        // Задача 5
        System.out.println("Задача 5");

        int monthNumber = 14;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Этот месяц принадлежит зиме");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит весне");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит лету");
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит лету");
            default:
                System.out.println("Такого месяца не существует");

        }
    }



    }





