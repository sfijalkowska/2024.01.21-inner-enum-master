package pl.comarch.camp.it.typy.wyliczeniowe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public enum Console {
    PS5("Sony", "PlayStation 5", "Intel", "NVidia"),
    PS4("Sony", "PalyStation 4", "Intel", "NVidia"),
    XBOX("Microsoft", "XBox", "AMD", "Radeon"),
    SWITCH("Nintendo", "Switch", "AMD", "Radeon");

    private String brand;
    private String model;
    private String processor;
    private String gpu;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProcessor() {
        return processor;
    }

    public String getGpu() {
        return gpu;
    }
}
