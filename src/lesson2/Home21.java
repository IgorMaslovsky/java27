package lesson2;

public class Home21 {    //вывести на консоль сумму чётных чисел от 20 до 40
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 20; i <= 40; i++) {
            if (i % 2 == 0) {
                sum = sum + i;

            }


        }
        System.out.println(sum);
    }
}
