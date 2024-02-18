public class Choco extends Product{

    int percentageOfCocoa;

    public Choco(String name, double cost, int percentageOfCocoa) {
        super(name, cost);
        this.percentageOfCocoa = percentageOfCocoa;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", percentageOfCocoa: %s", this.percentageOfCocoa);
    }
}