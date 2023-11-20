package Model;

public abstract class Literature {
    private String title;
    private int year;
    private int publisherId;

    public Literature(String title, int year, int publisherId) {
        this.title = title;
        this.year = year;
        this.publisherId = publisherId;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public int getPublisher() {
        return publisherId;
    }

}
