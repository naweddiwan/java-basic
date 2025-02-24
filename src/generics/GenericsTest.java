package generics;

public class GenericsTest {
    public static void main(String[] args) {

        // 1. Using Object class
        Print p = new Print();

        p.setPrintValue(1);
        Object obj = p.getPrintValue();

        // For Generic Object explicit typecasting is needed.
        if((int)obj == 1) {
            System.out.println("Do something");
        }
        System.out.println(obj);


        // Using Generic Class, we get the datatype that we initialize the object with.
        PrintGeneric<Integer> p1 = new PrintGeneric<>();
        p1.setPrintValue(2);

        Integer val = p1.getPrintValue();
        System.out.println(val);


        // Generics Method example
        GenericMethod gm = new GenericMethod();
        gm.putObject(new Car("Audi"));
        Car c = gm.getObject();
        //System.out.println(c.getName());

        // Raw Object;
        PrintGeneric rawObject = new PrintGeneric();
        rawObject.setPrintValue(1);

        PrintGenericUpperBound<Integer> numberUpperBoundObj= new PrintGenericUpperBound<>();
        numberUpperBoundObj.setValue(12);
        System.out.println(numberUpperBoundObj.getValue());


        // Gives error
       // PrintGenericUpperBound<String> stringPrintGenericUpperBound = new PrintGenericUpperBound<>();


        // Multibound Generic Class

        PrintGenericMultibound<PrintMultiBound> multiboundObj = new PrintGenericMultibound<>();





    }
}
