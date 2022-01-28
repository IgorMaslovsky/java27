package lesson2;

public class Dz1 {
    public static void main(String[] args) {
        int money = 1000;
        int pizzaCost = 230;
        int boobleCost = 26;
        double candyCost = 2.5;

        int canByPizza = money / pizzaCost;
        money = money - (pizzaCost * canByPizza);

        int canByBoble = money / boobleCost;
        money = money - (boobleCost * canByBoble);

        int canByCandy = (int) (money / candyCost);
        double zdacha=money - (canByCandy*candyCost);
        System.out.println("Пицц"+canByPizza);
        System.out.println("жвачки"+canByBoble);
        System.out.println("Конфеты"+canByCandy);
        System.out.println("Сдача"+zdacha);


    }
}
