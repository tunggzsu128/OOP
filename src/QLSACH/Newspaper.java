package src.QLSACH;

public class Newspaper extends Document {
    private int dayIssue;

    public Newspaper(String id, String nxb, int number, int issueNumber) {
        super(id, nxb, number);
        this.dayIssue = issueNumber;
    }

    public int getDayIssue() {
        return dayIssue;
    }

    public void setDayIssuer(int dayIssue) {
        this.dayIssue = dayIssue;
    }

    @Override
    public String toString() {
        return "Newspaper{" + "dayIssue=" + dayIssue + ", id='" + id + '\'' + ", nxb='" + nxb + '\'' + ", number='"
                + number + '\'' + '}';
    }

}
