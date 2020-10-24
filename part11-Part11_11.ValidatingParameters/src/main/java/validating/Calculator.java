package validating;

public class Calculator {

    public int factorial(int num) {

        if (num < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {

        if (setSize < 0 || subsetSize < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed");
        } else if ( subsetSize > setSize) {
            throw new IllegalArgumentException("Subset cannot be larger than"
                    + "set.");
        }
        
        
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
