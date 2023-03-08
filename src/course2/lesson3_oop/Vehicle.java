package course2.lesson3_oop;

abstract class Vehicle implements VehicleMaintenance {
    private final String modelName;
    private final int wheelsCount;

    Vehicle (String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    String getModelName() {
        return modelName;
    }

    int getWheelsCount() {
        return wheelsCount;
    }


@Override
public void vehicleCheckup() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку "+ (i+1));
        }

    }

}
