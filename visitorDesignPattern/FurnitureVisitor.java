package visitorDesignPattern;
// declares the visit methods for each concrete furniture type
public interface FurnitureVisitor {
    void visit(Chair chair);
    void visit(Table table);
    void visit(Sofa sofa);
}
