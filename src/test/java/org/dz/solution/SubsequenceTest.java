package org.dz.solution;

import org.junit.Assert;
import org.junit.Test;


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
        Assert.assertEquals(582932, result);
    }

    @Test
    public void getNumberByFormulaOf10() {
        Subsequence calculator = new Subsequence();
        int result = calculator.getNumberByFormula(10);
        Assert.assertEquals(472, result);
    }

    @Test
    public void getNumberByFormulaOf2() {
        Subsequence calculator = new Subsequence();
        int result = calculator.getNumberByFormula(2);
        Assert.assertEquals(1, result);
    }

    @Test
    public void getNumberByFormulaOf3() {
        Subsequence calculator = new Subsequence();
        int result = calculator.getNumberByFormula(3);
        Assert.assertEquals(2, result);
    }

    @Test
    public void getNumberByFormulaOf4() {
        Subsequence calculator = new Subsequence();
        int result = calculator.getNumberByFormula(4);
        Assert.assertEquals(4, result);
    }

}