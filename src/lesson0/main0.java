package lesson0;

public class main0 {
    public static void main(String[] args) { //если число чётное то true если нечётное то false
        int i=7;

        boolean evenNumber;

        if (i%2==0){
            evenNumber=true;
        }
        else {
            evenNumber=false;
        }

        System.out.println(evenNumber);
    }
}
