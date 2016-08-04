package Classes.payment;

/**
 *
 * @author Lakmi
 */
public class maestroStrategy implements paymentStrategy {

    private String name;
    private String cardNo;
    private String cvv;
    private String exDate;

    public maestroStrategy(String nm, String card, String CVV, String date) {
        this.name = nm;
        this.cardNo = card;
        this.cvv = CVV;
        this.exDate = date;
    }

    @Override
    public void pay(double total) {

        System.out.println(total + " deduct from your maesto account");
    }
}
