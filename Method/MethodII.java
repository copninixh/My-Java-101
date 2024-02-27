//Procedural Method allow represent all behaviours
/*
    Procedural programming is about writing procedures or methods that perform operations on the data, 
    while object-oriented programming is about creating objects that contain both data and methods.
*/

public class MethodII {
    public void writeLetter() {
        greeting();
        specialMessage();
        specialMessage();
        closing();
    }

    public void greeting(){
        System.out.println("Hi, friend!");
    }

    public void specialMessage(){
        System.out.println("Computer Science is awesome!");
    }

    public void closing(){
        System.out.println("See you soon");
    }

    public static void main(String[] args){
        MethodII friendLetter = new MethodII();
        friendLetter.writeLetter();
    }
}
