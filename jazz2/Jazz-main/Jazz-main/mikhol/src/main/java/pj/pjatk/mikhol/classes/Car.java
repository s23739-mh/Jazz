package pj.pjatk.mikhol.classes;

public class Car {

    private String name;
    private String owner;
    private int miles;

    public Car(String name, String owner, int miles) {
        this.name = name;
        this.owner = owner;
        this.miles = miles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }
}
