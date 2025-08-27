//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        int clientDeviceYear = 2023;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        }

        int year = 1584;
        if (year >= 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            }
            else {
                System.out.println(year + " год не является високосным");
            }
        }

        int deliveryDistance = 43;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день");
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня");
        }
        else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется 3 дня");
        }
        else {
            System.out.println("Доставки нет");
        }

        int monthNumber = 12;
        if (monthNumber >= 9 && monthNumber <= 11) {
            System.out.println("Осенний месяц");
        }
        else if (monthNumber >= 3 && monthNumber <= 5) {
            System.out.println("Весенний месяц");
        }
        else if (monthNumber >= 6 && monthNumber <= 8) {
            System.out.println("Летний месяц");
        }
        else {
            System.out.println("Зимний месяц");
        }
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}