package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Destination {
    private String name;
    private String activities;
    private String partOfCountry;
    private String description;


    public Destination(String name, String activities, String partOfCountry, String description) {
        this.name = name;
        this.activities = activities;
        this.partOfCountry = partOfCountry;
        this.description = description;

    }

    public String getActivities() {
        return activities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPartOfCountry() {
        return partOfCountry;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "name='" + name + '\'' +
                ", activities='" + activities + '\'' +
                ", partOfCountry='" + partOfCountry + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
