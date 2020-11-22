package Actors;

import java.util.Objects;

public class Goat extends Animal {
    private final int SizeOfShoes;

    public int getSizeOfShoes() {
        return SizeOfShoes;
    }

    public Goat(String n, int s) {
        super.name = n;
        SizeOfShoes = s;
    }

    public void SayItIsNotHard(){
        System.out.println(getName() + ": \"Мне не трудно\"");
    }

    @Override
    public String toString() {
        return "Goat{" +
                "SizeOfShoes=" + SizeOfShoes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goat goat = (Goat) o;
        return SizeOfShoes == goat.SizeOfShoes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(SizeOfShoes);
    }
}