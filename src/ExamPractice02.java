class Computer {

    // Fields
    private String model;
    private int year;

    // Constructor

    // Accessor (Getter) methods
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Mutator (Setter) methods
    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString method
    @Override
    public String toString() {
        return "Computer Model: " + model + ", Year of Manufacturing: " + year;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Computer myComputer = new Computer();
        // Using setters to modify fields
        myComputer.setModel("HP Pavilion");
        myComputer.setYear(2022);
        System.out.println(myComputer.toString());  // Output: Computer Model: HP Pavilion, Year of Manufacturing: 2022
    }
}
