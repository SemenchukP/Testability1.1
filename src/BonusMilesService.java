public class BonusMilesService {

    public int calculate(int cost) {
        int mileCost = 20;
        int miles = cost / mileCost;
        return miles;
    }
}
