package HomeworksTataStrive;

import java.util.Random;
import java.util.Scanner;

//Shuffle string

class Solution {
    private String shuffleWord(String word){
        char[] characters = word.toCharArray();
        Random random = new Random();

        for(int i=characters.length-1 ;i>0 ;i--){
            int j=random.nextInt(i+1);

            char temp = characters[i];
            characters[i]=characters[j];
            characters[j]=temp;
        }
        return new String(characters);
    }

    public String shuffleLine(String line){
        String[] words = line.split(" ");
        StringBuilder shuffledLine = new StringBuilder();

        for(String word : words){
            String shuffledWord = shuffleWord(word);
            shuffledLine.append(shuffledWord).append(" ");

        }

        return shuffledLine.toString().trim();
    }
}

public class Shuffling {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);

        String t= sc.nextLine();

        Solution s1 = new Solution();

        String shuffledLine =  s1.shuffleLine(t);

        System.out.println("Oringnal String: "+ t);
        System.out.println("Shuffled Line: "+ shuffledLine);

    }
}
