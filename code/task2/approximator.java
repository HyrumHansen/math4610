import java.util.ArrayList;
import java.lang.Math;



public class approximator {

    public static void main(String[] args) {

        // Variables
        ArrayList<Double> hValues = new ArrayList<>(); // Values of h
        ArrayList<Double> functionValues = new ArrayList<>(); // Values of f''(x
        ArrayList<Double> approximateFunctionValues = new ArrayList<>(); // Values of f''(x + h)

        // Functions called to generate table values
        generateHvalues(hValues);
        generateFunctionValues(functionValues, hValues);
        generateApproximateFunctionValues(approximateFunctionValues, hValues);

        // To print the table header
        System.out.printf("%20.4s %20s %25s %20s", "h","Value", "Approximate value", "Error");
        System.out.println();
        System.out.printf("%20.4s %20s %25s %20s", "(\u0394X)", "f''(x)", "(CDA)", "(CDA - cos(2))");
        System.out.println();
        System.out.printf("%20.2s %20s %25s %20s", "-", "-----", "-----------------", "--------------");
        System.out.println();

        // To print the table rows
        for(int i = 0; i < hValues.size(); i++){
            System.out.printf("%20.2e %20.10f %20.10f %20.10f",
                    hValues.get(i),
                    -Math.cos(2),
                    approximateFunctionValues.get(i),
                    Math.abs(approximateFunctionValues.get(i) - (-Math.cos(2))));
            System.out.println();
        }
    }

    // Generates the values of h to be tested
    public static void generateHvalues(ArrayList<Double> list){

        // Add the initial values
        list.add(1.0);
        list.add(0.5);

        // Loop through and add all values
        for(double i = 0.1; i > Math.pow(10, -16); i *= 0.1){
            list.add(i);
        }
    }

    // Generates the ACTUAL value of f(x + h)
    public static void generateFunctionValues(ArrayList<Double> functionValues, ArrayList<Double> hValues){
        for (Double hValue : hValues) {
            functionValues.add(-Math.cos(2 + hValue));
        }
    }

    // Generates the central difference approximation of the second derivative
    public static void generateApproximateFunctionValues(ArrayList<Double> approximateFunctionValues, ArrayList<Double> hValues){
        for (Double h : hValues) {
            Double arrayValue = (Math.cos(2 + h) - 2 * Math.cos(2) + Math.cos(2 - h)) / Math.pow(h, 2);
            approximateFunctionValues.add(arrayValue);

        }
    }
}

