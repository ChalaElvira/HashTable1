package hashTable;

public class Main {
    public static void main(String[] args) {
        MyHashTable ht = new MyHashTable(1024);
        ht.put(new Key("APPL", 223), 180.0);
        ht.put(new Key("META", 300), 160.34);
        Double metaPrice = ht.get(new Key("META", 300));
        System.out.println(metaPrice);
        Boolean isCont = ht.containsKey(new Key("META", 300));
        System.out.println(isCont);
        System.out.println(ht.size());
        Boolean isRemove = ht.remove(new Key("APPL", 223));
        System.out.println(isRemove);
        System.out.println(ht.size());
    }
}
