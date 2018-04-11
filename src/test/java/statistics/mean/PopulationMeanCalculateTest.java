package statistics.mean;

import org.junit.Test;
import statistics.mean.PopulationMeanCalculate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PopulationMeanCalculateTest {

    @Test
    public void testCalc() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0);
        PopulationMeanCalculate populationMeanCalculate = new PopulationMeanCalculate();
        double result = populationMeanCalculate.calc(numbers);
        System.out.println(result);
    }
}
