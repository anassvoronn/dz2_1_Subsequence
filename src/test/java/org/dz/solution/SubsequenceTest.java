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
    public void getNumberByFormulaOf19() {
        Subsequence calculator = new Subsequence();
        int result = calculator.getNumberByFormula(19);
        Assert.assertEquals(6254320, result);
    }

    @Test
    public void getNumberByFormulaOf10() {
        Subsequence calculator = new Subsequence();
        int result = calculator.getNumberByFormula(10);
        Assert.assertEquals(5064, result);
    }

}