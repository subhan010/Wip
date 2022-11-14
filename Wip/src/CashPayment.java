public class CashPayment extends Payment {

  public CashPayment()
    {
        super();
    }

    public CashPayment(double amount)
    {
        super(amount);
    }

    public void paymentDetails()
    {
        System.out.println("Cash Payment amount is "+getAmount());
    }
}
