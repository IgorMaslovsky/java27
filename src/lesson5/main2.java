package lesson5;

public class main2 {
    public static void main(String[] args) {       //двухмерные массивы
        int[][] nums = new int[4][5];            //[i][j]-i-количество строк, j-количество колонок
        for (int i=0;i< nums.length;i++){
            for (int j=0; j<nums[i].length;j++){          //nums[i]-ссылка на текущую строку
                System.out.print(nums[i][j] + " "); //print вместо println

            }
            System.out.println();
        }

    }
}
