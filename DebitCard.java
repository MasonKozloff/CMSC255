package Lab12;

 public class DebitCard extends Card  {
    //declaring variables
    private int cardNumber;
    private int pin;
    //constructors
    public DebitCard() {
        super("Jane Doe");
        cardNumber=00000000;
        pin=0;
    }

    public DebitCard(String name,int cardNumber, int pin) {
        super(name);
        this.cardNumber = cardNumber;
        this.pin = pin;
    }
    //toString Method

    public String toString() {
        return super.toString()+ " Card Number: " + cardNumber;
    }



}
