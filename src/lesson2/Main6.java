package lesson2;

public class Main6 {
    //вывести циры на консоль цифры от 20 до 50, пропустить интервал от 30 до 35
    public static void main(String[] args) {
        for (int i=20;i<=50;i++){
            if (i<30 || i>35){
                System.out.println(i);
            }
        }

    }
}
