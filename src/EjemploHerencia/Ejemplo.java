package EjemploHerencia;

public class Ejemplo {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("iPhone 11", "Blanco", true, 4000, true, 12);
        SmartWatch watch = new SmartWatch("MKQ03BE/A", "Azul", true, 3200, true, "S");

        System.out.println(phone);
        System.out.println(watch);
    }
}

//--------------------------------------- SMART DEVICE
abstract class SmartDevice {
    String model;
    String color;
    boolean waterproof;
    int memory;
    boolean warranty;

    public SmartDevice() {
    }

    public SmartDevice(String model, String color, boolean waterproof, int memory, boolean warranty) {
        this.model = model;
        this.color = color;
        this.waterproof = waterproof;
        this.memory = memory;
        this.warranty = warranty;
    }
}

//--------------------------------------- SMARTPHONE
class SmartPhone extends SmartDevice {
    int cameraResolution;

    public SmartPhone() {
        super();
    }

    public SmartPhone(String model, String color, boolean waterproof, int memory, boolean warranty, int cameraResolution) {
        super(model, color, waterproof, memory, warranty);
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                " model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", waterproof=" + waterproof +
                ", memory=" + memory +
                ", warranty=" + warranty +
                ", cameraResolution='" + cameraResolution + '\'' +
                '}';
    }
}

//--------------------------------------- SMARTWATCH
class SmartWatch extends SmartDevice {
    String strapSize;

    public SmartWatch() {
        super();
    }

    public SmartWatch(String model, String color, boolean waterproof, int memory, boolean warranty, String strapSize) {
        super(model, color, waterproof, memory, warranty);
        this.strapSize = strapSize;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                " model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", waterproof=" + waterproof +
                ", memory=" + memory +
                ", warranty=" + warranty +
                ", strapSize=" + strapSize + '\'' +
                '}';
    }
}