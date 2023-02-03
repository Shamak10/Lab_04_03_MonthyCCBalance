public class MonthyCCBalance {
    public static void main(String[] args) {
        double startingBalance= 5000;
        double interestRate= 0.17;
        System.out.println("Interest rate due after first month " + (startingBalance * interestRate));
        System.out.println("Interest rate due after two month " + ((startingBalance + startingBalance * interestRate) * interestRate));
    }
}
