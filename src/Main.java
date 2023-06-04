import ru.skypro.*;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("lambo");
        Car car1 = new Car("Ferrari");

        Truck truck = new Truck("Mask");
        Truck truck1 = new Truck("Scania", 8);

        Bicycle bicycle = new Bicycle("Merida");
        Bicycle bicycle1 = new Bicycle("Stels");

        Transport[] transports = {
                car,
                car1,
                truck,
                truck1,
                bicycle,
                bicycle1
        };

        ServiceStation serviceStation = new ServiceStation();
        for (Transport transport : transports) {
            System.out.println(".................");
            serviceStation.check(transport);
            System.out.println(".................");

        }
    }
}