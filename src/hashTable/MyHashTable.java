package hashTable;

import java.util.Arrays;

public class MyHashTable {
    final int capacity;
    int size = 0;
    MyHashTableItem[] items;

    public MyHashTable(int capacity) {
        this.capacity = capacity;
        items = new MyHashTableItem[capacity];
    }

    void put(Key key, double value) {
        size++;
        final int index = Math.abs(key.hash() % capacity);
        if (items[index] == null) {
            items[index] = new MyHashTableItem(key, value, null);
        } else {
            for (MyHashTableItem node = items[index]; node != null; node = node.next) {
                if (node.key.equals(key)) {
                    return;
                }
            }
            items[index] = new MyHashTableItem(key, value, items[index]);
        }
    }

    Double get(Key key) {
        final int index = Math.abs(key.hash() % capacity);
        Double result = null;
        for (MyHashTableItem node = items[index]; node != null; node = node.next) {
            if (node.key.equals(key)) {
                result = node.value;
                break;
            }
        }
        return result;
    }

    Boolean containsKey(Key key) {
        final int index = Math.abs(key.hash() % capacity);
        for (MyHashTableItem node = items[index]; node != null; node = node.next) {
            if (node.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    Boolean remove(Key key){
        final int index = Math.abs(key.hash() % capacity);
        MyHashTableItem previousNode = items[index];
        for (MyHashTableItem node = items[index]; node != null; node = node.next) {
            if (node.key.equals(key)) {
                previousNode.next = node.next;
                node = null;
                size--;
                return true;
            }
            previousNode = node;
        }
        return false;
    }

    int size(){
        return size;
    }
}
