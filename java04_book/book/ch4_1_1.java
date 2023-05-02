package java04_book.book;

class TV {
    private String brand;
    private int year;
    private int size;
    TV(String brand, int year, int size) {
        this.brand = brand;
        this.year = year;
        this.size = size;
    }

    public void show() {
        System.out.print(brand + "에서 만든 " + year + "년형 " + size + "인치 TV");
    }
}   

public class ch4_1_1 {
    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }
}
