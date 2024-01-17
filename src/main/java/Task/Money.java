package Task;

class Money {
    private static int wallet = 550;

    static void wallet(int money) {
        wallet -= money;
        if (wallet < 1) {
            System.out.println("Недостаточно средств");
        } else {
            System.out.println(wallet);
        }
    }

    public static void main(String[] args) {
        wallet(200);
        wallet(50);
        wallet(200);
        wallet(100);
    }
}
