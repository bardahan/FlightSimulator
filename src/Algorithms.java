public class Algorithms {

    public static double arraySum(double[] array) {
        float sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum;
    }

    public static double average(double[] arrayOfValues){
        double sum = arraySum(arrayOfValues);
        return sum / arrayOfValues.length;
    }

    public static double standardDeviation(double[] arrayOfValues){
        double average = average(arrayOfValues);
        double inRootRes = 0;
        for (double val : arrayOfValues){
            inRootRes += Math.pow(val - average, 2);
        }
        return Math.sqrt(inRootRes / (arrayOfValues.length - 1));
    }

    public static double zScore(double x, double[] arrayOfValues){
        double average = average(arrayOfValues);
        double sd = standardDeviation(arrayOfValues);
        return (Math.abs(x - average) / sd);
    }
}


