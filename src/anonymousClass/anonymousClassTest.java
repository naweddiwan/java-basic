package anonymousClass;

public class anonymousClassTest {
    public static void main(String[] args) {

        // Anonymous class
        Car audiObj = new Car() {
            @Override
            public void pressBreak() {
                System.out.println("pressing audi break;");
            }
        };
        audiObj.pressBreak();
    }
}
