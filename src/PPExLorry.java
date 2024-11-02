interface HeavyVehicle {
    // Method to calculate tax based on laden weight
    double getTax(int ladenWeight);
}
public class PPExLorry extends PPExVehicle implements HeavyVehicle {
     int ladenWeight;

    // Constructor for Lorry
    public PPExLorry(String registeredNumber, int yearOfManufacture, String make, String ownerName, int engineCapacity, int ladenWeight) {
        super(registeredNumber, yearOfManufacture, make, ownerName);
        this.ladenWeight = ladenWeight;
    }

    // Implementation of getTax based on laden weight
    @Override
    public double getTax(int ladenWeight) {
        return (ladenWeight > 3000) ? 250 : 450;
    }

    // Implementation of getLicenseFee for Lorry, which includes tax
    @Override
    public double getLicenseFee() {
        return 1000 + getTax(ladenWeight);
    }
}
