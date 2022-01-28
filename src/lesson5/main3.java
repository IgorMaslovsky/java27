package lesson5;

public class main3 {
    public static void main(String[] args) {
        int[][] nums = new int[8][8];         //чередовать массив 1 0 1 0 1 и т.д
        for (int i=0;i< nums.length;i++){
            for (int j=0; j<nums[i].length;j++){
                if ((i+j)%2==0){
                    System.out.print("0 ");
                }else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
            }

    }
}
