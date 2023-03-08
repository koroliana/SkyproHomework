package course2.lesson3_oop;

public class Car extends Vehicle{
    Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void vehicleCheckup() {
        super.vehicleCheckup();
        System.out.println("Проверяем двигатель");
    }


}
