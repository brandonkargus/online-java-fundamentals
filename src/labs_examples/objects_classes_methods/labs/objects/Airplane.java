package labs_examples.objects_classes_methods.labs.objects;

class Airplane {
    private double fuelCapacity;
    private double currentFuelLevel;
    EngineSystem engine;
    Navigation navEquipment;
    Size size;
    Passengers passengers;

    public Airplane(double fuelCapacity, double currentFuelLevel, EngineSystem engine, Navigation navEquipment, Size size, Passengers passengers) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.engine = engine;
        this.navEquipment = navEquipment;
        this.size = size;
        this.passengers = passengers;
    }
    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                ", engine=" + engine +
                ", navEquipment=" + navEquipment +
                '}';
    }
}

class EngineSystem{
    private String engine;

    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    @Override
    public String toString() {
        return "EngineSystem{" +
                "engine='" + engine + '\'' +
                '}';
    }
}

class Navigation{
    String nav;

    public String getNav() {
        return nav;
    }
    public void setNav(String nav) {
        this.nav = nav;
    }
    @Override
    public String toString() {
        return "Navigation{" +
                "nav='" + nav + '\'' +
                '}';
    }
}

class Size{
    private double weight;

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Size{" +
                "weight =" + weight +
                '}';
    }
}

class Passengers{
    private int numberOfPassengers;

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
    @Override
    public String toString() {
        return "Passengers{" +
                "numberOfPassengers =" + numberOfPassengers +
                '}';
    }
}

class Tester{
    public static void main(String[] args) {
    EngineSystem singleProp = new EngineSystem();
    Navigation level3Nav = new Navigation();
    Size smallPlane = new Size();
    Passengers seating = new Passengers();



    seating.setNumberOfPassengers(8);
    smallPlane.setWeight(350);
    level3Nav.setNav("level 3 with, advanced GPS");
    singleProp.setEngine("single propeller, 4 feet long");

        System.out.println(seating.toString());
        System.out.println(smallPlane.toString());
        System.out.println(singleProp.toString());

        Airplane cessna = new Airplane(200, 125, singleProp, level3Nav, smallPlane, seating);
        System.out.println(cessna.toString());              //unsure why only 4 fields of constructor are printing, should be six

        EngineSystem twinJet = new EngineSystem();
        twinJet.setEngine("Twin Turbine Engine");
        Size commercialPlane = new Size();
        commercialPlane.setWeight(30000);
        Passengers commercialSeating = new Passengers();
        commercialSeating.setNumberOfPassengers(160);


        Airplane airbus = new Airplane(2000, 1100, twinJet, level3Nav, commercialPlane, commercialSeating);
        System.out.println(airbus.toString());             //only 4 fields of constructor are printing

        System.out.println(commercialPlane.toString());
        System.out.println(commercialSeating.toString());


    }
}
