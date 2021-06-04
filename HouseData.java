/*
 * HouseData.java
 *
 * HouseData (Project4)
 *Mason Kozloff
 *3/19/21
 * 255 CMSC
 */
package Project4;
import java.util.Scanner;


public class HouseData {
    public static void main(String[] args) {
        // String array of house locations:
        String[] locations = {"304 Oak Ave", "209 Main Dr", "27 River St", "65 Park Pl", "21 Yew Rd", "52 Franklin Dr", "100 Baltic Ave", "200 Maple Dr"};

        // Double array of square footage:
        double[] squareFootage = {2634.23, 2434.67, 2790.53, 5893.12, 3490, 2355.78, 7900, 4356.54};

        // Double array of assessed price:
        double[] assessedPrice = {90456.78, 345678.23, 892274.90, 804392.43, 784211.47, 823757.02, 1453897.44, 342190.65};

        // Double array of distance in miles to center of town:
        double[] distanceToCentre = {6.4, 7.3, 1.9, 7.9, 1.2, 3.9, 7.5, 10.7};

        // printing output
        System.out.println("The average square footage is: " + String.format("%.2f",calcAvg(squareFootage)));
        System.out.println("The average assessed price is: " + String.format("%.2f", calcAvg(assessedPrice)));
        System.out.println("The highest assessed price is: " + String.format("%.2f", findHighest(assessedPrice)));
        System.out.println("The lowest distance is: " + String.format("%.2f", findLowest(distanceToCentre)));
        System.out.println("The highest three square footage houses are: ");
        String[] houses = findHighestValues(locations, squareFootage);

        for (String house : houses) {
            System.out.println("\t" + house);
        }

        System.out.println("The lowest three distances are: ");
        houses = findLowestValues(locations, distanceToCentre);
        for (String house : houses) {
            System.out.println("\t" + house);
        }

        // get the city. Prompt user
        System.out.println("Enter the city: ");
        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine().trim();

        // check whether the city is present or not.
        System.out.println(city + " is" + (verifyHouseLocation(locations, city) ? "" : " not") + " a house in the array.");

    }
    public static double calcAvg(double[] values) {
        // variable to store the sum
        double sum = 0;

        // adding each value from values array.
        for (double value : values) {
            sum += value;
        }

        // exception case, divide by zero not allowed hence, checking whether the values arrays size is 0 or not
        if(values.length == 0) return 0;

        // returning average i.e. sum / length
        return (sum / values.length);
    }


    public static double findHighest(double[] values) {

        //  highest value is first element of array.
        double highestValue = values[0];

        // compare it with each value and find the max
        for(double value : values) {
            highestValue = Math.max(value, highestValue);
        }

        // return the max
        return highestValue;
    }


    public static double findLowest(double[] values) {

        // lowest value is the first element of array.
        double lowestValue = values[0];

        // compare it with each value in array to find the min
        for(double value : values) {
            lowestValue = Math.min(lowestValue, value);
        }

        // return the min
        return lowestValue;
    }

    public static String[] findHighestValues(String[] locations, double[] values) {

        // array to store maxValue found till now in sorted order.
        double[] maxValues = {-1, -1, -1};
        // result is string array which corresponds to maxValue array.
        String[] res = new String[3];

        for (int i = 0; i < locations.length; i++) {
            // value is greater than maximum found till now.
            if (maxValues[0] < values[i]) {

                // swap third  with first.
                maxValues[2] = maxValues[1];

                // swap second with first.
                maxValues[1] = maxValues[0];

                res[2] = res[1];
                res[1] = res[0];

                // make  highest.
                maxValues[0] = values[i];
                res[0] = locations[i];
            }
            //  value is greater than second maximum found till now.
            else if (maxValues[1] < values[i]) {

                // swap third with second.
                maxValues[2] = maxValues[1];
                res[2] = res[1];

                // make this one second.
                maxValues[1] = values[i];
                res[1] = locations[i];
            }
            //  value is greater than third maximum found till now.
            else if (maxValues[2] < values[i]) {

                // make this one third maximum
                maxValues[2] = values[i];
                res[2] = locations[i];
            }
        }

        //  resultant array.
        return res;
    }

    public static String[] findLowestValues(String[] locations, double[] values) {


        double[] lowestValues = {Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE};
        String[] res = new String[3];

        for(int i = 0; i < locations.length; i++) {
            if(lowestValues[0] > values[i]) {

                lowestValues[2] = lowestValues[1];
                lowestValues[1] = lowestValues[0];

                res[2] = res[1];
                res[1] = res[0];

                lowestValues[0] = values[i];
                res[0] = locations[i];
            }
            else if(lowestValues[1] > values[i]) {
                lowestValues[2] = lowestValues[1];
                res[2] = res[1];

                lowestValues[1] = values[i];
                res[1] = locations[i];
            }else if(lowestValues[2] > values[i]) {
                lowestValues[2] = values[i];
                res[2] = locations[i];
            }
        }

        return res;
    }


    public static boolean verifyHouseLocation(String[] locations, String searchLocation) {
        // Go through the array and checking if searchlocation is here or not.
        for(String location : locations) {
            // if found true.
            if(location.equals(searchLocation)) {
                return true;
            }
        }

        // else return false;
        return false;
    }
}

















