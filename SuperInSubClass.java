class Dancer {
    public void act(){
        System.out.print(" spin ");
        doTrick();
    }

    public void doTrick(){
        System.out.print(" float ");
    }
    
}

class Acrobat extends Dancer{
    public void act(){
        super.doTrick();
        System.out.print(" flip ");
    }

    public void doTrick(){
        System.out.print(" someresult ");
    }
    
    
   
}

public class Mร{
  public static void main(String[] args){
       Dancer a = new Acrobat();
       a.act();
  }
}

