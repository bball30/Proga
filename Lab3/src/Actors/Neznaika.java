package Actors;

import Actions.*;
import Clothes.Hat;
import Clothes.Shoes;
import Location.Location;

import java.util.Objects;

public class Neznaika implements INeznaika, INeznaikaFun {
    private final String name;
    private final int SizeOfShoes;

    public Neznaika(String n, int s){
        name = n;
        SizeOfShoes = s;
    }

    public int getSizeOfShoes() {
        return SizeOfShoes;
    }

    public String getName() {
        return name;
    }

    public void ShoesYes() {
        System.out.println(getName() + " в ботинках");
    }

    public void ShoesNo() {
        System.out.println(getName() + " босой");
    }

    public void HatYes(Hat hat) {
        System.out.println(getName() + " в" + hat.getColor() + " шляпе");
    }

    public void HatNo() {
        System.out.println(getName() + " без шляпы");
    }

    public void SayProverbs(Proverbs p) {
        System.out.println(getName() + " вспомнил и произнес пословицу:" + p.SayProverb());
    }

    @Override
    public void TryOn(Shoes shoes) {
        System.out.println(getName() + " меряет " + shoes.toString());
    }

    @Override
    public void StayOn(Location l) {
        System.out.println(getName() + " остался проводить время " + l.getPlace());
    }

    @Override
    public void ThinkAbout() {
        System.out.println(getName() + " напряг все свои умственные способности, чтобы придумать развлечение:");
    }

    @Override
    public void Sing(Song s) {
        System.out.println(getName() + " спел себе песенку:\n" + s.getSong());
    }

    @Override
    public void MadeRiddles(Quiz q) {
        System.out.println(getName() +" сам себе загадал загадку:\n" + q.getQuiz());
    }

    @Override
    public void GuessRiddles(Quiz a) {
        System.out.println("И " + getName() + " тут же её разгадал:\n" + a.getAnswer());
    }

    @Override
    public boolean Riddle(Quiz a) {
        if (a.getAnswer() == "Нужно вовремя сдавать все лабы(или написать ПСЖ)!") return true;
        else return false;
    }

    @Override
    public void RememberLife() {
        System.out.print(getName() + " вспомнил разные случаи из жизни");
    }

    @Override
    public void RememberFriends() {
        System.out.println(", а также всех своих друзей и знакомых");
    }

    @Override
    public String toString() {
        return "Neznaika{" +
                "name='" + name + '\'' +
                ", SizeOfShoes=" + SizeOfShoes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Neznaika neznaika = (Neznaika) o;
        return SizeOfShoes == neznaika.SizeOfShoes &&
                name.equals(neznaika.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, SizeOfShoes);
    }
}
