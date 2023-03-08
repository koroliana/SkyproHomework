package course2.lesson3_oop;

public class Truck extends Vehicle {
    Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void vehicleCheckup() {
        super.vehicleCheckup();
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }
}
