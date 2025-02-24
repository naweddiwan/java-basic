package generics;

public class PrintMultiBound extends Print implements TestInterface1{
    @Override
    public void testMethod() {
        System.out.println( "test method");
    }
}
