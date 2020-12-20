package Location;

public enum Location {
    UNDER_BRIDGE("**Под мостом**"),
    UNDER_WATER("**В воде**"),
    NEAR_WATER("**Рядом с водой**");

    private final String place;

    Location(String st) {
        place = st;
    }

    public String getPlace() {
        return place;
    }

    public void changeLocation(Location str) {
        System.out.println(getPlace() + "-->" + str.getPlace());
    }

}
