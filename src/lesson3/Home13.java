package lesson3;

public class Home13 {
    //напечатать на консоль сумму значений всех ячеек
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        int sum=0;
        for (int i=0;i< number.length;i++){
            sum=sum+number[i];

        }
        System.out.println(sum);
    }


}
