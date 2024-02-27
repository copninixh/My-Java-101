public class MethodParameterI {

    public void calcAverage(int num1, double num2){ // look like a def function in python programing.
        double average = (num1 + num2) / 2;
        System.out.println("The average is " + average);
    }

    public void calcAverage(int num1, int num2, double num3){ // look like a def function in python programing.
        double average = (num1 + num2) / 2;
        System.out.println("The average is " + average);
    }

    public static void main(String[] args){
        MethodParameterI newAverage = new MethodParameterI();
        newAverage.calcAverage(20, 15.4);
    }

}

