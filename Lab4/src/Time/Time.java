package Time;

public enum Time {
    MORNING("**наступило утро**"),
    AFTERNOON("**наступил день**"),
    EVENING("**наступил вечер**"),
    NIGHT("**наступила ночь**");

    public String getTime() {
        return time;
    }

    private String time;

    Time(String s) {
        time = s;
    }

    public void changeTime(Time str) {
        System.out.println(str.getTime());
    }
}
