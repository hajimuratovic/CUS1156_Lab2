/*
 * Project: Cus1156_Lab2
 * Class: UniqueWords.java
 * Author: Haji Muratovic
 * Date: February 26, 2026
 * This program counts the number of 
 */

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueWords
{
   /**
        counts the number of unique strings in a list
        @param list ArrayList of strings to be examined
        @return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
      return new HashSet<>(list).size();
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
      words.add("orange");
      words.add("blackboard");
      words.add("apple");
      words.add("orange");
      words.add("sun");
      words.add("moon");

      int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}