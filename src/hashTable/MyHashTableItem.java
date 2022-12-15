package hashTable;

public class MyHashTableItem {
    public Key key;
    public Double value;
    MyHashTableItem next;
    MyHashTableItem previous;

    public MyHashTableItem(Key key, Double value, MyHashTableItem next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}
