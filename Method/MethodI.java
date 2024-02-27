public class MethodI {
    private String name;
    private String breed;
    private int age;

    public MethodI(String nm, String br, int ag){
        name = nm;
        breed = br;
        age = ag;
    }

    public void bark(){
        System.out.println("Woof!");
    }

    public static void main(String[] args){
        MethodI graceDog = new MethodI("Grace", "lab", 1);
        graceDog.bark();
    }
}
