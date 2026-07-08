package L57_HashMap;

//import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashMapFinal<k, v> {
    ArrayList<LinkedList<Entity>> list;
    private int size = 0;
    private float lf = 0.5f;

    public HashMapFinal(){
        list = new ArrayList<>();
        for(int i=0; i<10; i++){
            list.add(new LinkedList<>());
        }
    }
    public void put(k key, v value){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        for(Entity entity: entities){
            if(entity.key.equals(key)) {
                entity.value = value;
                return;
            }
        }
        if((float)(size) / list.size() > lf) {
            reHash();
        }
        entities.add(new Entity(key, value));
        size++;
    }

    private void reHash(){
        System.out.println("We are now rehashing!");

        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();
        size = 0;
        for(int i=0; i<old.size() * 2; i++){
            list.add(new LinkedList<>());
        }

        for(LinkedList<Entity> entries : old){
            for(Entity entity : entries){
                put(entity.key, entity.value);
            }
        }
    }

    public v get(k key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        for(Entity entity : entities){
            if(entity.key.equals(key)){
                return entity.value;
            }
        }
        return null;
    }

    public boolean containsKey(k key){
        return get(key) != null;
    }

    @Override
    public String toString(){
        StringBuilder builkedr = new StringBuilder();
        builkedr.append("{");
        for(LinkedList<Entity> entities : list){
            for(Entity entity : entities){
                builkedr.append(entity.key);
                builkedr.append(" = ");
                builkedr.append(entity.value);
                builkedr.append(" , ");
            }
        }
        builkedr.append("}");
        return builkedr.toString();
    }

    public void remove(k key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);
        Entity target = null;

        for(Entity entity : entities){
            if(entity.key.equals(key)){
                target = entity;
                break;
            }
        }
        entities.remove(target);
        size--;
    }
    private class Entity{
        k key;
        v value;

        public Entity(k key, v value){
            this.key = key;
            this.value = value;
        }
    }
}
