package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */

enum Band {
    GUITARIST("My amp is always on 11!"), BASSIST("I make your teeth rattle"), SINGER("I scream loud and proud"), DRUMMER("I AM a real musician!");

    private String myRole;                      // Exercise 2

    Band(String role){
        this.myRole = role;
    }

    public String getRole(){
        return myRole;
    }
}

class BandController {

    public static void main(String[] args) {

        Band iPlayGuitar = Band.GUITARIST;  // Exercise 1
        Band iSing = Band.SINGER;
        Band iPlayDrums = Band.DRUMMER;
        Band iPlayBass = Band.BASSIST;
        System.out.println("A 4 piece rock band usually contains a " + iPlayGuitar + ", " + iPlayBass + ", " + iSing + ", and a " + iPlayDrums); // Exercise 1

        System.out.println("The singer says...." + iSing.getRole());
        System.out.println("The guitarist says...." + iPlayGuitar.getRole());  // Exercise 2
        System.out.println("The bassist says...." + iPlayBass.getRole());
        System.out.println("The drummer says...." + iPlayDrums.getRole());
    }


}

