public class Main {

    public static void main(String[] args) {
        double[] myArray = new double[]{1,2,3,4.5 };
        System.out.println(Algorithms.zScore(1, myArray));
        ReadCSV anomaly = new ReadCSV("anomaly_flight.csv");// test
    }
}
