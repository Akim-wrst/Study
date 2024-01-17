package TaskException;

class scoreException extends Exception {
    scoreException(String s) {
        super(s);
    }
}

class BankAccount {
    private static int wallet = 550;

    static void wallet(int money) {
        try {
            wallet -= money;
            if (wallet < 0) {
                throw new scoreException("Недостаточно средств");
            } else {
                System.out.println(wallet);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        BankAccount.wallet(540);
        BankAccount.wallet(11);


    }
}

