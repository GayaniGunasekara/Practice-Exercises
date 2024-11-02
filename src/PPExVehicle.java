public abstract class PPExVehicle {
    private String registeredNumber;
    private int yearOfManufacture;
    private String make;
    private String ownerName;


    // Constructor with all properties
    public PPExVehicle(String registeredNumber, int yearOfManufacture, String make, String ownerName) {
        this.registeredNumber = registeredNumber;
        this.yearOfManufacture = yearOfManufacture;
        this.make = make;
        this.ownerName = ownerName;

    }

    // Constructor with some default values
    public PPExVehicle(String registeredNumber, int yearOfManufacture) {
        this(registeredNumber, yearOfManufacture,"xxx","YYYY");
    }

    // Getters
    public String getRegisteredNumber() {
        return registeredNumber;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getMake() {
        return make;
    }

    public String getOwnerName() {
        return ownerName;
    }


    // Abstract method to be implemented by subclasses
    public abstract double getLicenseFee();
}
