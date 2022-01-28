package lesson2;

public class Main5 {
    //напечатать цифры от 100 до 1000 которые одновременно делятся на 3 и 5
    public static void main(String[] args) {
        for (int i=100; i<=1000;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i);
            }
        }
    }
}
