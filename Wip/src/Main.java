public class Main {

    public static void main(String[] args)
    {
        CashPayment cp1= new CashPayment(100.00);
        CashPayment cp2= new CashPayment(24.05);

        CreditCardPayment ccp1= new CreditCardPayment(78.6,"Tommy Vercitte","06/26","4000000000000000");
        CreditCardPayment ccp2= new CreditCardPayment(65.88,"lucac modric","09/27","6700000000000000");

        System.out.println("------------Payment Details-----------");
        System.out.println("CashPayment Object 1::");
        cp1.paymentDetails();
        System.out.println("CashPayment Object 2::");
        cp2.paymentDetails();
        System.out.println("CreditCardPayment Object 1::");
        ccp1.paymentDetails();
        System.out.println("CreditCardPayment Object 2::");
        ccp2.paymentDetails();




    }
}
