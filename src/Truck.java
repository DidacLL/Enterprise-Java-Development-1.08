public class Truck extends Car{
    private int towingCapacity;
    public Truck(String vinNumber, String make, String model, int mileage,int towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity=towingCapacity;
    }
}
