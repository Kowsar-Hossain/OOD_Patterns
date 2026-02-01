public class BuilderDemo {
    public static void main(String[] args) {

        Car car = new CarBuilder()
                .setEngine("V6")
                .setColor("Black")
                .setDoors(4)
                .setModel("Sedan")
                .build();

        System.out.println(car);
    }
}
