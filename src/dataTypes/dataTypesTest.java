package dataTypes;

import java.math.BigDecimal;

public class dataTypesTest {
    public static void main(String[] args) {
        char var = 0;
        System.out.println(var);

        byte var2 = 12;
        System.out.println(var2);

        float a = 0.7f;
        System.out.println((double) a );
        System.out.println(a);


        // Adding 2 big decimals
        BigDecimal b = new BigDecimal("123.23");
        BigDecimal c = new BigDecimal("10.555555");
        BigDecimal d = b.add(b);
        System.out.println(d);

        // using new Keyword creates s3 in heap memory
        String s1 = new String("Hello");
        // creates string in String Constant Pool
        String s2 = "Hello2";
        System.out.println(s1);

        // Variable args
        System.out.println(sum(1,2,5,3));
    }

    public static int sum(int ...nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }
}
