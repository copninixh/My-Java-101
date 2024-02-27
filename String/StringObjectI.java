public class StringObjectI {
    public static void main(String[] args) {
        String name1 = "Kampanart Chaimooltan";
        String name2 = new String("Test");
        String name3 = new String(name1);


        /*
            the joining of data, we use + and +=  
        */

        int CopAge = 19;
        int TestAge = 18;

        String TestingName = name1 + " " + CopAge;
        name2 += TestAge;

        System.err.println(TestingName);
        System.out.println(name2);


        /*
            \" print double quote
            \\ print a blackslash s
            \n insert new line
        */
        
    }
}
