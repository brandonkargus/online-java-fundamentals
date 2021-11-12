package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

class Exercise_04 {
    public synchronized void out(String message){
        System.out.println("Sending..." + message);
        try {
            Thread.sleep(700);
        } catch (Exception e) {
            System.out.println("Interruption");
        }
        System.out.println(message + " complete");
    }
}

class SyncBlockDemo extends Thread {
    private String message;
    private Thread thd;
    Exercise_04 originate;

    SyncBlockDemo(String text, Exercise_04 obj){
        this.message = text;
        this.originate = obj;

    }
    public void run() {
        originate.out(message);
    }

}
class SyncB {
    public static void main(String[] args) {
        Exercise_04 s = new Exercise_04();
        SyncBlockDemo one = new SyncBlockDemo("Me first", s);
        SyncBlockDemo two = new SyncBlockDemo("Me next", s);
        one.start();
        two.start();

        try {
            one.join();
            two.join();
        } catch (Exception e) {
            System.out.println("Interruption occurred");
        }

    }
}