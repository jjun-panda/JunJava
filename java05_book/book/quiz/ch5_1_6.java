package java05_book.book.quiz;
class TV {
    private int size;
    public TV(int n) {size = n;}
}
class colorTV extends TV {
    private int colors;
    public colorTV(int colors, int size) {
        super(size);
        this.colors = colors;
    }
}