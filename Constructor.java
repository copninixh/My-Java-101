// Constuctors are used to intialzie the attributes for an object.
/*
 We can compare the structure of instance with a car blue print
 1. Class = Blueprint 
    Attributes : Colors and Mileage
    Behaviours : Chage color and drive
 2. Object = are instance of classes. (same a blueprint but that can change requirements)
 3. For example
        public Person(String nm, int ag, boolean ad){
        
        }
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
        Constructor myCar = new Constructor("Range Lover", true, "CEO");
        System.out.println(myCar.make);
    }
    
}

