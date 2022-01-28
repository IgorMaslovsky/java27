package lesson3;

public class Main3 {
    public static void main(String[] args) { //напечатать на консоль только гласные буквы
        char [] simfols={'a','v','s','r','e','h','k'};
        for (int i=0;i<simfols.length;i++){     //simfols.lenght - длинна всего массива
            if (simfols[i]=='a'||simfols[i]=='o'||simfols[i]=='e'){  //надо пречислять все глассные буквы алфавита
                System.out.println(simfols[i]);
            }
        }
    }
}
