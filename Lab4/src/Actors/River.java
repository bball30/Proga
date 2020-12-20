package Actors;
import Clothes.Shoes;
import Clothes.Hat;
import Actors.Neznaika;

public class River {
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
            System.out.println(n.getName() + " и " + k.getName() + " нырнули в воду, чтобы найти ботинки и шляпу!");
            n.setColor(n.getColor() + 1);
            k.setColor(k.getColor() + 1);
            System.out.println(n.getName() + " " + n.color() + ". " + k.getName() + " " + k.color() + ".");
            if(n.getColor()==4){
                System.out.println("Но так ничего и не нашли(");
            }
        }
    }
}
