package Clothes;

import java.util.Objects;

public class Hat {
    private final String color;
    private final int size;

    public Hat(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "шляпа " + color + " цвета и " + size + " размера";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hat hat = (Hat) o;
        return size == hat.size &&
                color.equals(hat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, size);
    }
}
