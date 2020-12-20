package Actors;

public abstract class Animal {
    protected String name;

    public String getName(){
        return name;
    }

    public void GoHunting(){
        System.out.println(getName() + " ушёл на добычу...");
    }
}