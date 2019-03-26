package tasks;

public class Palindrome {

    /**
     * Сheck whether the string is palindrome
     *
     * @param string
     * @return true if string is palindrome, false if no
     */
    public static boolean isPalindrome(String string) {

        char[] charArray = string.replaceAll("[^A-Za-zА-Яа-я0-9]", "").toLowerCase().toCharArray();

        int length = charArray.length;
        boolean flag = false;

        for (int i = 0; i < length; i++) {
            if (charArray[i] == charArray[length - 1]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
            length--;
        }

        System.out.println(flag);
        return flag;
    }
}
