package newswiggy.SwiggyCompleteApplication;
import newswiggy.SwiggyCompleteApplication.Address;
import newswiggy.SwiggyCompleteApplication.Dish;
import newswiggy.SwiggyCompleteApplication.Rating;

import java.util.List;

public class Restaurant {
    public String restaurantName;
    public Address address;
    public List<Dish> dishList;
    public Rating restuarantRating;

    public Restaurant(String restaurantName, List<Dish> dishList, Rating restuarantRating) {
        this.restaurantName = restaurantName;
        this.dishList = dishList;
        this.restuarantRating = restuarantRating;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantName='" + restaurantName + '\'' +
                ", address=" + address +
                ", dishList=" + dishList +
                ", restuarantRating=" + restuarantRating +
                '}';
    }
}
