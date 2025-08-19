public class MyThread extends  Thread{
    @Override
    public void run(){
        System.out.println("Running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread ti = new MyThread();
        System.out.println(ti.getState());
        ti.start();
        System.out.println(ti.getState());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(ti.getState());
        ti.join();
        System.out.println(ti.getState());
    }
}
