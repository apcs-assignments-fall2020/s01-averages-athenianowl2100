public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        double total = 0;

        for (double[] row: mat) {
            for (double x: row) {
                total += x;
            }
        }

        return total/(mat.length*mat[0].length);
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        if (mat.length % 2 == 0) {
            double val1 = mat[mat.length/2-1][mat[0].length-1];
            double val2 = mat[mat.length/2][0];
            return (val1+val2)/2;
        }
        else {
            if (mat[0].length % 2 == 1) {
                return mat[mat.length/2][mat[0].length/2];
            }
            else {
                double val1 = mat[mat.length/2][mat[0].length/2-1];
                double val2 = mat[mat.length/2][mat[0].length/2];
                return (val1+val2)/2;
            }
        }
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        int currentCount = 0;
        double current = mat[0][0];

        int maxCount = -1;
        double max = -1;
        
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat[row][col] == current) {
                    currentCount++;
                }
                else {
                    if (currentCount > maxCount) {
                        max = current;
                        maxCount = currentCount;
                    }

                    currentCount = 1;
                    current = mat[row][col];
                }
            }
        }


        if (currentCount > maxCount) {
            max = current;
            maxCount = currentCount;
        }

        return max;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
