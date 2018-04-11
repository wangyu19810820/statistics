package statistics.complex;

import statistics.mean.PopulationMeanCalculate;
import statistics.stdev.PopulationStandardDeviationCalculate;
import statistics.stdev.SampleStandardDeviationCalculate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StandardScoreCalculate extends AbstractScoreCalculate {

    public List<Double> calc(Iterable<Double> iterable) {
        SampleStandardDeviationCalculate calculate = new SampleStandardDeviationCalculate();
        double threeTimeStdev = calculate.calc(iterable) * 3;
        PopulationMeanCalculate meanCalculate = new PopulationMeanCalculate();
        double mean = meanCalculate.calc(iterable);

        // 排除异常值
        ArrayList<Double> newDatas = new ArrayList<>();
        Iterator<Double> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            double data = iterator.next();
            if (Math.abs(data - mean) <= threeTimeStdev) {
                newDatas.add(data);
            }
        }

        // 用新的平均值和标准差，计算标准分
        double newMean = meanCalculate.calc(newDatas);
        double newStdev = calculate.calc(newDatas);
        ArrayList<Double> scores = new ArrayList<>();
        Iterator<Double> newDataIterator = newDatas.iterator();
        while (newDataIterator.hasNext()) {
            double data = newDataIterator.next();
            double score = (data - newMean) / newStdev;
            scores.add(score);
        }

        // 计算百分制标准分
        double maxScore = Collections.max(scores);
        double minScore = Collections.min(scores);
        double offsetScore = maxScore - minScore;
        ArrayList<Double> hundardScores = new ArrayList<>();
        Iterator<Double> scoreIterator = scores.iterator();
        while (scoreIterator.hasNext()) {
            double score = scoreIterator.next();
            double hundardScore = offset + (score - minScore) / offsetScore * multi;
            hundardScores.add(hundardScore);
        }

        return null;
    }
}
