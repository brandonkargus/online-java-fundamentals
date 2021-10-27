package labs_examples.packages.labs.package2;

import labs_examples.packages.labs.package1.Package1Class;

public class Package2Class {


    public void privateMessage(){
        System.out.println("This is public and can be used by other packages...");

        Package1Class testing = new Package1Class();
        //testing.printTest();   //this is protected and can not be accessed from outside package1
                                //commented out, so I have no errors in IntelliJ

        Package1Class test = new Package1Class();
        test.printTest2();      //this is public in package1 and can be accessed here
    }

    public double getCubeRoot(int a){  //this is public and can be accessed by package1 class
        return Math.cbrt(a);
    }


}
