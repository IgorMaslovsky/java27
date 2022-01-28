package lesson5;

import java.util.Scanner;

public class main4 {                   //приложение для выбора туров
    public static void main(String[] args) {
        String[][] tours = {{"Турция", "5 дней", "самолёт", "5 звёзд", "120000"},
                {"Турция", "7 дней", "самолёт", "4 звёзд", "100000"},
                {"Греция", "6 дней", "самолёт", "3 звёзд", "90000"},
                {"Турция", "12 дней", "самолёт", "4 звёзд", "80000"},
                {"Эмираты", "6 дней", "самолёт", "5 звёзд", "150000"}};

        Scanner scanner = new Scanner(System.in);
        System.out.println("В какую страну вы хотите поехать?");

        String country = scanner.nextLine();
        System.out.println("У нас есть вот такие туры в" + country);
        for (int i = 0; i < tours.length; i++) {
            if (country.equalsIgnoreCase(tours[i][0])) {  //если то что ввёл совпало с тем что лежит в нулевой ячеечке,то
                System.out.println(tours[i][0] + ", на" + tours[i][1] + "," + tours[i][2]  //должны вывести всю строку
                        + "," + tours[i][3] + ", цена-" + tours[i][4]);
            }


        }
        System.out.println("Сколько максимум дней для поездки?");
        String dayStr = scanner.nextLine();

        int day = Integer.parseInt(dayStr);
        for (int i = 0; i < tours.length; i++) {
            int dayFromTour = Integer.parseInt(tours[i][1].replaceAll("[\\D]", ""));
            if (dayFromTour <= day) {

            }
            System.out.println(dayFromTour);
        }
                System.out.println("Отель на сколько звёзд вы предпочитаете?");
                String star = scanner.nextLine();

                int stars = Integer.parseInt(star);
                for (int i = 0; i < tours.length; i++) {
                    int hotelStars = Integer.parseInt(tours[i][3].replaceAll("[\\D]", ""));
                    if (hotelStars <= stars) {
                        System.out.println(tours[i][0] + ", на" + tours[i][1] + "," + tours[i][2]
                                + "," + tours[i][3] + ", цена-" + tours[i][4]);
                    }

                }
            }
        }
        //1-вывести на консоль все туры от и до введённой цены
        //2-среднюю цену тура в нашем огенстве
        //3-туры от скольки то звёзд и выше

