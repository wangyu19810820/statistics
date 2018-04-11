package statistics.stdev;

import statistics.variance.SampleVarianceCalculate;
import statistics.variance.VarianceCalculateInterface;

/**
 * 样本标准差计算器
 */
public class SampleStandardDeviationCalculate implements StandardDeviationCalculateInterface {

    @Override
    public double calc(Iterable iterable) {
        VarianceCalculateInterface varianceCalculate = new SampleVarianceCalculate();
        return Math.sqrt(varianceCalculate.calc(iterable));
    }
}
