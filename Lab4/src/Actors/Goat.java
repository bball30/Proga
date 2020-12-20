package Actors;

import java.util.Objects;

public class Goat extends Animal {
    private final int SizeOfShoes;
    private int color = 1;

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public String color(){
        switch(color) {
            case 2: return "порозовел";
            case 3: return "поголубел";
            case 4: return "посинел";
            default: return null;
        }
    }

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

    public void UnDress() {
        System.out.println(getName() + " разделся");
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