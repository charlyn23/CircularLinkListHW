import java.util.Arrays;

/**
 * Created by charlynbuchanan on 11/4/15.
 */
public class Anagrams {

    public static boolean anagrammer(String one, String two) {
        char [] charsOne = one.toCharArray();
        Arrays.sort(charsOne);
        String sortedOne = new String(charsOne);

        char [] charsTwo = two.toCharArray();
        Arrays.sort(charsTwo);
        String sortedTwo = new String(charsTwo);

        if (sortedOne.equals(sortedTwo)){
            System.out.println(one + " is an anagram of " + two);
            return true;
        }
        else {
            System.out.println(one + " and " + two + " aren't anagrams.");
            return false;
        }
    }



    public static void main(String[] args)
    {

        System.out.println(anagrammer("cat", "mou"));
//
//        String one = "cat";
//        String two = "act";
//
//        char [] charsOne = one.toCharArray();
//        Arrays.sort(charsOne);
//        String sortedOne = new String(charsOne);
//        System.out.println(sortedOne);
//
//        char [] charsTwo = two.toCharArray();
//        Arrays.sort(charsTwo);
//        String sortedTwo = new String(charsTwo);
//
//        if (sortedOne.equals(sortedTwo)){
//            System.out.println(one + " is an anagram of " + two);
//        }
//        else {
//            System.out.println(one + " and " + two + " aren't anagrams.");
//        }


    }







}
