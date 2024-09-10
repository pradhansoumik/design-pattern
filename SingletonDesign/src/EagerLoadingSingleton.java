/**
 * author: Soumik Pradhan
 * Singleton class
 * EAGER LOADING/EARLY LOADING ...
 */
public class EagerLoadingSingleton{
    private static EagerLoadingSingleton instance= new EagerLoadingSingleton(); // Static Because CREATED Only Once in memory.

    /**
     * private constructor
     */
    private EagerLoadingSingleton() {}

    /**
     * it is only getter exposed. no setter is exposed! hence,
     * nobody neither can modify this object, nor can have access to it outside this class.
     * here, we are only giving the get instance. not giving the set instance.
     */
    public static EagerLoadingSingleton getInstance() {
        return instance;
    }
}

