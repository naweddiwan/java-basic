package generics;

public class GenericMethod {


    // Generic method with correct return type
    public <T> T getObject() {
        return null; // Unsafe cast, better to return null or accept a class parameter
    }

    // Generic method instead of using class-level generics
    public <T> void putObject(T val) {
        System.out.println("put object: " + val);
    }
}
