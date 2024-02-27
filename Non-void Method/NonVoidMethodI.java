/*
    In Python Programing we have
        def function_name(a,b):
            c = a+b
            return c
    However, these ways can do it on Java.
*/

// We use the old function from previous chapter (MethodParameter) for implementing methods.
public class NonVoidMethodI {
    public double calcAverage(int num1, double num2){ // look like a def function in python programing.
        double average = (num1 + num2) / 2;
        return average;
    }

    public double calcAverage(int num1, int num2, double num3){ // look like a def function in python programing.
        //added these function (void -> double)
        double average = (num1 + num2) / 2;
        return average; // system.out.println("text") -> return variable
    }

    public static void main(String[] args){
        NonVoidMethodI newAverage = new NonVoidMethodI();
        System.out.println("The average is " + newAverage.calcAverage(20, 15.4));  // that is changed from newAverage.calcAverage(20, 15.4);
    }
}
