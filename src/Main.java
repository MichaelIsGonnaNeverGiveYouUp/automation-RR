import java.util.*;
class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Thanks");
        strings.add("For");
        strings.add("Attempting");
        strings.add("A");
        strings.add("Randall");
        strings.add("Reilly");
        strings.add("Coding");
        strings.add("Exercise");

        System.out.println(longestString(strings));
    }

    public static String longestString(ArrayList<String> strings) {
        /*
        We need to iterate the entire list to get the longest string.
        The time complexity is O(n).
         */
        String longest = "";
        for (String s : strings) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        return longest;
    }
}