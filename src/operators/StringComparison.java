package operators;

public class StringComparison {
    public static void main(String[] args) {
        stringComparison("Hello", "Hello");
        stringComparison("Hello", "World");
        stringComparison("OpenAI", new String("OpenAI"));
    }

    public static void stringComparison(String str1, String str2) {
        // Using == to compare references
        boolean isEqualReference = (str1 == str2);

        // Using != to compare references
        boolean isNotEqualReference = (str1 != str2);

        // Using equals() for content comparison
        boolean isEqualContent = str1.equals(str2);

        // Using compareTo() for lexicographic comparison

        // Printing the results
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("== (Reference Comparison): " + isEqualReference);
        System.out.println("!= (Reference Comparison): " + isNotEqualReference);
        System.out.println("equals() (Content Comparison): " + isEqualContent);
        System.out.println();
    }
}

