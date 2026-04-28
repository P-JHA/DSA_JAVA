package src;

public class duplicatesStrings {

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        // convert to lowercase to handle uppercase letters
        char lowerChar = Character.toLowerCase(currChar);

        if (map[lowerChar - 'a']) {
            // duplicate
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[lowerChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "Prabhakar";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}