package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Food {
    protected String ingredients;
    protected String mealTime;

    public Food(String ingredients, String mealTime) {
        this.ingredients = ingredients;
        this.mealTime = mealTime;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getMealTime() {
        return mealTime;
    }

    public void setMealTime(String mealTime) {
        this.mealTime = mealTime;
    }

    public void timeToEat(){
        System.out.println("Time to eat a random food");
    }
    public void mealServings(){
        System.out.println("no specific meal made, portion will vary");
    }
}
class ThaiFood extends Food{
    private int heatLevel;

    public ThaiFood(String ingredients, String mealTime, int heatLevel) {
        super(ingredients, mealTime);
        this.heatLevel = heatLevel;
    }

    public int getHeatLevel() {
        return heatLevel;
    }

    public void setHeatLevel(int heatLevel) {
        this.heatLevel = heatLevel;
    }
    @Override
    public void timeToEat(){
        System.out.println("Time to eat some THAI food!!!!");
    }
}
class SomTam extends ThaiFood{
    private String specialAdditions;
    private int serving;

    public SomTam(String ingredients, String mealTime, int heatLevel, String specialAdditions, int serving) {
        super(ingredients, mealTime, heatLevel);
        this.specialAdditions = specialAdditions;
        this.serving = serving;
    }

    public String getSpecialAdditions() {
        return specialAdditions;
    }

    public void setSpecialAdditions(String specialAdditions) {
        this.specialAdditions = specialAdditions;
    }

    public int getServing() {
        return serving;
    }

    public void setServing(int serving) {
        this.serving = serving;
    }
    @Override
    public void mealServings(){
        System.out.println("We're having SomTam  \"Papaya Salad\", this meal will serve 4!");
    }
}
class SalvadorianFood extends Food{
    private boolean withCarne;

    public SalvadorianFood(String ingredients, String mealTime, boolean withCarne) {
        super(ingredients, mealTime);
        this.withCarne = withCarne;
    }

    public boolean isWithCarne() {
        return withCarne;
    }

    public void setWithCarne(boolean withCarne) {
        this.withCarne = withCarne;
    }
    @Override
    public void timeToEat(){
        System.out.println("Time to eat some SALVADORIAN food!");
    }
}
class Pupusa extends SalvadorianFood{
    private int count;
    public Pupusa(String ingredients, String mealTime, boolean withCarne, int count) {
        super(ingredients, mealTime, withCarne);
        this.count = count;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    @Override
    public void mealServings(){
        System.out.println("We ordered a lot of pupusas, we can serve 10!");
    }

}
class ControllerClass{
    public static void main(String[] args) {

        //created a randomfood, and printed mealServings() and timeToEat(), the original methods are printed
        Food randomfood = new Food("apples, squid", "dinner");
        randomfood.mealServings();
        randomfood.timeToEat();
        System.out.println("---------------------------------------------------------------------");
        //created a Thai food, timetoEat() method has been overridden
        ThaiFood porkAndRice = new ThaiFood("pork, rice, vegetables", "dinner", 5);

        porkAndRice.mealServings(); // this stays the same because this method has not yet been overridden
        porkAndRice.timeToEat();    //this prints overridden method
        System.out.println("---------------------------------------------------------------------");
       SomTam plate1 = new SomTam("papaya, tomatoes, fish sauce, palm sugar, cabbage, peanuts, crab", "lunch", 3, "hot peppers", 4);
       Pupusa plate2 = new Pupusa("rice flour", "dinner", true, 20);


        plate1.mealServings();  //all overridden methods used
        plate1.timeToEat();

        plate2.mealServings();
        plate2.timeToEat();
        System.out.println("-----------------------------------------------------------------------");
        //setting a value inherited from the parent class "mealTime", from the subclass "plate2"
        plate2.setMealTime("lunch");
        System.out.println(plate2.getMealTime()); //value has successfully changed from "dinner" to "lunch


    }
}
