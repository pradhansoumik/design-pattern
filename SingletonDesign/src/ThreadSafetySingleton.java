/**
 * Thread Safety - Lazy Loading
 */
public class ThreadSafetySingleton {
    private static volatile ThreadSafetySingleton instance = null;

    /**
     * private constructor; but you can still refer to the constructor from outside the class
     * using Reflection, here we are blocking this.
     * instance data member will be reflected via this constructor & that constructor i can refer outside the class.
     * so, to avoid access using Reflection below is the logic
     */
    private ThreadSafetySingleton() {
        if(instance!=null){ // If there is already an instance, dont allow tro create another instance
            throw new RuntimeException("Runtime Exception: Reflection is restricted");// Can be accessed via Reflection
        }
    }

    /**
     * it is only getter exposed. no setter is exposed! hence,
     * nobody neither can modify this object, nor can have access to it outside this class.
     * here, we are only giving the get instance. not giving the set instance.
     * For first instance,  a null object would be created,
     * For second instance onwards, it will reuse the same instance.
     */
    public static ThreadSafetySingleton getInstance() {
        /**
         * Thread 1 and Thread 2 call getInstance() simultaneously.
         * Both threads check the first condition: if (instance == null).
         * Since instance is null, both threads pass this check. However,
         * since the first if is outside the synchronized block,
         * both threads can pass the check concurrently.
         */
        if (instance == null) {
            /**
             * Thread 2 cannot enter the synchronized block until Thread 1 finishes executing and releases the lock.
             */
            synchronized (ThreadSafetySingleton.class) { // Used at block level not class level
                /**
                 * If there is no second if check inside the synchronized block,
                 * Thread 2 would proceed to create another ThreadSafetySingleton() instance,
                 * because it doesn't know that Thread 1 has already created the instance.
                 *
                 * Thread 1 acquires the lock on the ThreadSafetySingleton.class and proceeds inside the synchronized block.
                 * Checking again for instance == null because only 1 thread should have access to this resource - THREAD SAFETY
                 */
                if (instance == null) {
                    instance = new ThreadSafetySingleton();
                }
            }
        }
        return instance;// return the already existing instance
    }
}
