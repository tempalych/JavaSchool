package classwork;

/**
 * Created by artem on 27.04.17.
 */
public class Apple {
    private String color;
    private int weight;

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }
}
