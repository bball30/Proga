package Actors;

import Time.Time;

public class City {
    private boolean isSleeping;

    public class Cops {
        private String name;

        public Cops(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void IsSleeping(){
            if(City.this.isSleeping){
                System.out.println("Проснулись и " + getName() + "...");
            }
            else {
                System.out.println(getName() + "спят");
            }
        }
    }

    public City(boolean isSleeping) {
        this.isSleeping = isSleeping;
    }

    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }

    public void IsSleeping(){
        if(isSleeping){
            System.out.println("город проснулся");
        }
        else {
            System.out.println("город спит");
        }
    }
}
