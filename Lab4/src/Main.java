import Actions.*;
import Actors.City;
import Actors.River;
import Clothes.Shoes;
import Actors.Goat;
import Actors.Neznaika;
import Clothes.Hat;
import Exeptions.SizeException;
import Location.Location;
import Time.Time;

public class Main {
    public static void main(String[] args) {
        Goat k = new Goat("Козлик", 44);
        Neznaika n = new Neznaika("Незнайка", 40);
        Shoes shoes = new Shoes(k);
        Hat hat = new Hat("красный", 5);
        Song s = new Song("\"А помнишь, друг, как мы сдавали БЭВМ,\nТолпою маленьких и глупых перваков?\nИ становился ты увы и глух, и нем\nПеред вопросом этих практиков-врагов...\"");
        Quiz q = new Quiz("Как не отчислиться на первом курсе ВТ?", "Нужно вовремя сдавать все лабы(или написать ПСЖ)!");

        City city = new City(false);
        City.Cops cops = city.new Cops("полицаи");

        River river = new River("Огурцовая");
        River.Flow flow = new River.Flow(true);

        System.out.println(Time.MORNING.getTime());
        System.out.println(Location.NEAR_WATER.getPlace());
        n.UnDress();
        k.UnDress();
        Location.NEAR_WATER.changeLocation(Location.UNDER_WATER);

        //river.Host(n, k);
        n.Swim(river);
        k.Swim(river);

        flow.CarriedAway(n, shoes, hat);

        Time.MORNING.changeTime(Time.AFTERNOON);
        city.setSleeping(true);
        city.IsSleeping();

        Appearable appearable = new Appearable() {
            @Override
            public void appear(River r, int i) {
                for (i=1; i<5; i++)
                System.out.println("Прохожий " + i + " появился на набережной реки " + r.getName());
            }
        };
        appearable.appear(river, 7);

        cops.IsSleeping();

        Location.UNDER_WATER.changeLocation(Location.UNDER_BRIDGE);

        k.SayItIsNotHard();
        n.TryOn(shoes);

        try{
            n.WhatIsTheSize(shoes);
        }
        catch (SizeException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("*Проверка завершена*");
        }

        k.GoHunting();

        n.StayOn(Location.UNDER_BRIDGE);

        n.IsShoes();
        n.IsHat(hat);

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

        n.FlashBack("Пончик");
    }
}
