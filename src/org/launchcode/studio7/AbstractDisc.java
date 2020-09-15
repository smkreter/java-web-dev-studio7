package org.launchcode.studio7;

public class AbstractDisc {
    private String name;
    private String contents;
    private double capacity;
    private String discType;
    public String getName() {
        return name;
    }
    public String getContents() {
        return contents;
    }
    public String setContents(String newContents) {
        this.contents = newContents;
    }
    public double getCapacity() {
        return capacity;
    }
    public String getDiscType(){
        return discType;
    }

    public AbstractDisc(String name, String contents, double capacity, String discType) {
        this.name = name;
        this.contents = contents;
        this.capacity = capacity;
        this.discType = discType;
    }
}
