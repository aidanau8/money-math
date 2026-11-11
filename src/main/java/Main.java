import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {


           // public static void main(String[] args) {

            //    double d = 0.1;
           //     BigDecimal bigD = BigDecimal.ZERO;

           //     double doublePointThree = 0.1 + 0.2;
           //     System.out.println(doublePointThree);

            //    BigDecimal a = new BigDecimal("0.1");
            //    BigDecimal b = new BigDecimal("0.2");

            //    BigDecimal bigDecimalPointThree = a.add(b);
            //    System.out.println(bigDecimalPointThree);

             //   System.out.println();

             float f = 0;
             double d = 0;
             BigDecimal bigD = BigDecimal.ZERO;

        for (int i = 0; i < 10; i++) {

            f += 0.10f;
            d += 0.10;
            bigD = bigD.add(new BigDecimal("0.10"));

            System.out.println(f + " | " + d + " | " + bigD);
        }

        f = 0;
        d = 0;
        bigD = BigDecimal.ZERO;

        for (int i = 0; i < 1000; i++) {

            f += 19.99f;
            d += 19.99;
            bigD = bigD.add(new BigDecimal("19.99"));
        }
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("BigDecimal: " + bigD);

            }

        }
