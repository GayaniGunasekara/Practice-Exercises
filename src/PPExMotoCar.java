class PPExMotorCar extends PPExVehicle {
    private int engineCapacity;
    // Constructor for MotorCar
    public PPExMotorCar(String registeredNumber, int yearOfManufacture, String make, String ownerName) {
        super(registeredNumber, yearOfManufacture, make, ownerName);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }


    // Implementation of getLicenseFee based on engine capacity
    @Override
    public double getLicenseFee() {
        int capacity = getEngineCapacity();
        if (capacity < 1500) {
            return 750 + 1000;
        } else if (capacity <= 2500) {
            return 900 + 1000;
        } else {
            return 1250 + 1000;
        }
    }
}
