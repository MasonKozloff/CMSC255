/*
 * MainMethod.java
 *
 * Programming Project 6 – Apartment Buildings
 *Mason Kozloff
 *4/22/21
 * 255 CMSC
 */

package Project6;

public class MainMethod {
    public static void main(String[] args) {

        // create an Building instance
        Building building1 = new Building("456 Granite Lane", "Caroline Budwell", "804-555-1212", 20);
        building1.addApartment(new Apartment(101, 634.52, 754.99, Bedrooms.TWO_BEDROOM, Baths.TWO, Status.VACANT));
        building1.addApartment(
                new Apartment(201, 2300.00, 500000.00, Bedrooms.THREE_BEDROOM, Baths.THREE, Status.OCCUPIED));

        // display the building1 details
        System.out.println(building1.toString());

        // create an Building instance
        Building building2 = new Building("129 Resolve St", "Zach Whitten", "804-555-2121", 100);
        building2.addApartment(new Apartment(1, 456.89, 789.45, Bedrooms.STUDIO, Baths.ONE, Status.OCCUPIED));
        // display the building2 details
        System.out.println(building2.toString());

    }
}