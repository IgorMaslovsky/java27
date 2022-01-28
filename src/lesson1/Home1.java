package lesson1;

public class Home1 {
    public static void main(String[] args) {
        int money = 1009;
        int stoimostPizza = 230;
        int stoimostGum = 26;
        double stoimostSweet = 2.5;

        System.out.println("пицц" + money / stoimostPizza);
        int ostatok = money % stoimostPizza;
        System.out.println("жвачек" + ostatok / stoimostGum);
        int sdaja = ostatok % stoimostGum;
        System.out.println("конфет" + (int) (sdaja / stoimostSweet));//Преобразование к целому значению
        System.out.println("сдача" + sdaja % stoimostSweet + "$");
    }
}
