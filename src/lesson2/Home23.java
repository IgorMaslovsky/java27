package lesson2;

public class Home23 {  //вывести на консоль среднее значение всех нечётных чисел от 0 до 100

    public static void main(String[] args) {
        int countNechetnoe = 0;
        int sum=0;
        for (int i=0; i<=100;i++){
            if (i%2==1){
                sum+=i;
                countNechetnoe++;
            }


        }
        System.out.println(sum/countNechetnoe);
    }

}
