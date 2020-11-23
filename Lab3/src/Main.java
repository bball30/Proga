import Actions.Proverbs;
import Actions.Quiz;
import Clothes.Shoes;
import Actions.Song;
import Actors.Goat;
import Actors.Neznaika;
import Clothes.Hat;
import Location.Location;

public class Main {
    public static void main(String[] args) {
        Goat k = new Goat("Козлик", 44);
        Neznaika n = new Neznaika("Незнайка", 40);
        Shoes shoes = new Shoes(k);
        Hat hat = new Hat("красный", 5);
        Song s = new Song("\"А помнишь, друг, как мы сдавали БЭВМ,\nТолпою маленьких и глупых перваков?\nИ становился ты увы и глух, и нем\nПеред вопросом этих практиков-врагов...\"");
        Quiz q = new Quiz("Как не отчислиться на первом курсе ВТ?", "Нужно вовремя сдавать все лабы(или написать ПСЖ)!");
        boolean Shoes;
        boolean Hat = false;

        System.out.println(Location.UNDER_BRIDGE.getPlace());
        k.SayItIsNotHard();
        n.TryOn(shoes);
        if (n.getSizeOfShoes() == shoes.getSize()){
            System.out.println("Ботинки в самый раз!");
            Shoes = true;
        }
        else if (n.getSizeOfShoes() > shoes.getSize()) {
            System.out.println("Ботинки большие(");
            Shoes = false;
        } else {
            System.out.println("Ботинки оказались малы...");
            Shoes = false;
        }
        k.GoHunting();

        n.StayOn(Location.UNDER_BRIDGE);
        if (Shoes) {
            n.ShoesYes();
        } else {
            n.ShoesNo();
        }
        if (Hat) {
            n.HatYes(hat);
        } else {
            n.HatNo();
        }
        n.ThinkAbout();
        n.Sing(s);
        n.MadeRiddles(q);
        n.GuessRiddles(q);
        System.out.println(n.Riddle(q));
        n.SayProverbs(Proverbs.A);
        n.SayProverbs(Proverbs.B);
        n.SayProverbs(Proverbs.C);
        n.RememberLife();
        n.RememberFriends();
    }
}
