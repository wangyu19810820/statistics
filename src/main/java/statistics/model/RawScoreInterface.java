package statistics.model;

/**
 * 三步算法(剔除异常数据算法)的通用模型类
 * 数据在整个算法中自然流动，避免执行计算中，反复转换数据容器
 */
public interface RawScoreInterface {
    // 数据总数
    Double getNum();

    // 设置方差值
    void setStandardScore(Double standardScore);

    // 获取方差值
    Double getStandardScore();

    // 设置百分比数值数据
    void setHundredScore(Double hundardScore);

    // 获取百分比数值数据
    Double getHundredScore();
}
