package lesson3;

public class Home14 {
    //напечатать кого в массиве больше, чётных или нечётных чисел
    public static void main(String[] args) {
        int sumChetnih = 0;
        int sumNechetnih = 0;
        int[] number = {1, 2, 3, 4, 5};
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                sumChetnih++;
            } else {
                sumNechetnih++;
            }

            if (sumChetnih > sumNechetnih) {
                System.out.println("Чётных больше");
            } else {

            }

        }

        System.out.println("Нечётных больше");
    }
}


