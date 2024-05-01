package visitorDesignPattern;
//implements the FurnitureVisitor interface and calculates shipping costs based on different furniture types.
public class ShippingCostCalculator implements FurnitureVisitor {
    private double totalCost;

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public void visit(Chair chair) {
        // For chairs, assume a flat shipping rate
        totalCost += 10.0;
    }

    @Override
    public void visit(Table table) {
        // For tables, calculate shipping cost based on size
        double area = table.getLength() * table.getWidth();
        totalCost += area * 0.05; // $0.05 per square unit
    }

    @Override
    public void visit(Sofa sofa) {
        // For sofas, calculate shipping cost based on size and distance
        totalCost += sofa.getSize() * sofa.getDistance() * 0.01; // $0.01 per cubic unit per mile
    }
}
