package visitorDesignPattern;

public class FurnitureType {
    public static void main(String[] args) {
        // Create some furniture items
        Chair chair = new Chair(5.0);
        Table table = new Table(3.0, 2.0);
        Sofa sofa = new Sofa(10.0, 50.0); // 10 cubic units size, 50 miles distance

        // Calculate shipping cost using visitor pattern
        ShippingCostCalculator calculator = new ShippingCostCalculator();
        chair.accept(calculator);
        table.accept(calculator);
        sofa.accept(calculator);

        // Output the total shipping cost
        System.out.println("Total shipping cost of the furniture: $" + calculator.getTotalCost());
    }
}
