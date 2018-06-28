package Time;

public class TimeClient {

    public static void main(String[] args) {
        Time time = new Time(11,59,59.0);
        Time.printTime(time);
        String s = time.toString();
        System.out.println(s);
        System.out.println(time);

        Time time1 = new Time(9, 30,0.0);
        Time time2 = time1;
        Time time3 = new Time(9,30,0.0);
        boolean t;
        t = time1 == time3;
        System.out.println(t);
        t = time1.equals(time3);
        System.out.println(t);
        t = time2.equals(time1);
        System.out.println(t);

        System.out.println(time1.equasl(time3));

        Time startTime = new Time(18,50,0.0);
        Time runningTime = new Time(2,16,0.0);
        Time endTime = Time.add(startTime, runningTime);
        System.out.println(endTime);

        System.out.println(startTime.add(runningTime));
    }
}
