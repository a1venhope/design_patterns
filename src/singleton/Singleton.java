package singleton;

// 线程安全
class Singleton {
    private static Singleton singleton;
    private Singleton() {
        // Construct
    }

    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
