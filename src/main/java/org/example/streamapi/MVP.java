package org.example.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MVP {

    /*
        Convert a List<String> to an object stream and for each element -> System,out.println.
     */

    public void printNames(List<String> names) {
        // Implement me :)
        names.stream().forEach(p -> System.out.println(p));
    }

    /*
        Given a List<Integers>, return a List<Integer> with event numbers.
     */
    public List<Integer> returnEvenNumbers(List<Integer> numbers) {



        return numbers.stream().filter(p -> p%2==0).toList();
    }

    /*
        Given an int [], double the value of each int and return an int [].
    */
    public int[] doubleInts(int[] numbers) {




        // Implement me :)
        return Arrays.stream(numbers).map(n -> n*=2).toArray();
    }

    /*
        Given a String, return a List<String>, all caps.
     */
    public List<String> splitToAllCapsList(String input) {



        Stream<String> stringStream = input.toUpperCase().codePoints().mapToObj(c -> String.valueOf((char) c));




        return stringStream.toList();
    }

    /*
    Given a list of animals:
     - filter the ones that start with a given letter
     - return sorted List<String>, all caps.
    */
    public List<String> filterByFirstLetterAndOrder(List<String> list, String letter) {

        List<String> sortedList = list.stream().filter(animal -> animal.startsWith(letter)).toList();


        return sortedList.stream().map(v -> v.toUpperCase()).toList();
    }

    /*
        Given a list of words, return elements that:
         - are shorter than the given number and
         - start with a given letter.
    */
    public List<String> filterWords(List<String> words, int maxLength, String firstLetter) {

        List<String> wordListShorter= words.stream().filter(word-> word.length()<maxLength).toList();

        return wordListShorter.stream().filter(word -> word.startsWith(firstLetter)).toList();
    }
}