package Lab12;

public class Card {
    //declaring variables
    private String name;

    //constructors
    public Card() {
        name = "";
    }

    public Card(String name) {
        this.name = name;
    }

    //toString Method
    public String toString() {
        return "Card Holder: " + name;
    }


}