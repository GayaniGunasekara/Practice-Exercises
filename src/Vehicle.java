
public abstract class Vehicle {
    private String regNumber;
    private int yearOfManufacture;
    private String make;
    private String ownerName;

    // Constructor with all parameters
    public Vehicle(String regNumber, int yearOfManufacture, String make, String ownerName) {
        this.regNumber = regNumber;
        this.yearOfManufacture = yearOfManufacture;
        this.make = make;
        this.ownerName = ownerName;
    }

    // Constructor with only registration number and year of manufacture
    public Vehicle(String regNumber, int yearOfManufacture) {
        this(regNumber, yearOfManufacture, "Unknown", "Unknown");
    }

    // Getters and setters
    public String getRegNumber() {
        return regNumber;
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
