package bean;

public class CourseBean {
    private int id;
    private String code;
    private String name;
    private int credit;
    private int period;
    private int planOrder;
    private String attr;
    private int year;
    private String major;
    private String ad_year;
    private String open_time;
    private String pre;
    private int planNum;
    private String abbr_name;
    private String course_name;

    public int getPlanNum() {
        return planNum;
    }

    public void setPlanNum(int planNum) {
        this.planNum = planNum;
    }

    public String getPre() {
        return pre;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public String getOpen_time() {
        return open_time;
    }

    public void setOpen_time(String open_time) {
        this.open_time = open_time;
    }

    public String getAd_year() {
        return ad_year;
    }

    public void setAd_year(String ad_year) {
        this.ad_year = ad_year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAttr() {
        return attr;
    }

    public int getPlanOrder() {
        return planOrder;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public void setPlanOrder(int planOrder) {
        this.planOrder = planOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCredit() {
        return credit;
    }

    public int getPeriod() {
        return period;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getAbbr_name() {
        return abbr_name;
    }

    public void setAbbr_name(String abbr_name) {
        this.abbr_name = abbr_name;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }
}

