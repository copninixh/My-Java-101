import java.lang.String;
public class StringMethod {
    public static void main(String[] args) {
        
        String wordOfDay = new String("computational");
        String wordOfDay2 = new String("computationals");
        System.out.println(wordOfDay.indexOf("t"));
        System.out.println(wordOfDay.substring(2, 6)); //like text[0:-1] in python
        System.out.println(wordOfDay.length());
        System.out.println(wordOfDay.equals(wordOfDay2)); // word count between two wrods are equal?
        System.err.println(wordOfDay.compareTo(wordOfDay2));
        System.out.println(wordOfDay.substring(2));
    }
}
