package Lab8;

public class Array {


    public static String[] reverseNames(String[] names) {
//        for(int i = 0; i< names.length/2; i++) {
//            String temp = names[i];
//            names[i] = names[names.length -1 - i];
//            names[names.length -1 - i]= temp;
//
//
//
//        }
        String[] output = new String[8];
        int count = 0;
        for (int i = names.length - 1; i >= 0; i--) {
            output[count] = names[i];
            count++;

        }
        return output;

    }

    public static void displayNames(String[] names) {
        for (String name : names) {
            System.out.println(name);

        }
        System.out.println();
    }

    public static void main(String[] args) {

        String[] tokens = args[0].split(",");

        String[] customerName = new String[8];

        for (int i = 0; i < tokens.length; i++) {
            //System.out.println(tokens[i]);
            customerName[i] = tokens[i];
        }
        displayNames(customerName);
        customerName[6] = customerName[4];
        customerName[7] = customerName[5];
        //displayNames(customerName);

        customerName[4] = null;
        customerName[5] = null;
        // displayNames(customerName);

        customerName[4] = "Rick";
        customerName[5] = "Jessica";
        displayNames(customerName);

        String[] newCustomerName = reverseNames(customerName);
        displayNames(newCustomerName);


        for (int i = 0; i < newCustomerName.length; i++) {
            if (newCustomerName[i].equals("Rick")) {
                newCustomerName[i] = null;
            }

        }

        for (int i = 0; i < newCustomerName.length; i++) {
            if (newCustomerName[i] == null) {

                for (int j = i + 1; j < newCustomerName.length; j++) {

                    if (newCustomerName[j] != null) {
                        String temp4 = customerName[i];
                        newCustomerName[i] = customerName[j];
                        newCustomerName[j] = temp4;
                    }
                }
            }
        }
    }
}




















