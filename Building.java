/*
 * Building.java
 *
 * Programming Project 6 – Apartment Buildings
 *Mason Kozloff
 *4/22/21
 * 255 CMSC
 */


package Project6;

import java.util.ArrayList;

public class Building {
    private String location;
    private String owner;
    private String contactPhone;
    private int maxNumberOfUnits;
    private ArrayList<Apartment> apartments;

    //Default constructor

    public Building() {
        this.location = "";
        this.owner = "";
        this.contactPhone = "";
        this.maxNumberOfUnits = 0;
        this.apartments = new ArrayList<>();
    }



    //param aLocation
    //param anOwner
    //param aContactPhone
    //param aMaxNumberOfUnits

    public Building(String aLocation, String anOwner, String aContactPhone, int aMaxNumberOfUnits) {
        this.location = aLocation;
        this.owner = anOwner;
        this.contactPhone = aContactPhone;
        this.maxNumberOfUnits = aMaxNumberOfUnits;
        this.apartments = new ArrayList<>();
    }


    //param location the location to set

    public void setLocation(String location) {
        this.location = location;
    }


    //param owner the owner to set

    public void setOwner(String owner) {
        this.owner = owner;
    }


    //param contactPhone the contactPhone to set

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }


    //param maxNumberOfUnits the maxNumberOfUnits to set

    public void setMaxNumberOfUnits(int maxNumberOfUnits) {
        this.maxNumberOfUnits = maxNumberOfUnits;
    }


    //return the location

    public String getLocation() {
        return location;
    }


    //return the owner

    public String getOwner() {
        return owner;
    }


    //return the contactPhone

    public String getContactPhone() {
        return contactPhone;
    }


    //return the maxNumberOfUnits

    public int getMaxNumberOfUnits() {
        return maxNumberOfUnits;
    }


    //Adds an apartment to the Building object's ArrayList apartments
    //param apartment

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    //return number of Apartment objects in the building

    public int getNumApartments() {
        int getApartments = apartments.size();
        return getApartments;
    }

    //return apartments

    public ArrayList<Apartment> getApartments() {
        return apartments;
    }

    @Override
    public String toString() {
        String result = "Richmond, VA\n" +
                "Zach Whitten\n" +
                "804-555-2112\n" +
                "15\n" +
                "Apartments:\n" +
                "\n";

        for (int index = 0; index < apartments.size(); index++) {
            result += apartments.get(index).toString();
            result += "\n";
        }
        return result;

    }

}
