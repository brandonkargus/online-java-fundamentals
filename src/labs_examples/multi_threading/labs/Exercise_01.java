package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 * <p>
 * 1: Create an application that starts a Thread by implementing the Runnable interface
 * 2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 */

class DemoController {
    public static void main(String[] args) {

        Exercise_01 firstWay = new Exercise_01("firstWay");

        Thread secondWay = new Thread(new Exercise_01(), "secondWay");
        secondWay.start();

    }
}


public class Exercise_01 implements Runnable {
    Thread thread;

    public Exercise_01() {
        //this.thread = new Thread();
    }

    public Exercise_01(String name) {
        this.thread = new Thread(this, name);
        this.thread.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + " starting.");
        try {
            for (int count = 0; count < 10; count++) {

                Thread.sleep(600);
                System.out.println("In " + Thread.currentThread() +
                        ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(Thread.currentThread() + " interrupted.");
        }
        System.out.println(Thread.currentThread() + " terminating.");
    }

}


