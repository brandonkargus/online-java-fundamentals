package labs_examples.packages.labs.package1;

import labs_examples.packages.labs.package2.Package2Class;

public class Package1Class {

    protected void printTest(){        //cannot be called from Package2Class in package2
        System.out.println("This is protected, can not be accessed outside this package...");
        Package2Class cube = new Package2Class();

    }
    public void printTest2(){
        System.out.println("This is public and can be used");

        Package2Class cube = new Package2Class();
        cube.getCubeRoot(56);
    }
}
