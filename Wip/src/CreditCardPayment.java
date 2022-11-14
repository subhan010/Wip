public class CreditCardPayment extends Payment{

    private String name;
    private String expiry;
    private String creditCardNumber;

    public CreditCardPayment() {
        super();
        name="";
        expiry="";
        creditCardNumber="";
    }

    public CreditCardPayment(double amount,String name,String expiry,String creditCardNumber)
    {
        super();
        setAmount(amount);
        this.name=name;
        this.expiry=expiry;
        this.creditCardNumber=creditCardNumber;
    }




    public void paymentDetails()
    {
        System.out.println("Credit card payment amount "+getAmount());
        System.out.println("Name on the credit card "+name);
        System.out.println("Expiry "+expiry);
        System.out.println("Credit Card Number "+creditCardNumber);
    }


}
