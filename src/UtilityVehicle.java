public class UtilityVehicle extends Car{
    boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage,boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive=fourWheelDrive;
    }
}
