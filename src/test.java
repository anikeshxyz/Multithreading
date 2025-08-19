public class test {

    public static void main(String[] args) {
        World ti=new World();
        ti.start();//Runnable
        System.out.println(Thread.currentThread().getName());
        for (; ;) {
            System.out.println("hello");

         }
    }
}