public class Car {
    private String make, model, owner;
    private boolean isSportsCar;
    
    public Car(String make, String model, String owner, boolean isSportsCar) {
        this.make = make;
        this.model = model;
        this.owner = owner;
        this.isSportsCar = isSportsCar;
    }

    /*/ Get Methods /*/
    public String getMake() { return make; }
    public String getModel() { return model; }
    public String getOwner() { return owner; }
    public boolean isSportsCar() { return isSportsCar; }
    
    /*/ Set Methods /*/
    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }
    public void setOwner(String owner) { this.owner = owner; }
    public void setSportsBool(boolean isSportsCar) { this.isSportsCar = isSportsCar; }
}