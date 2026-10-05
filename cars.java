package practices;

public class cars {
    private String plateNumber;
    private String carModel;
    private double dailyRate;
    private boolean rent;

    public static String companyName = "JUST Rentals";
    public static int totalCars = 0;

    public cars() {
        this.plateNumber = "Unknown";
        this.carModel = "Unknown";
        this.dailyRate = 0.0;
        this.rent = false;
        totalCars++;
    }

    public cars(String plateNumber, String model, double dailyRate) {
        this.plateNumber = plateNumber;
        this.carModel = model;
        this.rent = false;

        if (dailyRate >= 0) {
            this.dailyRate = dailyRate;
        } else {
            System.out.println("Invalid daily rate. Rate set to 0.0");
            this.dailyRate = 0.0;
        }

        totalCars++;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getModel() {
        return carModel;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public boolean isRented() {
        return rent;
    }

    public void setDailyRate(double rate) {
        if (rate >= 0) {
            this.dailyRate = rate;
            System.out.println("Daily rate updated to $" + rate);
        } else {
            System.out.println("Invalid rate. Daily rate cannot be negative.");
        }
    }

    public void rent() {
        if (rent) {
            System.out.println("Car " + plateNumber + " is already rented.");
        } else {
            rent = true;
            System.out.println("Car " + plateNumber + " has been rented successfully.");
        }
    }

    public void returnCar() {
        if (rent) {
            rent = false;
            System.out.println("Car " + plateNumber + " has been returned successfully.");
        } else {
            System.out.println("Car " + plateNumber + " was not rented.");
        }
    }

    public void displayInfo() {
        System.out.println("==Info==");
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Model: " + carModel);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Status: " + rent);
    }

    public static void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
    }

    public static void displayTotalCars() {
        System.out.println("Total Cars Created: " + totalCars);
    }
}

class testing {
    public static void main(String[] args) {

        cars c1 = new cars("AB123", "Benz Mercedes", 40);
        c1.displayInfo();

        cars c2 = new cars("AC34", "BMW", 60);
        c2.displayInfo();

        c1.rent();

        c1.rent();

        c1.returnCar();

        c1.setDailyRate(50);

        c1.displayInfo();

        cars.displayCompanyName();
        cars.displayTotalCars();
    }
}