package Lab12;

public class IDCard extends Card {
    //declaring variables
    private int idNumber;
    //constructors
    public IDCard() {
        super("Jane Smith");
        this.idNumber = 0;
    }

    public IDCard(String name,int idNumber) {
        super(name);
        this.idNumber = idNumber;
    }
    //toString Method

    public String toString() {
        return super.toString()+" ID Number: " +  idNumber;
    }


}
