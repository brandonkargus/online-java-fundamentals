package labs_examples.objects_classes_methods.labs.oop.D_my_oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoWeeksInThailand {

    public static String getTransport(int i) {
        switch (i) {
            case 1:
                return "BUS and/or BOAT";
            case 2:
                return "TRAIN and/or BOAT";
            default:
                return "PLANE";
        }
    }
    public static String getBudget(int i) {
        switch (i) {
            case 1:
                return "$400-600 ($) : ~$29-$42/day";
            case 2:
                return "$601-800 ($$) : ~$43-$57/day";
            default:
                return "$801+ ($$$) : ~$58+/day";
        }
    }
    public static String getAccommodation(int i) {
        String[] accoms = new String[]{"BACKPACKER HOSTELS", "GUESTHOUSES", "MID-RANGE HOTELS"};
        switch(i) {
            case 1 : return accoms[0];
            case 2 : return accoms[1];
            default: return accoms[2];
        }

    }
    public static void clientCreator() {
        Scanner scanner = new Scanner(System.in);
        Destination bangkok = new Destination("BANGKOK", "TEMPLES, ART & MUSEUMS, STREET FOOD", "SOUTHERN", "THE BUSTLING AND LIVELY CAPITAL CITY.");
        Destination chiangMai = new Destination("CHIANG MAI", "ELEPHANT SANCTUARY, RIVER RAFTING, FOREST HIKING", "NORTHERN", "THE SERENE AND GORGEOUS CITY IN HILL COUNTRY.");
        Destination kohPhangan = new Destination("KOH PHANGAN", "SNORKELING, BEACH BUMMING, JUNGLE RAVE PARTY", "SOUTHERN ISLANDS", "THE TROPICAL ISLAND PARADISE, IN THE GULF OF THAILAND.");
        Destination ayutthaya = new Destination("AYUTTHAYA", "ANCIENT RUINS, MONKEY WATCHING, HISTORY TOUR", "CENTRAL", "THE HISTORIC CAPITAL CITY, DATING BACK TO 1350 A.D.");
        Destination pai = new Destination("PAI", "CANYON HIKING, ARTISAN MARKET, SCOOTER RENTALS", "NORTHERNMOST", "THE SLEEPY BOHEMIAN TOWN, NESTLED NEAR THE BORDER WITH MYANMAR.");

        ArrayList<Destination> destinations = new ArrayList<>();
        destinations.add(bangkok);
        destinations.add(chiangMai);
        destinations.add(kohPhangan);
        destinations.add(ayutthaya);
        destinations.add(pai);

        System.out.println("Welcome to Two Weeks In Thailand!");
        System.out.println("---------------------------------");
        System.out.println("Please enter your name and details....");
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("---------------------------------");
        System.out.println("Email:");
        String email = scanner.nextLine();
        System.out.println("---------------------------------");
        System.out.println("Please select 3 activity sets you're interested in....");
        System.out.println("Enter a number");
        System.out.println("1. " + destinations.get(0).getActivities());
        System.out.println("2. " + destinations.get(1).getActivities());
        System.out.println("3. " + destinations.get(2).getActivities());
        System.out.println("4. " + destinations.get(3).getActivities());
        System.out.println("5. " + destinations.get(4).getActivities());

        int firstChoice = scanner.nextInt();
        while (firstChoice < 1 || firstChoice > 5) {
            System.out.println("Invalid entry, please enter a choice from the list..");
            firstChoice = scanner.nextInt();
        }
        System.out.println("Please add your second activity set....");
        int secondChoice = scanner.nextInt();
        while (secondChoice < 1 || secondChoice > 5) {
            System.out.println("Invalid entry, please enter a choice from the list..");
            secondChoice = scanner.nextInt();
        }
        while (secondChoice == firstChoice) {
            System.out.println("Activity set already selected, please enter another activity set...");
            secondChoice = scanner.nextInt();
       }
        System.out.println("Please add your third activity set....");
        int thirdChoice = scanner.nextInt();
        while (thirdChoice < 1 || thirdChoice > 5) {
            System.out.println("Invalid entry, please enter a choice from the list..");
            thirdChoice = scanner.nextInt();
        }
        while (thirdChoice == secondChoice || thirdChoice == firstChoice) {
            System.out.println("Activity set already selected, please enter another activity set...");
            thirdChoice = scanner.nextInt();
        }
        System.out.println("---------------------------------");
        String[] choices = new String[3];
        System.out.println("You've selected....");


        switch (firstChoice) {
            case 1:
                choices[0] = destinations.get(0).getActivities();
                break;
            case 2:
                choices[0] = destinations.get(1).getActivities();
                break;
            case 3:
                choices[0] = destinations.get(2).getActivities();
                break;
            case 4:
                choices[0] = destinations.get(3).getActivities();
                break;
            default:
                choices[0] = destinations.get(4).getActivities();

        }
        switch (secondChoice) {
            case 1:
                choices[1] = destinations.get(0).getActivities();
                break;
            case 2:
                choices[1] = destinations.get(1).getActivities();
                break;
            case 3:
                choices[1] = destinations.get(2).getActivities();
                break;
            case 4:
                choices[1] = destinations.get(3).getActivities();
                break;
            default:
                choices[1] = destinations.get(4).getActivities();

        }
        switch (thirdChoice) {
            case 1:
                choices[2] = destinations.get(0).getActivities();
                break;
            case 2:
                choices[2] = destinations.get(1).getActivities();
                break;
            case 3:
                choices[2] = destinations.get(2).getActivities();
                break;
            case 4:
                choices[2] = destinations.get(3).getActivities();
                break;
            default:
                choices[2] = destinations.get(4).getActivities();

        }
        System.out.println(choices[0]);
        System.out.println(choices[1]);
        System.out.println(choices[2]);
        System.out.println("--------------------------------");
        System.out.println("Please select your budget (in USD, not including arrival/departure airfare)......");
        System.out.println("1." + getBudget(1));
        System.out.println("2." + getBudget(2));
        System.out.println("3." + getBudget(3));
        int budget = scanner.nextInt();
        while (budget < 1 || budget > 3) {
            System.out.println("Invalid entry, please select a budget from 1-3....");
            budget = scanner.nextInt();
        }

        System.out.println("-----------------------------");
        System.out.println("Based on your budget, the best transportation method for you is... " + getTransport(budget));
        System.out.println("Your accommodation will be..." + getAccommodation(budget));
        System.out.println("-----------------------------");
        Client client = new Client(name, email, budget, choices);
        System.out.println("Your profile has been created with the following information.....");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Activities: " + Arrays.toString(choices));
        System.out.println("Budget: " + getBudget(budget));
        System.out.println("_______________________________");
        System.out.println("Your adventure will begin with a flight in to....");

        for (Destination d : destinations) {
            if (d.getActivities().contains(choices[0])) {
                System.out.println(d.getName() + ", " + d.getDescription() + "  Located in the " + d.getPartOfCountry() + " part of the country.  You will spend 5 days* there enjoying, " + d.getActivities() + ".");
            }
        }

        System.out.println("*************");
        System.out.println("After that, you will take a " + getTransport(budget) + " to....");

        for (Destination d : destinations) {
            if (d.getActivities().contains(choices[1])) {
                System.out.println(d.getName() + ", " + d.getDescription() + "  Located in the " + d.getPartOfCountry() + " part of the country.  You will spend 5 days* there enjoying, " + d.getActivities() + ".");
            }
        }

        System.out.println("***************");
        System.out.println("You will then whisk away on a " + getTransport(budget) + " to....");

        for (Destination d : destinations) {
            if (d.getActivities().contains(choices[2])) {
                System.out.println(d.getName() + ", " + d.getDescription() + "  Located in the " + d.getPartOfCountry() + " part of the country.  You will spend 5 days* there enjoying, " + d.getActivities() + ".");
            }
        }

        System.out.println("******************");
        System.out.println("You will then fly home, having experienced a taste of what Thailand has to offer!");
        System.out.println("* all length of stay at destinations include travel time to/from");


    }

    public static void main(String[] args) {

        clientCreator();

    }
}
