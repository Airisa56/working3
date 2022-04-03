package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        int clientOS = 1;
        if (clientOS <= 0) {
            System.out.println(" Установите версию приложения для IOS по ссылке");
        } else if (clientOS >= 1) {
            System.out.println(" Установите версию приложения для Android по ссылке");
        }

        // Задание 2
        int clientDeviceYear = 2015;
        char a = 'y';
        char b = 'z';
        if (a >= clientDeviceYear && a <= clientDeviceYear) ;
        {
            System.out.println(" Установите  приложения для Android по ссылке");
        }
        if (b >= clientDeviceYear && b <= clientDeviceYear) ;
        {

            System.out.println(" Установите приложения для IOS по ссылке");
        }
        if (a >= clientDeviceYear) ;
        {
            System.out.println(" Установите облегченную версию для Android по ссылке");
        }
        if (b >= clientDeviceYear) ;
        {
            System.out.println(" Установите облегченную версию для IOS по ссылке");


        }

        // Задание 3
        int year = 2015;
        int year1 = 2015 / 100;
        int year2 = 2015 / 400;
        if (year == year1) ;
        {
            System.out.println(" Год не является високосным");
            if (year == year2) ;
            {
                System.out.println(" Год является високосным ");
            }

            // Задание 4
            int deliveryDistance = 95;
            int oneDay = 20;
            int secondDay = 60;
            int thirdDay = 100;
            if (deliveryDistance <= oneDay) ;
            {
                System.out.println(" Доставка займет сутки");
            }
            if (deliveryDistance > oneDay && deliveryDistance < secondDay) ;
            {
                System.out.println(" Доставка займет 2 дня");
                if (deliveryDistance > secondDay && deliveryDistance < thirdDay) ;
                {
                    System.out.println(" Доставка займет 3 дня");
                }


            }
        }
        // Задание 5
        int mothNumber = 12;
          switch ( mothNumber) {
              case 12 :
              case 1 :
              case 2 :
           System.out.println( " Зима");
           break;
              case 3 :
              case 4 :
              case 5 :
           System.out.println( " Весна");
           break;
              case 6 :
              case 7 :
              case 8 :
           System.out.println( " Лето");
           break;
              case 9 :
              case 10 :
              case 11 :
           System.out.println( " Осень");
           break;
              default:
           System.out.println( " Такого месяца не существует");
          }
    }
}











