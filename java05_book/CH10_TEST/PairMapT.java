package java05_book.CH10_TEST;

abstract class PairMapT {
    protected String keys[];
    protected String values[];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
    
}
