public class RunnableThreadTest1 {

    public static void main(String args[]) {

        // Create and start the first thread
        PrintNameRunnable pnt1 = new PrintNameRunnable("K");
        Thread t1 = new Thread(pnt1);
        t1.start();

        // Create and start the second thread
        PrintNameRunnable pnt2 = new PrintNameRunnable("P");
        Thread t2 = new Thread(pnt2);
        t2.start();

        // Create and start the third thread
        PrintNameRunnable pnt3 = new PrintNameRunnable("I");
        Thread t3 = new Thread(pnt3);
        t3.start();

        // Create and start the first instance of MyOwnRunnableClass
        MyOwnRunnableClass myOwnRunnable1 = new MyOwnRunnableClass();
        Thread myOwnThread1 = new Thread(myOwnRunnable1);
        myOwnThread1.start();

        // Create and start the second instance of MyOwnRunnableClass
        MyOwnRunnableClass myOwnRunnable2 = new MyOwnRunnableClass();
        Thread myOwnThread2 = new Thread(myOwnRunnable2);
        myOwnThread2.start();
    }
}


