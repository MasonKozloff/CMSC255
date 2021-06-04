/*
 * House.java
 *
 * Programming Project 5 – House Creation
 *Mason Kozloff
 *4/8/21
 * 255 CMSC
 */

package Project5;

public class HouseCreation {

        // method to display the houses from the array separated by a newline
        public static void displayHouses(House[] houses)
        {
            for(House h : houses)
            {
                System.out.println(h);
            }
        }

        // method to find the houses from the array of House objects that are either
        // above or below a given double value and return the array of House objects
        // that match the criteria
        public static House[] findHomes(House[] houses, boolean isOver, double value, String searchCriteria)
        {
            // create an array of same size as input houses
            House[] matchHouses = new House[houses.length];
            int nHouses = 0; // number of locations occupied

            // loop over the input array
            for (House house : houses) {
                // search for square footage
                if (searchCriteria.equalsIgnoreCase("sqFootage")) {
                    // ith house match the criteria, insert ith house in matchHouses
                    if ((isOver && house.getSquareFootage() > value) || (!isOver && house.getSquareFootage() < value)) {
                        matchHouses[nHouses] = house;
                        nHouses++; // increment nHouses
                    }
                } else if (searchCriteria.equalsIgnoreCase("price")) // search for price
                {
                    // ith house match the criteria, insert ith house in matchHouses
                    if ((isOver && house.getPrice() > value) || (!isOver && house.getPrice() < value)) {
                        matchHouses[nHouses] = house;
                        nHouses++; // increment nHouses
                    }
                } else if (searchCriteria.equalsIgnoreCase("distance")) // search for distance
                {
                    // ith house match the criteria, insert ith house in matchHouses
                    if ((isOver && house.getDisToCenter() > value) || (!isOver && house.getDisToCenter() < value)) {
                        matchHouses[nHouses] = house;
                        nHouses++; // increment nHouses
                    }
                }
            }

            // create another array of House objects of size nHouses
            House[] result = new House[nHouses];
            // loop to copy first nHouses to result from matchHouses
            if (nHouses >= 0) System.arraycopy(matchHouses, 0, result, 0, nHouses);
            return result; // return the resultant array
        }

        public static void main(String[] args) {

            // create an array of 3 House objects
            House[] houses = new House[3];
            // create 2 objects using parameterized constructor
            House h1 = new House("304 Oak Ave", 2634.23, 90456.78, 6.4);
            House h2 = new House("209 Main Dr", 2434.67, 345678.23, 7.3);
            House h3 = new House(); // create 3rd object using default constructor
            // set the attributes for 3rd object using setters
            h3.setLocation("27 River St");
            h3.setSquareFootage(2790.53);
            h3.setPrice(892274.9);
            h3.setDisToCenter(1.9);

            // insert the objects created into the array
            houses[0] = h1;
            houses[1] = h2;
            houses[2] = h3;

            // display houses created
            displayHouses(houses);
            // get the houses with square footage > 2500
            House[] result = findHomes(houses, true, 2500, "sqFootage");
            // display the houses that match the criteria
            System.out.println("After the search for sqFootage over 2500:");
            displayHouses(result);
        }

    }


