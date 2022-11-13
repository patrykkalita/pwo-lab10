package pwo.lab10.observer;

public class AvgFinder implements Publisher.Subscriber{
    
    //Double avg = null;
    Double sum = null;

    @Override
    public void action(int x) {
        sum = sum == null ? x : sum + x;
    }
    
    public Double getAvg() {
        return sum/3;
    }

}
