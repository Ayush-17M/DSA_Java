package L57_HashMap;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.HashSet;

class MapUsingHash {
    private Entity[] entities;
    public MapUsingHash() {
        entities = new Entity[100];
    }

    public void put(String key, String value){
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value);
    }

    public String get(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
            entities[hash] = null;
        }
    }

    private class Entity{
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}

public class Main {
    static void main() {
        MapUsingHash map = new MapUsingHash();
        map.put("Mango", "King of fruits");
        map.put("Apple", "A sweet red fruit");
        map.put("Litchi", "Ayush fev fruit");

        System.out.println(map.get("Apple"));

//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("Ayush", 95);
//        map.put("Rohan", 85);
//        map.put("Rohit", 75);
//
//        System.out.println(map.get("Ayush"));
//        System.out.println(map.get("Rohit"));
////        System.out.println(map.getOrDefault("Kunal", 64));
//        System.out.println(map.containsKey("Ayush"));
//
//        HashSet<Integer> set = new HashSet<>(); // No duplicate
//        set.add(5);
//        set.add(79);
//        set.add(5);
//        set.add(79);
//        set.add(5);
//        set.add(79);
//
//        System.out.println(set);
    }
}
