package Unit_Transducer;

public class UnitConverter {


    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double POUNDS_PER_KILOGRAM = 1/0.45359237;
    public static final double CENTIMETERS_PER_INCH = 2.54;
    public static final double INCHES_PER_CENTIMETER = 1/2.54;



    public static double toPounds(double kilograms){

        return kilograms * POUNDS_PER_KILOGRAM;
    }

    public static double toKilograms(double pounds){

        return pounds * KILOGRAMS_PER_POUND;
    }

    public static double toCentimeters(double inches){

        return inches * CENTIMETERS_PER_INCH;
    }

    public static double toInches(double centimeters){

        return centimeters * INCHES_PER_CENTIMETER;
    }

    public static double toFahrenheit(double celsius){

        return celsius * (9.0 / 5.0) + 32;
    }

    public static double toCelsius(double fahrenheit){
        return (fahrenheit - 32) *  (5.0 / 9.0);
    }
    private UnitConverter () {
        // 인스 턴스를 만들지 않고 static 한 방법 으로만 사용 하고 싶을 때 생성자 를 private 로 선언 하여 인스 턴스 생성을 막음
    }
}