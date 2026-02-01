public class Car {

    private final String engine;
    private String color;
    private int doors;
    private String model;

    // Constructor used by Builder
    public Car(String engine, String color, int doors, String model) {
        this.engine = engine;
        this.color = color;
        this.doors = doors;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                ", model='" + model + '\'' +
                '}';
    }

    // Getters
    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public String getModel() {
        return model;
    }
}
