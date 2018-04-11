package statistics.model;

public class Score implements RawScoreInterface {

    private String teacher;
    private String className;
    private String organizeName;
    private Double num;
    private Double standardScore;
    private Double hundardScore;

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
    public Double getHundardScore() {
        return hundardScore;
    }

    public void setHundardScore(Double hundardScore) {
        this.hundardScore = hundardScore;
    }
}
