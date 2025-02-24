package generics;

public class PrintGenericUpperBound<T extends Number> {
    T value;
    public  T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }

}
