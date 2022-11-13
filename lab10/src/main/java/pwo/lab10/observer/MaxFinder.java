package pwo.lab10.observer;

public class MaxFinder implements Publisher.Subscriber{

    Integer max = null;

    @Override
    public void action(int x) {
        if (max == null || max < x) {
            max = x;
        }
    }

    public int getMax() {
        return max;
    }


}
