package java08_stu;

// Thread를 상속 받으면 쓰레드 클래스가 된다.
public class Ch13Ex01 extends Thread {
    // run() 메소드를 재정의하고 strat()로 실행
    @Override
    public void run() {
        for(int i = 0; i <10; i++) {
            System.out.println(Thread.currentThread());
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Ch13Ex01();
        thread.start();
        
        for(int i = 0; i <10; i++) {
            System.out.println(Thread.currentThread());
            Thread.sleep(100);
        }
    }
}
