package pl.comarch.camp.it.typy.wyliczeniowe;

public class Console2 {
    public static final Console2 PS5 = new Console2("Sony", "PlayStation 5",
            "Intel", "NVidia");
    public static final Console2 PS4 = new Console2("Sony", "PalyStation 4",
            "Intel", "NVidia");
    public static final Console2 XBOX = new Console2("Microsoft", "XBox",
            "AMD", "Radeon");
    public static final Console2 SWITCH = new Console2("Nintendo", "Switch",
            "AMD", "Radeon");

    private String brand;
    private String model;
    private String processor;
    private String gpu;

    private Console2(String brand, String model, String processor, String gpu) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.gpu = gpu;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
}
