package statistics.variance;

import statistics.mean.MeanCalculateInterface;
import statistics.mean.PopulationMeanCalculate;

/**
 * 方差计算器抽象父类
 */
public abstract class AbstractVarianceCalculate implements VarianceCalculateInterface {

    /** 平均值计算器，一般情况下为普通平均值，某些统计算法会用到特殊平均值计算器 */
    protected MeanCalculateInterface meanCalculate = new PopulationMeanCalculate();

    /**
     * 设置平均值计算器
     * @param meanCalculate 平均值计算器
     */
    public void setMeanCalculate(MeanCalculateInterface meanCalculate) {
        this.meanCalculate = meanCalculate;
    }

}
