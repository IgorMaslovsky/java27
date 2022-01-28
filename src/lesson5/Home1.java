package lesson5;

import java.util.Scanner;

public class Home1 {
    public static void main(String[] args) {

        String[][] tours = {{"Турция", "5 дней", "самолёт", "5 звёзд", "120000"},
                {"Турция", "7 дней", "самолёт", "4 звёзд", "100000"},
                {"Греция", "6 дней", "самолёт", "3 звёзд", "90000"},
                {"Турция", "12 дней", "самолёт", "4 звёзд", "80000"},
                {"Эмираты", "6 дней", "самолёт", "5 звёзд", "150000"}};

        System.out.println("Список возможностей:");
        System.out.println("1-Вывести все туры:");
        System.out.println("2-Вывести туры от и до указанной цены:");
        System.out.println("3-Вывести среднюю цену любого тура:");
        System.out.println("4-Вывести туры по количеству звёзд:");
        System.out.println("Введите номер действия:");

        Scanner scanner = new Scanner(System.in);

        String numberActionStr = scanner.nextLine();
        int numberAction = Integer.parseInt(numberActionStr);

        switch (numberAction) {
            case 1 -> {
                System.out.println("Список всех туров:");

                for (int i = 0; i < tours[i].length; i++) {
                    for (int j = 0; j < tours[i].length; j++) {
                        System.out.println(tours[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            case 2 -> {
                System.out.println("Введите цену от:");
                int priceStart = scanner.nextInt();

                System.out.println("Введите цену до:");
                int priceFinish = scanner.nextInt();

                System.out.println("Список туров с ценой от " + priceStart + "и до" + priceFinish);
                for (int i = 0; i < tours.length; i++) {
                    int priceFromTour = Integer.parseInt(tours[i][4].replaceAll( "[\\D]", ""));
                    if (priceFromTour >= priceStart && priceFromTour <= priceFinish) {
                        System.out.println(tours[i][0] + " " + tours[i][1] + " " + tours[i][2] + " "
                                + tours[i][3] + " " + tours[i][4]);
                    }
                }
            }
            case 3 ->{
                System.out.println("Введите страну:");
                String country = scanner.nextLine();

                System.out.println("Средняя цена тура:");
                int sum = 0;
                int number = 0;
                for (int i=0; i<tours.length; i++){
                    if (country.equalsIgnoreCase(tours[i][0])){
                        int priceFromTour = Integer.parseInt(tours[i][4].replaceAll("[\\D]",""));
                        sum+=priceFromTour;
                        number++;

                    }
                }
                System.out.println(sum/number + "руб.");
            }
            case 4 ->{
                System.out.println("Введите количество звёзд:");
                int star = scanner.nextInt();
                for (int i=0; i<tours.length; i++){
                    int numberStar = Integer.parseInt(tours[i][4].replaceAll("[\\D]",""));
                    if (numberStar == star){
                        System.out.println(tours[i][0] + " " + tours[i][1] + " " + tours[i][2] + " "
                                + tours[i][3] + " " + tours[i][4]);
                    }
                }
            }
            default -> System.out.println("Нет такой возможности программа закрыта.");
        }


    }
}
