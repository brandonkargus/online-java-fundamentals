package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

public class Client {
    private String name;
    private String email;
    private int budget;
    private String[] activities;

    public Client(String name, String email, int budget, String[] activities) {
        this.name = name;
        this.email = email;
        this.budget = budget;
        this.activities = activities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name = " + this.name + "\n"
                + "Email = " + this.email + "\n"
                + "Budget = " + this.budget + " (in USD)" + "\n"
                + "Activities = " + this.activities + "\n";


    }
}
