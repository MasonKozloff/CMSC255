package Lab9;
public class Lab9 {

    public static void addTo10(int[][] array) {

        // temporary variables
        int index0, sum;

        for (int[] row : array) {
            index0 = -1;
            sum = 0;

            // finds index of 0 and calculates initial sum
            for (int i = 0; i < row.length; ++i) {
                if (row[i] == 0) {
                    index0 = i;
                }
                sum += row[i];
            }

            // Assigns the value
            row[index0] = 10 - sum;
        }
    }

    public static void findAverage(double[][] array) {

        // temporary variables
        double sum;
        double rowAverage, colAverage;

        for (double[] row : array) {

            for (int i = 0; i < row.length; ++i) {

                // nothing to do, if this column is not 0
                if (row[i] != 0) {
                    continue;
                }

                // else assign the maximum average

                // row average
                sum = 0;
                for (double col : row) {
                    sum += col;
                }
                rowAverage = sum / row.length;

                // column average
                sum = 0;
                for (double[] _row : array) {
                    sum += _row[i];
                }
                colAverage = sum / row.length;

                // Assigning maximum of row and column average
                row[i] = Math.max(rowAverage, colAverage);
            }
        }
    }
    }