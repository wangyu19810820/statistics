package statistics.complex;

import org.junit.Test;
import statistics.model.RawScoreInterface;
import statistics.model.Score;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RawScoreCalculateTest {

    @Test
    public void testCalc() {
        RawScoreCalculate calculate = new RawScoreCalculate();
        Score score1 = new Score();
        score1.setTeacher("teacher1");
        score1.setClassName("class1");
        score1.setNum(1.0);

        Score score2 = new Score();
        score2.setTeacher("teacher1");
        score2.setClassName("class2");
        score2.setNum(2.0);

        Score score3 = new Score();
        score3.setTeacher("teacher1");
        score3.setClassName("class3");
        score3.setNum(3.0);

        Score score4 = new Score();
        score4.setTeacher("teacher2");
        score4.setClassName("class1");
        score4.setNum(1.0);

        Score score5 = new Score();
        score5.setTeacher("teacher2");
        score5.setClassName("class2");
        score5.setNum(2.0);

        Score score6 = new Score();
        score6.setTeacher("teacher2");
        score6.setClassName("class3");
        score6.setNum(3.0);

        Score score7 = new Score();
        score7.setTeacher("teacher3");
        score7.setClassName("class1");
        score7.setNum(1.0);

        Score score8 = new Score();
        score8.setTeacher("teacher3");
        score8.setClassName("class2");
        score8.setNum(2.0);

        Score score9 = new Score();
        score9.setTeacher("teacher3");
        score9.setClassName("class3");
        score9.setNum(3.0);

        Score score10 = new Score();
        score10.setTeacher("teacher4");
        score10.setClassName("class1");
        score10.setNum(1.0);

        Score score11 = new Score();
        score11.setTeacher("teacher4");
        score11.setClassName("class2");
        score11.setNum(2.0);

        Score score12 = new Score();
        score12.setTeacher("teacher4");
        score12.setClassName("class3");
        score12.setNum(3.0);

        Score score13 = new Score();
        score13.setTeacher("teacher5");
        score13.setClassName("class1");
        score13.setNum(1000.0);

        List<RawScoreInterface> list = new ArrayList<>();
        list.add(score1);
        list.add(score2);
        list.add(score3);
        list.add(score4);
        list.add(score5);
        list.add(score6);
        list.add(score7);
        list.add(score8);
        list.add(score9);
        list.add(score10);
        list.add(score11);
        list.add(score12);
        list.add(score13);

        for (RawScoreInterface raw : list) {
            if ((int)((double)(raw.getNum())) == 1) {
                Score score = (Score) raw;
                ((Score) raw).setNum(85.0);
            }
            if ((int)((double)(raw.getNum())) == 2) {
                Score score = (Score) raw;
                ((Score) raw).setNum(80.0);
            }
            if ((int)((double)(raw.getNum())) == 3) {
                Score score = (Score) raw;
                ((Score) raw).setNum(95.0);
            }
        }

        long startTime = System.currentTimeMillis();
        calculate.calc(list);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

}
