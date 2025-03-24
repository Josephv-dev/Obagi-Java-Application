// HybridCar.java
class HybridCar {
    String model;
    double cityMPG;
    double highwayMPG;
    String batteryType;
    double batteryWeight;

    HybridCar(String model, double cityMPG, double highwayMPG, String batteryType, double batteryWeight) {
        this.model = model;
        this.cityMPG = cityMPG;
        this.highwayMPG = highwayMPG;
        this.batteryType = batteryType;
        this.batteryWeight = batteryWeight;
    }

    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("City MPG: " + cityMPG);
        System.out.println("Highway MPG: " + highwayMPG);
        System.out.println("Battery Type: " + batteryType);
        System.out.println("Battery Weight: " + batteryWeight + " kg\n");
    }
}

// HybridCarTest.java
public class HybridCarTest {
    public static void main(String[] args) {
        HybridCar car1 = new HybridCar("Toyota Prius", 54, 50, "Lithium-ion", 80);
        HybridCar car2 = new HybridCar("Honda Insight", 55, 49, "Nickel-metal hydride", 75);
        
        car1.displayInfo();
        car2.displayInfo();
    }
}