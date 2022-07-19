
public class main {
    public static void main(String[] args) {
        int balance = 100;
        int add = 1400;
        int newBalance;
        int cashback;

        if (add > 1000) {
            cashback = add / 100;
            newBalance = balance + add + cashback;
        } else {
            cashback = 0;
            newBalance = balance + add;
        }
        System.out.println("Кэшбек:" + cashback);
        System.out.println("Ваш баланс:" + newBalance);
    }
}
