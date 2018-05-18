package statistics.complex;

import com.rsp.core.util.statistics.exception.NoDataException;
import com.rsp.core.util.statistics.mean.HundredScoreMeanCalculate;
import com.rsp.core.util.statistics.mean.RawScoreMeanCalculate;
import com.rsp.core.util.statistics.model.RawScoreInterface;
import com.rsp.core.util.statistics.stdev.RawScoreStandardDeviationCalculate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RawScoreCalculate extends AbstractScoreCalculate {

    public List<RawScoreInterface> calc(Iterable<? extends RawScoreInterface> iterable) {
        RawScoreStandardDeviationCalculate calculate = new RawScoreStandardDeviationCalculate();
        double threeTimeStdev = calculate.calc(iterable) * 3;
        RawScoreMeanCalculate meanCalculate = new RawScoreMeanCalculate();
        double mean = meanCalculate.calc(iterable);

        // 排除异常值
        ArrayList<RawScoreInterface> newDatas = new ArrayList<>();
        Iterator<? extends RawScoreInterface> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            RawScoreInterface rawScore = iterator.next();
            double data = rawScore.getNum();
            if (Math.abs(data - mean) <= threeTimeStdev) {
                newDatas.add(rawScore);
            } else {
//                System.out.println("排除：" + data);
            }
        }

        // 用新的平均值和标准差，计算标准分
        double newMean = meanCalculate.calc(newDatas);
        double newStdev = calculate.calc(newDatas);
        ArrayList<RawScoreInterface> scores = new ArrayList<>();
        Iterator<RawScoreInterface> newDataIterator = newDatas.iterator();
        while (newDataIterator.hasNext()) {
            RawScoreInterface rawScore = newDataIterator.next();
            double data = rawScore.getNum();
            double score = (data - newMean) / newStdev;
            rawScore.setStandardScore(score);
        }

        // 计算百分制标准分
        double maxScore = maxScore(newDatas);
        double minScore = minScore(newDatas);
        double offsetScore = maxScore - minScore;
        Iterator<RawScoreInterface> hundardScoreIterator = newDatas.iterator();
        while (hundardScoreIterator.hasNext()) {
            RawScoreInterface rawScore = hundardScoreIterator.next();
            double score = rawScore.getStandardScore();
            double hundardScore = offset + (score - minScore) / offsetScore * multi;
            rawScore.setHundredScore(hundardScore);
        }

        return newDatas;
    }

    public Double calcHundardMean(Iterable<? extends RawScoreInterface> iterable) {
        HundredScoreMeanCalculate meanCalculate = new HundredScoreMeanCalculate();
        return meanCalculate.calc(iterable);
    }

    private double maxScore(Iterable<RawScoreInterface> iterable) {
        Double max = null;
        Iterator<RawScoreInterface> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            RawScoreInterface rawScore = iterator.next();
            if (max == null) {
                max = rawScore.getStandardScore();
            } else if (rawScore.getStandardScore() > max){
                max = rawScore.getStandardScore();
            }
        }
        if (max == null) {
            throw new NoDataException();
        }
        return max;
    }

    private double minScore(Iterable<RawScoreInterface> iterable) {
        Double min = null;
        Iterator<RawScoreInterface> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            RawScoreInterface rawScore = iterator.next();
            if (min == null) {
                min = rawScore.getStandardScore();
            } else if (rawScore.getStandardScore() < min){
                min = rawScore.getStandardScore();
            }
        }
        if (min == null) {
            throw new NoDataException();
        }
        return min;
    }
}
