package lesson3;

public class Main5 {
    public static void main(String[] args) {  //в новом массиве нужно сдвинуть каждую ячейку на одну(физически)
        char[] a = {'g', 'w', 'e', 'r', 't', 'y'};

        char[] b = new char[a.length];  //a.length-длинна столько сколько и в первом массиве
        //b[0] = a[1];
        //b[1] = a[2];
        //b[2] = a[3];
        //b[3] = a[4];
        //b[4] = a[5];
        //b[5] = a[0];

        for (int i = 0; i < a.length; i++) {
            if (i == a.length-1) {
                b[a.length-1] = a[0];
            } else {
                b[i] = a[i + 1];

            }

        }

    }
}
