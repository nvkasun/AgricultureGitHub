package Classes.payment;

/**
 *
 * @author Lakmi
 */
public class masterCardStrategy implements paymentStrategy {

    private String name;
    private String cardNo;
    private String cvv;
    private String exDate;

    public masterCardStrategy(String nm, String card, String CVV, String date) {
        this.name = nm;
        this.cardNo = card;
        this.cvv = CVV;
        this.exDate = date;
    }

    @Override
    public void pay(double total) {
        System.out.println(total + " deduct from your master card");
    }
}
