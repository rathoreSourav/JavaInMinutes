package org.example.tricks;

import java.util.HashSet;
import java.util.Hashtable;

public class StaticClass {

    static class Inner{
        private int x = 8;

        @Override
        public String toString() {
            return "Inner{" +
                    "x=" + x +
                    '}';
        }
    }

    public static void main(String[] args) {
        StaticClass.Inner n = new StaticClass.Inner();
        System.out.println(n.toString());

        HashSet<Integer> hs = new HashSet<>();
        hs.add(null);
        hs.add(null);

        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, null);
        System.out.println(hs);
        System.out.println(ht);
    }
}
