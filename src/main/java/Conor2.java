package com;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public  class Conor2 {

    public static void main(String[] args) throws Exception {
        Conor2 s= new Conor2();

        s.solution(new int[]{1,2,3,4});
    }
    public String[] solution(int[] A) throws Exception {
        // write your code in Java SE 8
        if (A.length < 3 && A.length > 10) {
            throw new Exception("invalid vector");
        }
        HashSet<Integer> set = new HashSet();
        for (int i : A) {
            if (i < 0 && i > 9) {
                throw new Exception("invalid vector");
            }
            if (set.contains(i)) {
                throw new Exception("invalid vector");
            } else {
                set.add(i);
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            int k = 2;
            int j = 1;

            while (k < A.length && j < A.length) {

                String s = "" + A[i] + A[j] + A[k];

                list.add(s);

                k++;

            }


        }
        String[] array = list.stream().toArray(String[]::new);
        return array;

    }

}
