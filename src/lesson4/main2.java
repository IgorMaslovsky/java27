package lesson4;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        System.out.println("Введите ваш возраст:");
        Scanner scaner = new Scanner(System.in);  //Scanner-считывание с клавиатуры, System.in-клавиатура
        String age = scaner.next();           // Integer-текст переводит в интовое значение
        int ageInt = Integer.parseInt(age);  //Integer.parseInt-распознать текстовое число
        if (ageInt > 0 && ageInt <= 10) {
            System.out.println("Вы ребёнок");
        } else if (ageInt > 11 && ageInt <= 17) {
            System.out.println("Вы подросток");
        } else if (ageInt > 18 && ageInt <= 35) {
            System.out.println("Вы взрослый");
        } else if (ageInt > 36 && ageInt <= 50) {
            System.out.println("Вы зрелый");
        } else if (ageInt > 51 && ageInt <= 150) {
            System.out.println("Вы старик");

        }else {
            System.out.println("Вы ввели неверный возраст");
        }
    }
}