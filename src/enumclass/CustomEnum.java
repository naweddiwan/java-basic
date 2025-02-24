package enumclass;

import lombok.Getter;

@Getter
public enum CustomEnum {
    MONDAY(1, "Monday Blues", 123.0){
        @Override
        public String sampleMethod() {
            return "MONDAY METHOD INVOKED";
        }

        @Override
        public void aSampleAbstractMethod() {
            System.out.println("Monday's Abstract method implemenation");
        }
    },
    TUESDAY(2, "Tuesday Tandav", 8676.87) {
        @Override
        public void aSampleAbstractMethod() {
            System.out.println("Tuesday's Abstract method implemenation");
        }
    },

    WEDNESDAY(3, "Wednesday Wanga", 8723.98) {
        @Override
        public void aSampleAbstractMethod() {
            System.out.println("Wednesday's Abstract method implemenation");
        }
    };

    private int value;
    private String  description;
    private double rate;

    CustomEnum(int value, String description, double rate){
        this.value = value;
        this.description = description;
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public int getValue() {
        return value;
    }

    public double getRate() {
        return rate;
    }


    public String sampleMethod() {
        return "SAMPLE METHOD INVOKED";
    }

    public abstract void aSampleAbstractMethod();

}
