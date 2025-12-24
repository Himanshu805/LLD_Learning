package Patterns.Creational.Singleton;

public class BillPughSingleton {

    private BillPughSingleton(){}

    public static class BillPughHelper{
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return BillPughHelper.instance;
    }
}


// It rectified the issue of Eager Initialization.
// Putting the Object inside static nested class
// becsause the nested class not load at the time of program start(runtime).
// the  inner class is not loaded into memory until getInstance() is called.

//  ✅ It uses the JVM’s class-loading mechanism to ensure thread safety without using synchronized