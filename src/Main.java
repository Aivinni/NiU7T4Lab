import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("this", "is", "not", "a", "trivial", "task", "right?"));
//        ArrayListAlgorithms.insertAfterI(stringList, "bob");
//        System.out.println(stringList);
//        ArrayList<String> stringList2 = new ArrayList<String>(Arrays.asList("this", "is", "not", "a", "trivial", "task", "right?"));
//        ArrayListAlgorithms.insertAfterI(stringList2, "hi");
//        System.out.println(stringList2);
//        ArrayList<String> stringList3 = new ArrayList<String>(Arrays.asList("hi", "lie", "is", "tis"));
//        ArrayListAlgorithms.insertAfterI(stringList3, "mild");
//        System.out.println(stringList3);
//        ArrayList<String> stringList4 = new ArrayList<String>(Arrays.asList("the", "best", "not", "ever", "seen"));
//        ArrayListAlgorithms.insertAfterI(stringList4, "pie");
//        System.out.println(stringList4);

//        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("the", "not", "skim", "pat", "a", "rat", "cat", "sit", "truck", "par", "tar"));
//        ArrayListAlgorithms.removeThree(stringList);
//        System.out.println(stringList);
//        ArrayList<String> stringList2 = new ArrayList<String>(Arrays.asList("not", "ton", "lot", "awe", "rat", "art", "tar"));
//        ArrayListAlgorithms.removeThree(stringList2);
//        System.out.println(stringList2);
//        ArrayList<String> stringList3 = new ArrayList<String>(Arrays.asList("hi", "pint", "is", "them"));
//        ArrayListAlgorithms.removeThree(stringList3);
//        System.out.println(stringList3);

//        int[] intList = {1, 2, 3, 4, 5, 6, 7};
//        ArrayList<Integer> rev = ArrayListAlgorithms.reverseArray(intList);
//        System.out.println(rev);
//        int[] intList2 = {0, 0, 0, 1, 1, 1};
//        ArrayList<Integer> rev2 = ArrayListAlgorithms.reverseArray(intList2);
//        System.out.println(rev2);
//        System.out.println("original arrays not reversed:");
//        System.out.println(Arrays.toString(intList));
//        System.out.println(Arrays.toString(intList2));
//
//        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("hello", "my", "best", "friend", "whats", "up"));
//        ArrayListAlgorithms.duplicateUpperEnd(stringList);
//        System.out.println(stringList);

//        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("hello", "my", "best", "friend", "whats", "up"));
//        ArrayListAlgorithms.duplicateUpperEnd(stringList);
//        System.out.println(stringList);

        // String mySentence = "This is my sentence!";
        // ArrayList<String> words1 = ArrayListAlgorithms.parseSentence(mySentence);
        // System.out.println(words1);
        // String mySentence2 = "It is a lovely day outside today don't you think?";
        // ArrayList<String> words2 = ArrayListAlgorithms.parseSentence(mySentence2);
        // System.out.println(words2);
        // String mySentence3 = "Hello";
        // ArrayList<String> words3 = ArrayListAlgorithms.parseSentence(mySentence3);
        // System.out.println(words3);

        // ArrayList<String> myWordList = new ArrayList<String>(Arrays.asList("apple", "banana", "cherry", "donut", "bagel", "danish", "berry", "baguette", "soda"));
        // ArrayListAlgorithms.moveBWords(myWordList);
        // System.out.println(myWordList);

        // ArrayList<String> myWordList2 = new ArrayList<String>(Arrays.asList("apple", "cherry", "donut", "danish", "soda", "banana", "bagel",  "berry", "baguette"));
        // ArrayListAlgorithms.moveBWords(myWordList2);
        // System.out.println(myWordList2);

        // ArrayList<String> myWordList3 = new ArrayList<String>(Arrays.asList("banana", "bagel",  "berry", "baguette", "apple", "cherry", "donut", "danish", "soda"));
        // ArrayListAlgorithms.moveBWords(myWordList3);
        // System.out.println(myWordList3);

        ArrayList<Integer> intList14 = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 4, 5, 2, 2, 1, 6, 4, 4, 7, 1, 8, 4, 2));
        ArrayListAlgorithms.removeDuplicates(intList14);
        System.out.println(intList14);
        ArrayList<Integer> intList15 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 2, 1, 1, 1, 1, 3, 2, 1, 2, 2, 4, 3));
        ArrayListAlgorithms.removeDuplicates(intList15);
        System.out.println(intList15);
        ArrayList<Integer> intList16 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayListAlgorithms.removeDuplicates(intList16);
        System.out.println(intList16);

    }
}
