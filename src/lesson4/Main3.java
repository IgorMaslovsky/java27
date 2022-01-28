package lesson4;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {  //по введённым данным посчитать площадь и периметр фигур
        System.out.println("Выберите фигуру:");
        System.out.println("1-круг");
        System.out.println("2-овал");
        System.out.println("3-треугольник");
        System.out.println("4-прямоугольник");
        System.out.println("5-трапеция");

        Scanner scanner = new Scanner(System.in);
        String figura = scanner.nextLine();//строчку которую вбил пользователь сохранили на переменную фигуры

        if (figura.equals("1") || figura.equalsIgnoreCase("круг")) { //equalsIgnoreCase-равенство без учёта регистра
            System.out.println("Введите радиус круга:");                       //сравнение
            String radiusStr = scanner.nextLine();
            double radius = Double.parseDouble(radiusStr);//переводим стринговое значение в дабл
            System.out.println("Площадь или окружность?");
            String action = scanner.nextLine();
            if (action.equals("1") || action.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь круга:" + (Math.PI * (radius * radius)));
            } else {
                System.out.println("Окружность круга:" + (2 * Math.PI * radius));
            }

        } else if (figura.equals("2") || figura.equalsIgnoreCase("овал")) {
            {
                System.out.println("Введите длинну большой полуоси:");
                System.out.println("Введите длинну малой полуоси:");
                String poluos1 = scanner.nextLine();
                String poluos2 = scanner.nextLine();
                double poluosA = Double.parseDouble(poluos1);
                double poluosB = Double.parseDouble(poluos2);
                int kvadrat = 2;
                double b = poluosA - poluosB;
                System.out.println("Площадь или окружность?");
                String action = scanner.nextLine();
                if (action.equalsIgnoreCase("Площадь") || action.equals("1")) {
                    System.out.println("Площадь круга:" + (Math.PI * poluosA * poluosB));
                } else {
                    System.out.println("Окружность круга:" + (4 * (Math.PI
                            * poluosA * poluosB + Math.pow(b, kvadrat)) / (poluosA + poluosB)));
                }
            }
        } else if (figura.equals("3") || figura.equalsIgnoreCase("треугольник")) {

            System.out.println("Введите длинну стороны - а:");
            System.out.println("Введите длинну стороны - б:");
            System.out.println("Введите длинну стороны - с:");
            String dlinnaA = scanner.nextLine();
            String dlinnaB = scanner.nextLine();
            String dlinnaC = scanner.nextLine();
            double dlinna = Double.parseDouble(dlinnaA);
            double dlinnab = Double.parseDouble(dlinnaB);
            double dlinnac = Double.parseDouble(dlinnaC);
            double perimetr = dlinna + dlinnab + dlinnac;
            System.out.println("Площадь или периметр?");
            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("Площадь") || action.equals("1")) {
                System.out.println("Площадь треугольника:" + (Math.sqrt(perimetr * (perimetr - dlinna) * (perimetr - dlinnab)
                        * (perimetr - dlinnac))));
            } else {
                System.out.println("Периметр треугольника:" + (perimetr));
            }
        } else if (figura.equals("4") || figura.equalsIgnoreCase("прямоугольник")) {

            System.out.println("Введите длинну стороны(а) :");
            System.out.println("Введите длинну стороны(b) :");
            String dlinnaA = scanner.nextLine();
            String dlinnaB = scanner.nextLine();
            double dlinna = Double.parseDouble(dlinnaA);
            double dlinnab = Double.parseDouble(dlinnaB);
            System.out.println("Площадь или периметр?");
            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("Площадь") || action.equals("1")) {
                System.out.println("Площадь прямоугольника:" + (dlinna * dlinnab));
            } else {
                System.out.println("Периметр прямоугольника:" + (2 * (dlinna + dlinnab)));
            }

        } else if (figura.equals("5") || figura.equalsIgnoreCase("трапеция")) {
            System.out.println("Введите длинну 1-го основания:");
            System.out.println("Введите длинну 2-го основания:");
            System.out.println("Введите длинну высоты трапеции:");
            System.out.println("Введите длинну С боковой стороны трапеции:");
            System.out.println("Введите длинну D боковой стороны трапеции:");
            String dlinnaA = scanner.nextLine();
            String dlinnaB = scanner.nextLine();
            String visotaH = scanner.nextLine();
            String dlinnaC = scanner.nextLine();
            String dlinnaD = scanner.nextLine();
            double A = Double.parseDouble(dlinnaA);
            double B = Double.parseDouble(dlinnaB);
            double H = Double.parseDouble(visotaH);
            double C = Double.parseDouble(dlinnaC);
            double D = Double.parseDouble(dlinnaD);
            System.out.println("Площадь или периметр?");
            String action = scanner.nextLine();
            if (action.equalsIgnoreCase("Площадь") || action.equals("1")) {
                System.out.println("Площадь трапеции:" + (Math.PI * (((A + B) / 2) * H)));
            } else {
                System.out.println("Периметр трапеции:" + (A + B + C + D));
            }
        } else {
            System.out.println("Введены неверные данные");
        }
    }
}




