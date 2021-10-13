package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Motorcycles implements IEngineBehavior {
    private String manufacturer;
    private String model;
    private int ccSize;
    private String wheels;
    private int modelYear;
    private int gears;

    public Motorcycles(String manufacturer, String model, int ccSize, String wheels, int modelYear, int gears) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.ccSize = ccSize;
        this.wheels = wheels;
        this.modelYear = modelYear;
        this.gears = gears;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getCcSize() {
        return ccSize;
    }
    public void setCcSize(int ccSize) {
        this.ccSize = ccSize;
    }
    public String getWheels() {
        return wheels;
    }
    public void setWheels(String wheels) {
        this.wheels = wheels;
    }
    public int getModelYear() {
        return modelYear;
    }
    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }
    public int getGears() {
        return gears;
    }
    public void setGears(int gears) {
        this.gears = gears;
    }

    public void start(){
        System.out.println("Key is inserted, moto is taken off kickstand, light throttle twist and IT's ALIVE!!!");
    }
    public void stop(){
        System.out.println("The moto is not moving");
    }
    public boolean isRunning(){
        System.out.println("The engine is on and running smoothly");
        return true;
    }
    public void accelerate(){
        System.out.println("Throttle twisted, and the moto begins to gain speed, you shift swiftly through the gears....");
    }
    public void decelerate(){
        System.out.println("The brakes are applied and the moto begins to slow down....");
    }
    public void speed(){
        System.out.println("The moto is traveling at whatever the speed limit is......+10mph!");
    }
    public double getCI(int ccSize){ // convert cc size to cubic inch (Harley, Indian, etc.)
        return ccSize / 16.387;
    }
}
class Scooters extends Motorcycles implements IEngineBehavior{

    public Scooters(String manufacturer, String model, int ccSize, String wheels, int modelYear, int gears) {
        super(manufacturer, model, ccSize, wheels, modelYear, gears);
    }
    @Override
    public void start(){
        System.out.println("Key is inserted, scooter is taken off kickstand, light throttle twist and IT's ALIVE!!!");
    }
    @Override
    public void stop(){
        System.out.println("The scooter is not moving");
    }
    public boolean isRunning(){
        System.out.println("The engine is on and running smoothly");
        return true;
    }
    @Override
    public void accelerate(){
        System.out.println("Throttle twisted, and the scooter begins to gain speed, the automatic transmission shifts smoothly....");
    }
    @Override
    public void decelerate(){
        System.out.println("The brakes are applied and the scooter begins to slow down....");
    }
    @Override
    public void speed(){
        System.out.println("The scooter is traveling at whatever the speed limit is......-10 mph!");
    }
    public double getCI(int ccSize){
        return ccSize / 16.387;
    }
}
