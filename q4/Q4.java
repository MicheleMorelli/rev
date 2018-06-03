package q4;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;


public class Q4 {

    public static void main(String[] args) {
        Map<String, Integer> d = new HashMap<>();
        d.put("Alyssa", 22);
        d.put("Char", 25);
        d.put("Dan", 25);
        d.put("Jeff", 20);
        d.put("Casey", 20);
        d.put("Kelly", 22);
        d.put("Brook", 22);
        d.put("Kim", 20);
        d.put("Morgan",25);
        d.put("Ryan", 25);
        d.put("Stef", 22);
        System.out.println(d);
        Map<String, Integer> uu = new HashMap<>();
        try {
            System.out.println(rarestAge(uu));
        }
        catch (IllegalArgumentException e){
            System.out.println("That cannot be empty!");
        }
        finally {
            System.out.println("Aborting the program...");
        }


    }

    public static int rarestAge(Map<String,Integer> d) {

        if (d == null || d.size() == 0) throw new IllegalArgumentException();
        Map<Integer, Integer> tr = new TreeMap<Integer, Integer>();


        for (String s : d.keySet()) {
            if (tr.containsKey(d.get(s))) tr.put(d.get(s), tr.get(d.get(s))+1 );
            else tr.put(d.get(s), 1);
        }

        int maxi = 99999999;
        for (Integer i : tr.keySet()) {
            if (tr.get(i) < maxi) maxi = tr.get(i);
        }
        List<Integer> l = new ArrayList<>();
        for (Integer i: tr.keySet()) {
            if (tr.get(i) == maxi) {
                l.add(i);
            }
        }
        return l.get(0);
    }
}
