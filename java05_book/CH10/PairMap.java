package java05_book.CH10;

abstract class PairMap {
    protected String keys[];
    protected String values[];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}