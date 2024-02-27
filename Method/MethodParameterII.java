public class MethodParameterII {
    public void move(int numHops){
        System.out.println("The frog moved forward " + numHops + " hops.");
    }

    public void move(){
        System.out.println("The frog moved forward 3 hops.");
    }

    public void move(String direction, int hops ){
        System.out.println("The frog moved to the " + direction);
        System.out.println(" " + hops + " hops.");
    }

    public static void main(String[] args){
        MethodParameterII frogI = new MethodParameterII();
        frogI.move();
        MethodParameterII frogII = new MethodParameterII();
        frogII.move("left" , 6);
        frogI.move(2);
    }
}
