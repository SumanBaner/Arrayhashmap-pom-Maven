import java.util.*;

public class Stringhashmap {
    //first push
    //second push

    public static void setExample() {
        Set<Integer> setInt = new HashSet<>();
        setInt.add(10);
        setInt.add(20);
        setInt.add(30);
        setInt.add(40);
        setInt.add(40);
        System.out.println("Set: " + setInt);
    }
    public static void listExample(){
        List<Integer> listInt = new ArrayList<>();
        listInt.add(10);
        listInt.add(20);
        listInt.add(30);
        listInt.add(40);
        listInt.add(20);
        System.out.println("List: " + listInt);
    }
    public static void hashMapExample() {
        Map<Character, Integer> mapObj = new HashMap<>();
        mapObj.put('a', 10);
        mapObj.put('b', 20);
        mapObj.put('c', 30);
        System.out.println("Hashmap: " + mapObj);
    }

    public static void duplicateValueInString(String str) {
        // success
        //{'s':3, 'u': 1, 'c': 2, 'e': 1}
        // ['s', 'u', 'c', 'c', 'e', 's', 's']
        HashMap<Character, Integer> hm = new HashMap<>();
        // Convert the string into char array
        char[] chArray = str.toCharArray();
        for (char c1 : chArray) {
            if (hm.containsKey(c1)) {
                hm.put(c1, hm.get(c1) + 1);
            } else {
                hm.put(c1, 1);

            }
        }

    }
}


