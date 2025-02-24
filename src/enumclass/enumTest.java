package enumclass;

public class enumTest {

    public static void main(String[] args) {

        CustomEnum monday = CustomEnum.MONDAY;
        System.out.println(monday.sampleMethod());

        CustomEnum tuesday = CustomEnum.TUESDAY;
        tuesday.aSampleAbstractMethod();
    }
}
