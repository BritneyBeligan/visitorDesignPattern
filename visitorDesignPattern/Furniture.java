package visitorDesignPattern;

//represents the elements that can be visited
public interface Furniture {
    void accept(FurnitureVisitor visitor);
}
