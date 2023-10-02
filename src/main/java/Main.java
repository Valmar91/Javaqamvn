public class Main {
    public static void main(String[] args) {

        BonusService service = new BonusService();

        int expected = 30;
        Long actual = service.calculate(1000, true);
        System.out.println("1. " + expected + "== ? ==" + actual);

    }
}