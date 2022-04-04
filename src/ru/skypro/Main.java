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
        {
            char operSystem = 'a';
            int clientDeviceYear = 2010;
            if (operSystem == 'a' && clientDeviceYear < 2015) {
                System.out.println(" Операционная система Андроид");
                System.out.println(" Установите облегченную версию для Андроид по ссылке");
            } else if (operSystem == 'a' && clientDeviceYear >= 2015 && clientDeviceYear <= 2022) {
                System.out.println(" Операционная система Андроид ");
                System.out.println(" Установите приложение");

            } else if (operSystem == 'i' && clientDeviceYear < 2015) {
                System.out.println(" Операционная система IOS ");
                System.out.println(" Установите облегченную версию для IOS по ссылке");
            } else if (operSystem == 'i' && clientDeviceYear >= 2015 && clientDeviceYear <= 2022) {
                System.out.println(" Операционная система IOS");
                System.out.println(" Установите приложение");
            }


        }

        // Задание 3
        int year = 2010;

        if (year % 400 == 0) {
            System.out.println(" Високосный год");
        }  else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println( " Високосный год"); }
           else {
               System.out.println( " Не високосный год"); }


        // Задание 4

        int deliveryDistance = 95;
           if ( deliveryDistance <= 20) {
               System.out.println( " Доставка займет сутки");
           }
           else if ( deliveryDistance > 20 && deliveryDistance <= 60) {
               System.out.println( " Доставка займет 2 дня");
           }
           else if ( deliveryDistance > 60 && deliveryDistance <= 100) {
               System.out.println( " Доставка займет 3 дня");
           }

        // Задание 5

        int mothNumber = 12 ;
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
           System.out.println( " Лето");
           break;
               default:
           System.out.println( " Такого месяца не существует");
           }




        }
    }













