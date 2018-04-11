package statistics.stdev;

import org.junit.Test;
import statistics.stdev.PopulationStandardDeviationCalculate;

import java.util.Arrays;

public class PopulationStandardDeviationCalculateTest {

    @Test
    public void testCalc() {
        PopulationStandardDeviationCalculate populationStandardDeviationCalculate = new PopulationStandardDeviationCalculate();
        double result = populationStandardDeviationCalculate.calc(Arrays.asList(1.0, 2.0, 3.0, 4.0));
        System.out.println(result);
    }
}
