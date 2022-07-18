package org.dz.solution;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubsequenceTest {

    @Test
    public void getNumberByFormulaOf1() {
        Subsequence calculator = new Subsequence();
        int result = calculator.getNumberByFormula(1);
        Assert.assertEquals(0, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getElementByIndexOfMinus1() {
        Subsequence calculator = new Subsequence();
        calculator.getNumberByFormula(-1);
    }

    @Test
    public void getNumberByFormulaOf21() {
        Subsequence calculator = new Subsequence();
        int result = calculator.getNumberByFormula(21);
        Assert.assertEquals(4, result);
    }

}