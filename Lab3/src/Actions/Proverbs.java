package Actions;
import Actors.Goat;
public enum Proverbs {
    A("\"Кому пироги да пышки, а нам синяки да шишки\""),
    B("\"Слышит ухо, что не сыто брюхо\""),
    C("\"Яков лаком, съел кошку с маком\"");

    private String proverb;

    Proverbs(String st){
        proverb = st;
    }

    public void SayProverb(){
        System.out.println(proverb);
    }
}
