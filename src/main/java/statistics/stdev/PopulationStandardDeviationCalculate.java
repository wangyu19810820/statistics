package statistics.stdev;

import statistics.variance.PopulationVarianceCalculate;
import statistics.variance.VarianceCalculateInterface;

/**
 * 总体标准差计算器
 */
public class PopulationStandardDeviationCalculate implements StandardDeviationCalculateInterface {

    @Override
    public double calc(Iterable iterable) {
        VarianceCalculateInterface varianceCalculate = new PopulationVarianceCalculate();
        return Math.sqrt(varianceCalculate.calc(iterable));
    }
}
