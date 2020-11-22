package Location;

public enum Location {
    UNDER_BRIDGE("**Под мостом**"),
    UNDER_WATER("**Под водой"),
    CITY("**В городе**");

    private String place;

    Location(String st) {
        place = st;
    }

    public String getPlace() {
        return place;
    }

    public void changeLocation(String st, String str) {
        System.out.println();
    }

}
