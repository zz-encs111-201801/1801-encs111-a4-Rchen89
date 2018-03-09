package q01_setUtils;

import java.util.*;


public class SetUtils {

    public static Set<String> union(Set<String> s1, Set<String> s2) {
        Set<String> unionSet = new HashSet<>();
        for (String s: s1){
            unionSet.add(s);
        }
        for (String s: s2){
            unionSet.add(s);
        }

        return unionSet;
    }

    public static Set<String> intersect(Set<String> s1, Set<String> s2) {

        Set<String> intersectSet = new HashSet<>();
        for(String s: s1){
            if (s2.contains(s)){
                intersectSet.add(s);
            }
        }
        return intersectSet;
    }

    public static Set<String> subtract(Set<String> s1, Set<String> s2) {

        Set<String> subtractSet = new HashSet<>();
        for(String s: s1){
            if(!s2.contains(s)){
                subtractSet.add(s);
            }
        }
        return subtractSet;
    }

    public static String describe(Set<String> s) {
        List list = Arrays.asList(s.toArray());
        list.sort((o1, o2) -> {
            int i1 = Integer.parseInt((String) o1);
            int i2 = Integer.parseInt((String) o2);
            return i1 - i2;
        });
        return list.toString();
    }
}
