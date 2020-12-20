package Actors;
import Clothes.Shoes;
import Clothes.Hat;
import Actors.Neznaika;

public class River {
    private String name;

    public String getName() {
        return name;
    }

    public River(String name) {
        this.name = name;
    }

    public static class Flow{
        private boolean flow;

        public Flow(boolean f){
            flow = f;
        }

        public void CarriedAway(Neznaika n, Shoes s, Hat h){
            n.setHat(false);
            if (flow){
                System.out.println(s.toString() + " и " + h.toString() + " унесло течением...");
            }
            else {
                System.out.println(s.toString() + " и " + h.toString() + " пропали без вести");
            }
        }
    }

    public void Host(Neznaika n, Goat k){
        while(n.getColor()!=4 && k.getColor()!=4) {
            System.out.println(n.getName() + " и " + k.getName() +
                    " нырнули в реку " + getName() + ", чтобы найти ботинки и шляпу!");
            n.setColor(n.getColor() + 1);
            k.setColor(k.getColor() + 1);
            System.out.println(n.getName() + " " + n.color() + ". " +
                    k.getName() + " " + k.color() + ".");
            if(n.getColor()==4){
                System.out.println("Но так ничего и не нашли(");
            }
        }
    }

    public void Host(Neznaika n){
        while(n.getColor()!=4 ) {
            System.out.println(n.getName() + " нырнул в реку " + getName() + ", чтобы найти ботинки и шляпу!");
            n.setColor(n.getColor() + 1);
            System.out.println(n.getName() + " " + n.color() + ".");
            if(n.getColor()==4){
                System.out.println("Но так ничего и не нашел(");
            }
        }
    }

    public void Host(Goat k){
        while(k.getColor()!=4 ) {
            System.out.println(k.getName() + " нырнул в реку " + getName() + ", чтобы найти ботинки и шляпу!");
            k.setColor(k.getColor() + 1);
            System.out.println(k.getName() + " " + k.color() + ".");
            if(k.getColor()==4){
                System.out.println("Но так ничего и не нашел(");
            }
        }
    }
}
