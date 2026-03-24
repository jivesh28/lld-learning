package LLDPatterns;
// only one instance throughout the repo, used for DB pool, logging etc
public class Singleton {
//
    // the constructor must be private
    private Singleton(){
        // so no  object can be created
    };

    private static class helper{
        private final static Singleton Instance = new Singleton();
    }
    public static Singleton GetInstance() {

//            if (INSTANCE == null) {
//                synchronized (Singleton.class)
//                {
//                    if (INSTANCE == null) {
//                        INSTANCE = new Singleton();
//                    }
//                }
//            }
        return helper.Instance;
    }
}

