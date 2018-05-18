package statistics.model;

/**
 * 学生评教的三步算法的数据模型
 */
public class Score implements RawScoreInterface {

    /** 教师 */
    private String teacher;
    /** 班级 */
    private String className;
    /** 组织（学院、学校机构等） */
    private String organizeName;

    /** 数量 */
    private Double num;
    /** 方差 */
    private Double standardScore;
    /** 百分比数值数据 */
    private Double hundredScore;

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getOrganizeName() {
        return organizeName;
    }

    public void setOrganizeName(String organizeName) {
        this.organizeName = organizeName;
    }

    @Override
    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    @Override
    public Double getStandardScore() {
        return standardScore;
    }

    public void setStandardScore(Double standardScore) {
        this.standardScore = standardScore;
    }

    @Override
    public Double getHundredScore() {
        return hundredScore;
    }

    public void setHundredScore(Double hundredScore) {
        this.hundredScore = hundredScore;
    }
}
