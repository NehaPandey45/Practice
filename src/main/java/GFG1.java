// Java program to implement
// the above approach

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

class GFG1 {

    private static int minCounterCalculatorAccToFrequency(char[] str, int N) {
        HashMap<Character, Integer> map = new HashMap<>();
        // this priorityQueue will save the frequency of each distinct character such that largest frequency is always present at the top
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((x, y) -> Integer.compare(y, x));

        // The below code will save min count of characters required to be deleted in order to make frequency of each character unique
        IntStream.range(0, N).forEachOrdered(i -> {
            if (map.containsKey(str[i])) map.put(str[i], map.get(str[i]) + 1);
            else map.put(str[i], 1);
        });

        map.forEach((key, value) -> {
            priorityQueue.add(value);
        });

        int charCounter = 0;
        while (!priorityQueue.isEmpty()) {
            /* Save the topmost element of priorityQueue */
            int frequencyOfChar = priorityQueue.peek();

            /* Pop the topmost element */
            priorityQueue.remove();

            if (priorityQueue.isEmpty()) {
                return charCounter;
            }

            if (frequencyOfChar == priorityQueue.peek()) {
                /* If frequency of topmost element is > 1 then insert decremented value of frequencyOfChar */
                if (frequencyOfChar > 1)
                    priorityQueue.add(frequencyOfChar - 1);
                charCounter++;
            }
        }

        return charCounter;
    }


    public static void main(String[] args) {
        String str = "aaaabbbb";
        int N = str.length();
        System.out.print(minCounterCalculatorAccToFrequency(
                str.toCharArray(), N));
    }
}