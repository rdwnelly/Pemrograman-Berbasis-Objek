package AbstrakP14;

public abstract class Shape {

    String color;

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }

    abstract float getArea();
}
