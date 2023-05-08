package java04_book.book.quiz;

class TV{
    int size;
    String manufacturer;
    
    public TV() {
        this(32, "LG");
    }

    public TV(String manufacturer) {
        this(32, manufacturer);
    }

    public TV(int size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
        System.out.println(size + "인치" + manufacturer);
    }
}

public class TV_2 {
    public static void main(String[] args) {
        TV tv = new TV();              // '32인치LG' 출력
        TV tv1 = new TV("삼성");        // '32인치삼성' 출력
        TV tv2 = new TV(65, "삼성");    // '65인치삼성' 출력
    }
}