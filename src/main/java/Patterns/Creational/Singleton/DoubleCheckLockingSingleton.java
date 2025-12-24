package Patterns.Creational.Singleton;

public class DoubleCheckLockingSingleton {
    private static volatile DoubleCheckLockingSingleton instance;

    private DoubleCheckLockingSingleton(){}

    public static DoubleCheckLockingSingleton getInstance() {
        if(instance == null) { // First check (no locking)
            synchronized (DoubleCheckLockingSingleton.class) {
                if(instance == null){ // Second check (inside lock)
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }
}

class Client3 {
    public static void main(String[] args) {
        DoubleCheckLockingSingleton s1 = DoubleCheckLockingSingleton.getInstance();
        DoubleCheckLockingSingleton s2 = DoubleCheckLockingSingleton.getInstance();

        System.out.println(s1 == s2);  // true
    }
}


// Pros : ✅
// - Thread-safe
// - Lazy initialization
// - Better performance than synchronized method
// - Reduces synchronization overhead by locking only during the first creation


// Cons : ❌
// - More complex implementation
// - Requires careful handling of the volatile keyword(Forces 🔄 Main Memory sync) to ensure visibility

// Volatile Keyword  is used because of cache memory is not synced with main memory🧠 on time due to that two object is created.
// so we are using volatile Keyword on object so that object will create in memory directly.