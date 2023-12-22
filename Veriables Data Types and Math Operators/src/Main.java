public class Main {
    public static void main(String[] args) {
        int Z = 5;
        Z++;
        System.out.println("Z: " + Z);
        --Z;
        System.out.println("Z: "+ Z);

        int valueA = 10;
        int valueB = 20;
        int valueC = 30;
        int valueD = 40;

        int result1 = valueA - valueD / valueB;
        int result2 = valueA - valueC / (valueD * valueB);
        int result3 = valueC * valueA / (valueB + valueD - (valueC + valueB));
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        int intValueOne = 50;
        long longValueOne = intValueOne;
        System.out.println(longValueOne);

        long longValueTwo = 50;
        int intValueTwo = (int) longValueTwo;
        System.out.println(intValueTwo);
            // type conversions
        float floatVal = 1.0F;
        double doubleVal = 1.0D;
        byte byteVal = 5;
        short shortVal = 6;
        long longVal = 5;

        short resultA = (short) longVal;
        short resultB = (short) (byteVal - longVal);
        //   long result3 = longVal - floatVal;  --> float result3 = longVal - floatVal;
        float resultC = longVal - floatVal;

        // var anahtar kelimesi
        var v1 = 50; // v1 aslında int
        v1 = (int) 100.0;
        var thisValue = 7.5F; //thisValue aslında float
        v1 = (int) thisValue;

    }
}