package lesson5;

public class main1 {
    public static void main(String[] args) {
        int money = 100000;      //рассчитать вклады в банке с ежемесячной капитализацией и с годовой
        int year = 5;
        int prosent = 7;
        for (int i=0;i<year;i++){
            for (int month = 0;month<12;month++){
                money=money + ((money/100*prosent)/12);
            }
        }
        System.out.println( "Ежемесячная капитализация-" + money);
        money=100000;//money-обнулили чтобы не пошло наращивать на первую нарощенную сумму
        for (int i= 0;i<year;i++){
            money=money + (money/100*prosent);
            System.out.println("Годовая капитализация-"+money);

        }
    }
}
