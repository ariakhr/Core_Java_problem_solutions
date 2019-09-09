package design.patterns;

public class LazySingleton {

    private static volatile LazySingleton instance;

    private void SingletonDemo() {
    }

    public static LazySingleton getSingletonInstance() {

        if(instance == null) {
            synchronized (LazySingleton.class) {
                if(instance == null)
                    instance = new LazySingleton();
            }
        }
        return  instance;
    }
}
