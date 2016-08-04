package Classes.payment;

/**
 *
 * @author Lakmi
 */
public class payPalStrategy implements paymentStrategy {

    private String email;
    private String password;

    public payPalStrategy(String email, String pwd) {
        this.email = email;
        this.password = pwd;
    }

    @Override
    public void pay(double total) {

        System.out.println(total + "deduct from paypal account");
    }

}
