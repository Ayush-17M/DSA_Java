package Greedy;

import java.util.ArrayList;
import java.util.List;

public class Q2_simplified_fractions_1447 {

    private int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }

    public List<String> simplifiedFractions(int n) {
        List<String> result = new ArrayList<>();
        for(int denominator = 2; denominator <= n; denominator++) {
            for(int numerator = 1; numerator <= denominator; numerator++) {
                if(gcd(numerator, denominator) == 1) result.add(numerator + "/" + denominator);
            }
        }
        return result;
    }
}
