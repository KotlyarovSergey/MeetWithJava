package Practice_06_1107.HW;

/**
 * Notebook
 * String vendor производитель;
 * String model модель;
 * float displaySize;
 * String cpuName;
 * int cpuCore;
 * float cpuClock;
 * int ram;
 * int hdVolume;
 * float cast;
 */
public class Notebook {
    String vendor;
    String model;
    String color;
    float displaySize;
    String cpuName;
    int cpuCore;
    float cpuClock;
    // String motherBoard;
    int ram;
    int hdVolume;
    String video;
    String os;
    float cast;

    public int getRam() {
        return this.ram;
    }

    public int getHdVolume() {
        return this.hdVolume;
    }

    public String getOs() {
        return this.os;
    }

    public String getColor() {
        return this.color;
    }

    public float getCast() {
        return this.cast;
    }

    public void setCast(float cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        // return String.format("%.1f\', %s %s %s, %s, %dx%.1fGHz, RAM %d GB, HD %d GB,
        // %s, %s",
        // displaySize, vendor, model, color, cpuName, cpuCore, cpuClock, ram, hdVolume,
        // video, os);
        return String.format("%s %s %s %.2f Р. \n%.1f\', %s, %dx%.1fГГц, RAM %d ГБ, HD %d ГБ, %s, %s",
                vendor, model, color, cast, displaySize, cpuName, cpuCore, cpuClock, ram, hdVolume, video, os);
    }
}
