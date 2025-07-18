package org.example;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
    }

        public static boolean checkForPalindrome(String text){

            String cleanedStr = text.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
            LinkedList<Character> charList = new LinkedList<>();

            for (char c : cleanedStr.toCharArray()) {
                charList.add(c);
            }

            while (charList.size()>1){
                if (!charList.pollFirst().equals(charList.pollLast())){
                    return false;
                }
            }

            return true;
        }


    }
    