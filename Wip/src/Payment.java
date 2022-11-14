

public class Payment {

    private double amount;

    public Payment()
    {
        amount=0;
    }
    public Payment(double amount)
    {
        this.amount =amount;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void paymentDetails()
    {
        System.out.println("Amount of the Payment is "+amount);
    }

}
