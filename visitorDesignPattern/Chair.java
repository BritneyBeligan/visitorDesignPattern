package visitorDesignPattern;

public class Chair implements Furniture{
    private double weight; // weight of the chair

    public Chair(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(FurnitureVisitor visitor) {
        visitor.visit(this);
    }
}
