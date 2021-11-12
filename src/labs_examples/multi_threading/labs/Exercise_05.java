package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 * <p>
 * Demonstrate the use of a wait() and notify()      (COMPLETE)  *note - Heavily influenced by an example I found at "https://java2blog.com/print-even-odd-numbers-threads-java/"
                                                                  I modeled my example after this.    
 */


class Exercise_05 {
    public static class OddsAndEvens {

        boolean odd;
        int count = 1;
        int MAX = 100;

        public void Odd(){
            synchronized (this){
                while (count < MAX){
                    while(!odd) {
                        try {
                            wait();

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Thread 1 = " + count);
                    count++;
                    odd = false;
                    notify();
                }
            }
        }

        public void Even(){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e1){
                e1.printStackTrace();
            }
            synchronized (this){
                while (count <= MAX) {
                    while (odd) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Thread 2 = " + count);
                    count++;
                    odd = true;
                    notify();
                }
            }
        }
    }

    public static void main(String[] args) {
        OddsAndEvens o = new OddsAndEvens();
        o.odd = true;
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                o.Even();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                o.Odd();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
