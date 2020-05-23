public class BonusService {
    public long calculate (long amount, boolean registred) {
        int percent;
        if (registred) {
            percent = 3;
        } else {
            percent = 1;
        }
        long bonus = amount * percent / 100 / 100;
        int limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }

        return bonus;

    }


}
