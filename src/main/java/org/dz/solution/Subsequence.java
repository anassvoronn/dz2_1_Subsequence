package org.dz.solution;

public class Subsequence {
    public int getNumberByFormula(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number can't be negative");
        }
        if (number == 1) {
            return 0;
        }
        int elem1 = 0;
        int elem2 = 1;
        int elem3 = 2;
        int elem4 = elem3 * 2 + elem1;

        for (int i = number - 2; i >= 0; i--) {
            elem1 = elem2;
            elem2 = elem3;
            elem3 = elem4;
            elem4 = elem3 * 2 + elem1;
            if (i == 0) break;
        }
        return elem4;
    }
}
