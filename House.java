/*
 * House.java
 *
 * Programming Project 5 – House Creation
 *Mason Kozloff
 *4/8/21
 * 255 CMSC
 */

package Project5;

public class House
{
    // attributes
    private String location;
    private double squareFootage;
    private double price;
    private double disToCenter;

    // 0-arg constructor to initialize the attributes to default values i.e Strings are initialized to null and numeric to 0
    public House()
    {
        this("", 0, 0, 0);
    }

    // 4-arg constructor to initialize the attributes to specified values
    public House(String location, double sqFootage, double price, double distance)
    {
        this.location = location;
        this.squareFootage = sqFootage;
        this.price = price;
        this.disToCenter = distance;
    }

    // setters
    // set the location
    public void setLocation(String location)
    {
        this.location = location;
    }

    // set the square footage
    public void setSquareFootage(double sqFootage)
    {
        this.squareFootage = sqFootage;
    }

    // set the price
    public void setPrice(double price)
    {
        this.price = price;
    }

    // set the distance
    public void setDisToCenter(double distance)
    {
        this.disToCenter = distance;
    }

    // getters
    // return location
    public String getLocation()
    {
        return location;
    }

    // return square footage
    public double getSquareFootage()
    {
        return squareFootage;
    }

    // return price
    public double getPrice()
    {
        return price;
    }

    // return distance
    public double getDisToCenter()
    {
        return disToCenter;
    }

    // return String represntation of the House
    public String toString()
    {
        return location+" "+squareFootage+" "+price+" "+disToCenter;
    }
}
