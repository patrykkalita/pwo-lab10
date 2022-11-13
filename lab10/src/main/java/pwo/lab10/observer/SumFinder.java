package pwo.lab10.observer;

public class SumFinder implements Publisher.Subscriber{

    Integer sum = null;

    @Override
    public void action(int x) {
        sum = sum == null ? x : sum + x;
    }

    public int getSum() {
        return sum;
    }

}
