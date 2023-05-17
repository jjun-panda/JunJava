package java08_stu;

public class Ch13Ex031 implements Runnable {
    boolean flag = false;

    @Override
    public void run() {
        for(int i = 0; i <100; i++){
            System.out.println("0516의 쓰레드");
            try {
                Thread.sleep(100);
                
                synchronized(this){
                    if(flag){
                        this.wait();
                    }
                }
            } catch (InterruptedException e) {}
        }
    }

    void pause() {
        System.out.println("0516의 pause() 호출");
        flag = true;
    }

    void restart() {
        flag = false;
        synchronized(this){
            this.notifyAll();
        }
    }

    public static void main(String[] args) {
        Ch13Ex031 target = new Ch13Ex031();
        Thread tr = new Thread(target);
        tr.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main 쓰레드");
            try{
                if(i == 30) {
                    synchronized(tr) {
                        target.pause();
                    }
                }
                if(i == 50) {
                    synchronized(tr) {
                        target.restart();
                    }
                }
                Thread.sleep(100);
            } catch (InterruptedException e){}
        }
    }
}