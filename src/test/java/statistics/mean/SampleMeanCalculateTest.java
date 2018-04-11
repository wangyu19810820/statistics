package statistics.mean;

import org.junit.Test;
import statistics.mean.PopulationMeanCalculate;
import statistics.mean.SampleMeanCalculate;

import java.util.Arrays;
import java.util.List;

public class SampleMeanCalculateTest {

    @Test
    public void testCalc() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0);
        SampleMeanCalculate sampleMeanCalculate = new SampleMeanCalculate();
        double result = sampleMeanCalculate.calc(numbers);
        System.out.println(result);
    }
}
