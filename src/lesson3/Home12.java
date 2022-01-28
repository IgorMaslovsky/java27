package lesson3;

public class Home12 {
    public static void main(String[] args) {
        // напечатать на консоль ячейки всего массива с конца в начало

        int[] number = {1, 2, 3, 4, 5};
        for (int i = number.length-1; i >= 0; i --) {
            System.out.println(number[i]);

        }
    }
}
