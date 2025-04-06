package de.tadris.fitness.util.gpx;

public class BaseMetadata {

    private String name;
    private String desc;

    public BaseMetadata() {
    }

    public BaseMetadata(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
