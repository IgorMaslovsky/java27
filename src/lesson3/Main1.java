package lesson3;

public class Main1 {
    public static void main(String[] args) {  //есть массив чисел int,создадим массив и заполним любыми числами
        //посчитать сумму чётных чисел в массиве
        int[] numbers={2,3,6,4,3,8};
        int sumChetnih=0;
        for (int i=0; i<6;i++){
            if (numbers[i]%2==0){
                sumChetnih=sumChetnih+numbers[i];

            }
        }
        System.out.println(sumChetnih);
    }
}
