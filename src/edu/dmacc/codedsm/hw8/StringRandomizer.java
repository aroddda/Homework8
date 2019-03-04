package edu.dmacc.codedsm.hw8;

public class StringRandomizer {

    public static void main(String[] args) {
    }
        public static boolean containsNumbers(String input) {

            char[]vawols= {'A', 'E', 'I', 'O', 'U'};
            char[] chars = input.toCharArray();
            for (int i = 0; i < 5; i++) {
                if (Character.isDigit(chars[i])) {
                    return true;
                }
            }
            return false;
        }


    }




