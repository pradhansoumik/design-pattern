/**
 * Lazy Loading
 */
public class LazyLoadingSingleton {
    private static LazyLoadingSingleton instance = null;

    /**
     * private constructor
     */
    private LazyLoadingSingleton() {
    }

    /**
     * it is only getter exposed. no setter is exposed! hence,
     * nobody neither can modify this object, nor can have access to it outside this class.
     * here, we are only giving the get instance. not giving the set instance.
     * For first instance,  a null object would be created,
     * For second instance onwards, it will reuse the same instance.
     */
    public static LazyLoadingSingleton getInstance() {
        if(instance==null){
            instance = new LazyLoadingSingleton();
        }
        return instance;// Returning Same Instance
    }
}
