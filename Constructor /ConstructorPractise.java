public class ConstructorPractise {
    // instance variable
    private String name; 
    private String empId;
    private int pay;

    // default display if they miss some informations in objects.
    public ConstructorPractise(){ 
        name = null;
        empId = null;
        pay = 0;
    }

    public ConstructorPractise(String nm, String id, int py){
        name = nm;
        empId = id;
        pay = py; 
    }

    public ConstructorPractise(String nm, String id){
        name = nm;
        empId = id;
        pay = 20; 
    }

    public static void main(String[] args){
        ConstructorPractise person1 = new ConstructorPractise("Simon", "7625", 600000);
        ConstructorPractise person2 = new ConstructorPractise("Zimon", "7625", 20);
        ConstructorPractise person3 = new ConstructorPractise();
        //↑variable type and constructor.  ↑variable type and constructor
        System.out.println(person1.name);
    }

}
