public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1100;
        int total = 0;
        if (refill >= 1100) {
            total = refill / 100 + refill + balance;
        } else if (refill < 1100) {
            total = refill + balance;
        }
        System.out.println(total);
    }
}
