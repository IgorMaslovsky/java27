package lesson6;

public class Home1 {  //мы передаём в метод текст, а он нам возвращает количество слов (числом))
    public static void countWordsInText(String text) {
        int countWords = 0;
        String[] words  = text.split(""); //медод (split) разрезает по пробелу

        System.out.println(words.length);
    }

    // мы  передаём текст, метод печатает на консоль этот же текст,только каждое слово будет напечатано наоборот
    public static void reverseCharInWords(String text) {


    }

}
