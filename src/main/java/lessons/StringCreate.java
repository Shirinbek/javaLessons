package lessons;

public class StringCreate {
    public static void main(String[] args) {

        String s = "ex1";
        String[] numbers = {"one", "2", "III"};
        String str = new String();
        charArt();
        compareTo();
        concat();
        contains();
        copyValueOf();
        equals();
        indexOf();
        isEmpty();
        isBlank();
        join();


    }

    public static void charArt(){

        char mayChar = "abc".charAt(2);
        System.out.println(mayChar);
    }

    public static void compareTo() {

        String testString = "aaa";
        String testString2 = "zzz";
        int i = testString.compareTo(testString2);
        System.out.println(i);
    }

    public static void concat() {

        String testString = "aaa";
        String testString2 = "zzz";
        String concat = testString.concat(testString2);
         System.out.println(concat);
    }

    public static void contains() {

        boolean b = "abc".contains("a");
        System.out.println(b);

    }

    public static void copyValueOf() {

        char[] textArray = {'f', ' ', '3', 'h', 'o'};
        String newString = String.copyValueOf(textArray, 1,3);
        System.out.println(newString);
    }

    public static void equals() {

        boolean b = "abs".equals("ABC");
        System.out.println(b);
    }

    public static void indexOf() {

        int i = "abc".indexOf('c');
        System.out.println(i);
    }

    public static void isEmpty() {

        boolean b1 = "abc".isEmpty();
        boolean b2 = "     ".isEmpty();
        boolean b3 = "".isEmpty();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }

    public static void isBlank() {

        boolean b1 = "abc".isBlank();
        boolean b2 = "     ".isBlank();
        boolean b3 = "".isBlank();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }

    public static void join() {

        String testString = "aaa";
        String testString2 = "zzz";
        String testString3 = null;
        String testString4 = "   ";
        String join = String.join(testString, testString3, testString4, testString2);
        System.out.println(join);
    }


}
