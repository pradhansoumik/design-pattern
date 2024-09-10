public class SingletonDemo {

    public static void main(String[] args) {

        System.out.println("+++ EAGER LOADING +++");

        //in case of EAGER Loading the instance is already crated/available at the COMPILE time
        //even before the EagerLoadingSingleton.getInstance() is executed.
        EagerLoadingSingleton obj1 = EagerLoadingSingleton.getInstance();//new obj;
        System.out.println(obj1);

        EagerLoadingSingleton obj2 = EagerLoadingSingleton.getInstance();//new obj;
        System.out.println(obj2);

        System.out.println("+++ LAZY LOADING +++");
        //in case of Lazy Loading the instance will be already crated/available at the RUN time
        //after LazyLoadingSingleton.getInstance() is executed.
        LazyLoadingSingleton lls1 = LazyLoadingSingleton.getInstance();//new obj;
        System.out.println(lls1);

        LazyLoadingSingleton lls2 = LazyLoadingSingleton.getInstance();//new obj;
        System.out.println(lls2);

        System.out.println("+++ THREAD SAFETY +++");

        ThreadSafetySingleton tss1 = ThreadSafetySingleton.getInstance();
        System.out.println(tss1);
        ThreadSafetySingleton tss2 = ThreadSafetySingleton.getInstance();
        System.out.println(tss2);
    }
}
