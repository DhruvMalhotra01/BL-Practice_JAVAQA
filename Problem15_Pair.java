class Pair<K, V> {

    private K key;
    private V value;


    Pair(K key, V value) {

        this.key = key;
        this.value = value;
    }


    K getKey() {

        return key;
    }


    V getValue() {

        return value;
    }
}


public class Problem15_Pair {

    public static void main(String[] args) {

        Pair<String, Integer> pair =
                new Pair<>("Age", 25);


        System.out.println(
                "Key: " + pair.getKey()
                + ", Value: " + pair.getValue()
        );
    }
}