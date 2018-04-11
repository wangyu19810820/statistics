package statistics.variance;

import statistics.mean.MeanCalculateInterface;

/**
 * 方差计算器接口
 */
public interface VarianceCalculateInterface {

    double calc(Iterable<?> iterable);
    void setMeanCalculate(MeanCalculateInterface meanCalculate);
}
