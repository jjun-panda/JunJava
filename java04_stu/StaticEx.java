package java04_stu;
class Account {
    String name;
    int money;
    static int total;
    static int count;

    public Account(String name, int money) {
        this.name = name;
        this.money  = money;
        total += money;
        count++;
    }

}
public class StaticEx {
    public static void main(String[] args) {
        Account kim = new Account("김길동", 32000);
        Account park = new Account("박길동", 2000);
        Account lee = new Account("이길동", 5000);
        Account choi = new Account("최길동", 15000);

        System.out.println("total = " + Account.total);
        System.out.println("count = " + Account.count);

        park.count = 10;
        System.out.println("kim.count = " + kim.count);
        System.out.println("park.count = " + park.count);
        System.out.println("lee.count = " + lee.count);
        System.out.println("lee.count = " + choi.count);
    }
}
