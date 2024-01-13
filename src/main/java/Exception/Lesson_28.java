package Exception;

class Lesson_28 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("myaso");
        try {
            tiger.drink("voda");
            try {
                tiger.drink("pivo");
            } catch (NeVodaException n) {
                System.out.println(n.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Eto inner finaly block");
            }
        } catch (RuntimeException r) {
            System.out.println(r.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class NeMyasoException extends RuntimeException {
    NeMyasoException(String name) {
        super(name);
    }
}

class NeVodaException extends Exception {
    NeVodaException(String s) {
        super(s);
    }
}

class Tiger {
    void eat(String eat) {
        if (eat.equals("myaso")) {
            System.out.println("Tiger est myaso");
        } else {
            throw new NeMyasoException("Tiger ne est " + eat);
        }
    }

    void drink(String drink) throws NeVodaException {
        if (drink.equals("voda")) {
            System.out.println("Tiger pyet vodu");
        } else {
            throw new NeVodaException("Tiger ne pyet " + drink);
        }
    }
}

