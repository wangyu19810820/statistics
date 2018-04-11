package statistics.mean;

import statistics.model.RawScoreInterface;

/**
 * 平均值计算接口
 */
public interface MeanCalculateInterface {

    double calc(Iterable<?> iterable);
}
