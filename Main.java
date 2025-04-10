// class Dancer {
//     public void act(){
//         System.out.print(" spin ");
//         doTrick();
//     }

//     public void doTrick(){
//         System.out.print(" float ");
//     }
    
// }

// class Acrobat extends Dancer {
//     public void act(){
//         super.doTrick();
//         System.out.print(" flip ");
//     }

//     public void doTrick(){
//         System.out.print(" someresult ");
//     }
    
    
   
// }

// public class Main{
//   public static void main(String[] args){
//        Dancer a = new Acrobat();
//        a.act();
//   }
// }

class Student{
    public final static int NUM_TESTS = 3;
    private String name;
    private int[] tests;
    private String grade;


    //Constructor
    public Student(){
        name = "";
        tests = new int[NUM_TESTS];
        grade = "";
    }

    public Student(String studName, int[] studTests, String studGrade){
        name = studName;
        tests = studTests;
        grade = studGrade;
    }

    //Accessors
    public String getName(){
        return name;
    }

    public String getGrade(){
        return grade;
    }

    //Mutators
    public void setGrade(String newGrade){
        grade = newGrade;
    }

    public void computeGrade(){
        if(name.equals("")){
            grade = "no grade";
        }else if (getTestAverage() >= 65){
            grade = "PASS";
        }else{
            grade = "FAIL";
        }
    }

    public double getTestAverage(){
        double total = 0;
        for(int score : tests){
            total += score;
        }
        return total/NUM_TESTS;
    }


}

class UnderGrad extends Student {
    public UnderGrad(){
        super();
    }

    public UnderGrad(String studName, int[] studTests, String studGrade){
        super(studName, studTests, studGrade);
    }
}

class GradStudent extends Student {
    private int gradID;

    public GradStudent(){
        super();
        gradID  = 0;
    }

    public GradStudent(String studName, int[] studTests, String studGrade, int gradStuID){
        super(studName, studTests, studGrade);
        gradID = gradStuID;
    }

    public int getID(){
        return gradID;
    }

    public void computeGrade(){
        super.computeGrade();
        if(getTestAverage() >= 90){
            setGrade("Pass with distintion");
        }
    }
}

public class Main{
    public static void main(String[] args){
        Student s = new Student("Brian Thomus", new int[] {90,94,99}, "none");
        Student u = new UnderGrad("Pablo Escobar", new int[] {90,94,99}, "none");
        Student g = new GradStudent("Pablo Escobar", new int[] {90,94,99}, "none", 1234);

        s.setGrade("Pass");
        s.getGrade();
        // u.getGrade();
        // g.getGrade();
    }
}