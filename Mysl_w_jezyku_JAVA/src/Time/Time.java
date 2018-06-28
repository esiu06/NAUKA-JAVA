package Time;

public class Time {
    private int hour;
    private int minute;
    private double second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }
    public Time(int hour, int minute, double second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour() {
        return this.hour;
    }
    public int getMinute() {
        return this.minute;
    }
    public double getSecond() {
        return this.second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(double second) {
        this.second = second;
    }
    public String toString(){
        return String.format("%02d:%02d:%04.1f\n", this.hour, this.minute, this.second);
    }
    public static void printTime(Time t) {
        System.out.printf("%02d:%02d:%04.1f\n", t.hour, t.minute, t.second);
    }
    public boolean equasl(Time that){
        return this.hour == that.hour && this.minute == that.minute && this.second == that.second;
    }
    public static Time add(Time t1, Time t2){
        Time sum = new Time();
        sum.hour = t1.hour + t2.hour;
        sum.minute = t1.minute + t2.minute;
        sum.second = t1.second + t2.second;
        return sum;
    }
    public Time add(Time t2){
        Time sum = new Time();
        sum.hour = this.hour + t2.hour;
        sum.minute = this.minute + t2.minute;
        sum.second = this.second + t2.second;

        if(sum.second >= 60.0){
            sum.second -= 60.0;
            sum.minute += 1;
        }
        if(sum.minute >= 60){
            sum.minute -= 60;
            sum.hour += 1;
        }
        return sum;
    }
    public void increment(double second){
        this.second += second;
        while (this.second >= 60.0){
            this.second -= 60.0;
            this.minute += 1;
        }
        while (this.minute >= 60){
            this.minute -= 60;
            this.hour += 1;
        }
    }

}
