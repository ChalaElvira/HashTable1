package hashTable;

public class Key {
    String stock;
    int dayOfYear;

    public Key(String stock, int dayOfYear) {
        this.stock = stock;
        this.dayOfYear = dayOfYear;

    }
    int hash(){
        return dayOfYear;
    }

    boolean equals(Key other){
        return (other.stock == stock && other.dayOfYear == dayOfYear);
    }
}
