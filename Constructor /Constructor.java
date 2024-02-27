// Constuctors are used to intialzie the attributes for an object.

/*
 We can compare the structure of instance with a car blue print
    1. Class = Blueprint 
        Attributes : Colors and Mileage
        Behaviours : Chage color and drive
    2. Object = are instance of classes. (same a blueprint but that can change requirements)
    3. For example
        public Person(String nm, int ag, boolean ad){
            name = nm;
            age = ag;
            isAdult = ad;
        }
    4. Overloading Constructors
        We cna have more than one constructor for an object. This is called overloading.
    5. A no-argument constructor
        That has no parameters and sets the instance variables for the object to default values.
 */

public class Constructor {
    private String make;
    private boolean isSports;
    private String owener;
    
    public Constructor(String mk, Boolean sports, String own){
        make = mk;
        isSports = sports;
        owener = own;
    }

    public static void main(String[] args){
        Constructor myCar = new Constructor("Range Lover", true, "CEO"); //actual parameters
        System.out.println(myCar.make); //If you want to display value of actural parameter, You should follow with .(variable)
    }
    
}

