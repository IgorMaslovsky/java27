package lesson4;

public class main {
    public static void main(String[] args) {
        String email = "igor.maslovsky";
        int dlinna = email.length();
        System.out.println(dlinna);


        String password="igormaslovs1";
        int dlinnapassword=password.length();   //password-пароль
        System.out.println(dlinnapassword);
        if (dlinnapassword<8){
            System.out.println("Пароль слишком короткий!!!");
            return;
        }
//проверим содержит ли пароль цифры(способ номер 1)                  // ! отрицание, не
        if (!password.contains("0")&& !password.contains("1")&&    //! password.contains -пароль.не содержит ли 0?
                !password.contains("2")&& !password.contains("3")&&
                !password.contains("4")&& !password.contains("5")&&
                !password.contains("6")&& !password.contains("7")&&
                !password.contains("8")&& !password.contains("9")){
            System.out.println("В пароле нет цифры");
            return;
        }
        //проверим содержит ли пароль цифры(способ номер 2)
        String[]numbers={"0","1","2","3","4","5","6","7","8","9"};
        int countNumInPassword=0;             //countNumInPassword-числа в пароле
        for (int i=0;i<numbers.length;i++){
            String currentNum=numbers[i];     //currentNum-текущее число которое мы берём из этого массива
            if (password.contains(currentNum)){  //если пароль содержит текущий символ
                countNumInPassword++;      //количество чисел в пароле++
            }
        }
        if (countNumInPassword<2){
            System.out.println("Цифр меньше двух в пароле!!!");
        }
    }
}

