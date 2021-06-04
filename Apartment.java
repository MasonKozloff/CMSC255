package Project6;

/*
 * Apartment.java
 *
 * Programming Project 6 – Apartment Buildings
 *Mason Kozloff
 *4/22/21
 * 255 CMSC
 */

public class Apartment {
    private int locationNumber;
    private double squareFootage;
    private double price;
    private Bedrooms bedrooms;
    private Baths baths;
    private Status status;


      //Default constructor

    public Apartment() {
        this.locationNumber = 1;
        this.squareFootage = 500.00;
        this.price = 400.00;
        this.bedrooms = Bedrooms.values()[0];
        this.baths = Baths.values()[0];
        this.status = Status.values()[0];
    }



     //aLocationNumber
     //aSquareFootage
     //aPrice
     //aBedrooms
     //aBaths
     //aStatus

    public Apartment(int aLocationNumber, double aSquareFootage, double aPrice, Bedrooms aBedrooms, Baths aBaths,
                     Status aStatus) {
        this.locationNumber = aLocationNumber;
        this.squareFootage = aSquareFootage;
        this.price = aPrice;
        this.bedrooms = aBedrooms;
        this.baths = aBaths;
        this.status = aStatus;
    }


      //param locationNumber the locationNumber to set

    public void setLocationNumber(int locationNumber) {
        this.locationNumber = locationNumber;
    }


      //param squareFootage the squareFootage to set

    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }


      //param price the price to set

    public void setPrice(double price) {
        this.price = price;
    }


     //param bedrooms the bedrooms to set

    public void setBedrooms(Bedrooms bedrooms) {
        this.bedrooms = bedrooms;
    }


     //param baths the baths to set

    public void setBaths(Baths baths) {
        this.baths = baths;
    }


     //param status the status to set

    public void setStatus(Status status) {
        this.status = status;
    }


     //return the locationNumber

    public int getLocationNumber() {
        return locationNumber;
    }

    //return the squareFootage

    public double getSquareFootage() {
        return squareFootage;
    }


     //return the price

    public double getPrice() {
        return price;
    }


     //return the bedrooms

    public Bedrooms getBedrooms() {
        return bedrooms;
    }


     //return the baths

    public Baths getBaths() {
        return baths;
    }


     //return the status

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "\n\t" + locationNumber + "\n\t" + squareFootage + "\n\t" + price
                + "\n\t" + bedrooms + "\n\t" + baths + "\n\t" + status + "\n";
    }
}
