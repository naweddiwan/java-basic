package reflection;

import java.lang.reflect.Field;

public class DataManager {

    private String name;
    private int id;
    public static void main(String[] args) {

        DataManager dataManager = new DataManager();
        Class c = dataManager.getClass();
        Field[] f = c.getDeclaredFields();
        for(Field field: f){
            System.out.println(field.getName());
        }
        System.out.println(c.getClass().getClass().getClass().getClass().getName());
    }

    @Override
    public String toString() {
        return "to string overriden";
    }
}
