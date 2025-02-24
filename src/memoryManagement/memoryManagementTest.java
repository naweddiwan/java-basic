package memoryManagement;

import reflection.DataManager;

import java.lang.ref.WeakReference;

public class memoryManagementTest {
    public static void main(String[] args) {

        // Weak References are freed up by garbage collector as and when GC runs.
        WeakReference<DataManager> weakObj = new WeakReference<>(new DataManager());

        Object dataManager = new DataManager();
        System.out.println(dataManager.toString());
    }
}
