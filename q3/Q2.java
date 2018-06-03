package q3;


public abstract class Q2 {

    private int day; // from 1 to 31
    private int month; // from 1 to 12
    private int year; // from 2000 upwards

    public Q2() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {

        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return this.day + "-" + this.month + "-" + this.year;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Q2)) return false;
        if (this == o) return true;
        Q2 d = (Q2) o;
        return this.day == d.getDay()
                && this.month == d.getMonth()
                && this.year == d.getYear();

    }

    public void advance() {
        //assumes that all months are 31 days long
        this.day++;
        if (this.day > 31) {
            this.day = 1;
            this.month++;
        }
        if (this.month > 12) {
            this.month = 1;
            this.year ++;
        }
    }
}
