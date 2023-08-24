package Tests;

import org.sysco.functions.Function;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleTest {
    @BeforeClass
    public void beforeClass() {

    }

    @Test
    public void testDivision() {
        Assert.assertEquals(2, Function.division(6, 3), "6/3 is not 2");
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(3, Function.subtraction(6, 3), "6-3 is not 3");
    }

    @Test
    public void testAddition() {
        Assert.assertEquals(9, Function.addition(6, 3), "6+3 is not 9");
    }

    @Test
    public void testMultiplication() {
        Assert.assertEquals(18, Function.multiplication(6, 3), "6*3 is not 18");
    }
}
