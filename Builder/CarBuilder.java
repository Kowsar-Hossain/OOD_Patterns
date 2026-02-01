public class CarBuilder {
    private String engine;
    private String color;
    private int doors;
    private String model;

    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public Car build() {
        return new Car(engine, color, doors, model);
    }
}
