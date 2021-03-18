package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Conor1 {

    public static void main(String[] args) {

        String s ="10000,100.0,100.0,100.0,10000,100.0,100.0,40.0";
        Conor1 e= new Conor1();
        e.solution(s) ;
    }
    public int[] solution(String s) {
        List<Integer> l = new ArrayList<>();

        String[] res = s.split(",");
        for (int i = 0; i < res.length; i++) {

            int student = Integer.parseInt(res[i]);
            Double g1 = Double.parseDouble(res[i + 1]);
            Double g2 = Double.parseDouble(res[i + 2]);
            Double g3 = Double.parseDouble(res[i + 3]);
            if (g1 >= 100.0 && g1 >= 100.0 && g1 >= 100.0) {

                l.add(student);
            }
            i += 3;

        }


        int[] resp = l.stream().mapToInt(r -> r)
                .toArray();
        return resp;



        // write your code in Java 11
    }
}
