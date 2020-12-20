package Actors;

import Actions.*;
import Clothes.Hat;
import Clothes.Shoes;
import Exeptions.RocketException;
import Exeptions.SizeException;
import Location.Location;

import java.util.Objects;

public class Neznaika implements INeznaika, INeznaikaFun {
    private final String name;
    private final int SizeOfShoes;
    private int color = 1;
    private boolean IsShoes;
    private boolean IsHat;

    public void setHat(boolean hat) {
        IsHat = hat;
    }

    public Neznaika(String n, int s){
        name = n;
        SizeOfShoes = s;
    }

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

    public String getName() {
        return name;
    }

    public void WhatIsTheSize(Shoes s) throws SizeException {
        System.out.println("*Началась проверка на совместимость ботинок*");
        if(SizeOfShoes == s.getSize()){
            System.out.println("Ботинки в самый раз!");
            IsShoes = true;
        }
        else if(SizeOfShoes > s.getSize()){
            IsShoes = false;
            throw new SizeException("Ботинки большие(");
        }
        else {
            IsShoes = false;
            throw new SizeException("Ботинки оказались малы...");
        }
    }

    public void IsShoes(){
        if(IsShoes){
            System.out.println(getName() + " в ботинках");
        }
        else {
            System.out.println(getName() + " босой");
        }
    }

    public void IsHat(Hat hat) {
        if(IsHat){
            System.out.println(getName() + " в" + hat.getColor() + " шляпе");
        }
        else{
            System.out.println(getName() + " без шляпы");
        }
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
    public void UnDress() {
        System.out.println(getName() + " разделся");
    }

    @Override
    public void FlashBack(String s) {
        class Donut{
            private final String name;
            private boolean IsInRocket = false;

            public String getName() {
                return name;
            }

            Donut(String n){
                name = n;
            }

            public String LoveToEat(){
               return " любит покушать";
            }

            public String SitInRocket(){
                IsInRocket = true;
                return " сидит в ракете";
            }

            public void IsInRocket() throws RocketException {
                if(IsInRocket){
                    throw new RocketException(" не может ему помочь(поэтому грустит)");
                }
                else {
                    throw new RocketException(" не грустит, все отлично, никому помогать не надо!");
                }
            }
        }

        Donut don = new Donut(s);

        System.out.println(getName() + " вспомнил о " + don.getName() + "е:");
        System.out.println(getName() + " воображал, что " + don.getName() + don.SitInRocket());
        try{
            don.IsInRocket();
        }
        catch (RocketException e){
            System.out.println(getName() + e.getMessage());
        }
        System.out.println(getName() + " вспомнил, что " + don.getName() + don.LoveToEat());
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
