package entities;

import java.time.LocalDate;
import java.util.Objects;


public class Instrument implements Comparable <Instrument> {
    private String name;
    private String maker;
    private String model;
    private String description;
    private LocalDate lastCalibration;
    private LocalDate nextCalibration;

    public Instrument() {
    }

    public Instrument(String name, String maker, String model, LocalDate lastCalibration, LocalDate nextCalibration, String description) {
        this.name = name;
        this.maker = maker;
        this.model = model;
        this.lastCalibration = lastCalibration;
        this.nextCalibration = nextCalibration;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getLastCalibration() {
        return lastCalibration;
    }

    public void setLastCalibration(LocalDate lastCalibration) {
        this.lastCalibration = lastCalibration;
    }

    public LocalDate getNextCalibration() {
        return nextCalibration;
    }

    public void setNextCalibration(LocalDate nextCalibration) {
        this.nextCalibration = nextCalibration;
    }

    @Override
    public int compareTo(Instrument other) {
        return name.compareTo(other.getName());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Instrument other = (Instrument) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.maker, other.maker)) {
            return false;
        }
        return Objects.equals(this.model, other.model);
    }
    
}
