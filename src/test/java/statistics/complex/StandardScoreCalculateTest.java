package statistics.complex;

import org.junit.Test;

import java.util.Arrays;

public class StandardScoreCalculateTest {

    @Test
    public void testCalc() {
        StandardScoreCalculate calculate = new StandardScoreCalculate();
        calculate.calc(Arrays.asList(1.0, 2.0, 3.0,1.0, 2.0, 3.0,1.0, 2.0, 3.0,1.0, 2.0, 3.0, 1000.0));
    }
}
