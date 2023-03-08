package course2.lesson3_oop;

public class ServiceStation {
    public void check(Bicycle bicycle) {
        bicycle.vehicleCheckup();
        System.out.println();
    }
    public void check(Car car) {
        car.vehicleCheckup();
        System.out.println();
    }
    public void check(Truck truck) {
        truck.vehicleCheckup();
        System.out.println();
    }
}
