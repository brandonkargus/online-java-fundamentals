package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 * <p>
 * Create an application that creates a Thread using the Thread class
 */

class Exercise_02 extends Thread {
    public Exercise_02(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Starting " + currentThread().getName() + ".....");
        try {
            for (int count = 0; count < 10; count++) {

                Thread.sleep(400);
                System.out.println("In " + currentThread().getName() +
                        ", count is " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(currentThread().getName() + " interrupted.");
        }
        System.out.println(currentThread().getName() + " terminating.");
    }

    public static void main(String[] args) {
        Exercise_02 sample = new Exercise_02("sampleThread");
        Exercise_02 sample2 = new Exercise_02("sampleThread2");
        sample.setPriority(Thread.NORM_PRIORITY + 4);                          // Exercise_03
        sample2.setPriority(Thread.MIN_PRIORITY);
        sample2.start();
        sample.start();



    }

}