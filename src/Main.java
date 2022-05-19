import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Exercise 1

        int year = 2034;
        printLeapYear(year);

        // Exercise 2

        int os = 1;
        int clientDeviceYear = 2013;
        printVersion(os, clientDeviceYear);

        //Exercise 3
        System.out.println();
        int deliveryDistance = 95;
        int deliveryTime = 1;
        int countDeliveryTime = countDeliveryTime(deliveryDistance);
        System.out.println("Потребуется дней: " + countDeliveryTime);

        }


    private static void printLeapYear(int year) {
        boolean isLeapYear = isLeapYear(year);
        if (isLeapYear) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }
    }
    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }


    private static void printVersion(int os, int clientDeviceYear) {
    int currentYear = LocalDate.now().getYear();
    if (clientDeviceYear > currentYear) {
        System.out.print("Установите lite-версию приложения для ");
    } else {
        System.out.print("Установите версию приложения для ");
    }
        if (os == 1) {
        System.out.print("Android");
    } else {
        System.out.print("IOS");
        }
    }
    private static int countDeliveryTime (int deliveryDistance) {
        int deliveryTime = 4;
        if (deliveryDistance <= 20) {
            deliveryTime = 1;
        }
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            deliveryTime = 2;
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
        }
            return deliveryTime;
        }}