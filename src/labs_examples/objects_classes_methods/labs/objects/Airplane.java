package labs_examples.objects_classes_methods.labs.objects;

class Airplane {
    private double fuelCapacity;
    private double currentFuelLevel;
    private EngineSystem engine;
    private Navigation navEquipment;
    private Size size;
    private Passengers passengers;

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
                ", size=" + size +
                ", passengers=" + passengers +
                '}';
    }
}

class EngineSystem{
    private String engine;

    public EngineSystem(String engine) {
        this.engine = engine;
    }

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
    private String nav;

    public Navigation(String nav) {
        this.nav = nav;
    }
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

    public Size(double weight) {
        this.weight = weight;
    }
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

    public Passengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
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
        EngineSystem singleProp = new EngineSystem("single propeller");
    Navigation level3Nav = new Navigation("Level 3 nav, with GPS");
    Size smallPlane = new Size(5000);
    Passengers smallSeating = new Passengers(6);



    smallSeating.setNumberOfPassengers(8);
    smallPlane.setWeight(4000);
    level3Nav.setNav("level 3 with, advanced GPS");
    singleProp.setEngine("single propeller, 4 feet long");

        System.out.println(smallSeating.toString());
        System.out.println(smallPlane.toString());
        System.out.println(singleProp.toString());

        Airplane cessna = new Airplane(200, 125, singleProp, level3Nav, smallPlane, smallSeating);
        System.out.println(cessna.toString());

        EngineSystem twinJet = new EngineSystem("twin turbo jet");
        twinJet.setEngine("Twin Turbine Engine");
        Size commercialPlane = new Size(30000);
        commercialPlane.setWeight(35000);
        Passengers commercialSeating = new Passengers(165);
        commercialSeating.setNumberOfPassengers(160);


        Airplane airbus = new Airplane(2000, 1100, twinJet, level3Nav, commercialPlane, commercialSeating);
        System.out.println(airbus.toString());

        System.out.println(commercialPlane.toString());
        System.out.println(commercialSeating.toString());




    }
}
