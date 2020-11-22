package Clothes;

import Actors.Goat;
import Actors.Neznaika;

import java.util.Objects;

public class Shoes {
    private final int size;

    public Shoes(Goat g){
        size = g.getSizeOfShoes();
    }

    public Shoes(Neznaika n){
        size = n.getSizeOfShoes();
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shoes shoes = (Shoes) o;
        return size == shoes.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }
}
