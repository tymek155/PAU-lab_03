public class SortContext {
    public Strategy strategy;

    public SortContext(Strategy strat){
        this.strategy = strat;
    }

    public void setStrategy(Strategy strat){
        this.strategy = strat;
    }

    public void execSort(int[] array){
        double sTime = System.nanoTime();
        strategy.sort(array);
        double eTime = System.nanoTime();
        System.out.println("Czas dzialania algorytmu: " + (eTime-sTime));
    }
}
