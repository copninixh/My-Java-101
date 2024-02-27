/*
    Some imperative informations
    If you determine a code like this, It just order a memory without actions.
        Lamp lamp3;
    In addition, If you add this function, You will get an error called NullPointerException error.
        lamp3.turnOn();
    Because it's dosen't know how to turn on and They never actually told it to be a lamp (= new Lamp();)
*/
public class MethodIII {
    private boolean isOn;
    public void turnOn(){
        isOn = true;
        System.out.println("The lamp is on.");
    }
    public void turnOff(){
        isOn = false;
        System.out.println("The lamp is off");
    }
    public static void main(String[] args){
        MethodIII lamp1 = new MethodIII(); // create a lamp object 
        lamp1.turnOn(); // set On mode by followed with turnOn() Method
        MethodIII lamp2 = new MethodIII();
        lamp2.turnOn();
        lamp1.turnOff();
    }
}
