package Actions;

import Clothes.Shoes;
import Location.Location;

public interface INeznaika {
    void TryOn(Shoes shoes);
    void StayOn(Location l);
    void ThinkAbout();
    void UnDress();
    void FlashBack(String s);
}
