package statistics.variance;

import org.junit.Test;

import java.util.Arrays;

public class PopulationVarianceCalculateTest {

    @Test
    public void testCalc() {
        PopulationVarianceCalculate calculate = new PopulationVarianceCalculate();
        double result = calculate.calc(Arrays.asList(1.0, 2.0, 3.0));
        System.out.println(result);
    }
}
