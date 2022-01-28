package lesson2;

public class Home22 {
    public static void main(String[] args) {   //вывести на консоль числа от 10 до 50, не выводить от 20 до 25
         for (int i=10; i<=50;i++){
             if (i<20 || i>25){
                 System.out.println(i);
             }
         }
    }
}
