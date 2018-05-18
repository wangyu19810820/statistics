package statistics.stdev;


import statistics.variance.RawScoreVarianceCalculate;
import statistics.variance.VarianceCalculateInterface;

/**
 * 总体标准差计算器
 */
public class RawScoreStandardDeviationCalculate implements StandardDeviationCalculateInterface {

    @Override
    public double calc(Iterable iterable) {
        VarianceCalculateInterface varianceCalculate = new RawScoreVarianceCalculate();
        return Math.sqrt(varianceCalculate.calc(iterable));
    }
}
