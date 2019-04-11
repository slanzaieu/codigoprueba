import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {

    public static void main(String [] args) {
        double d = 0.0;

        NumberFormat format = new DecimalFormat();
        format.setMaximumFractionDigits(1);

        while (d < 1.0) {
            d += 0.1;
            d = Double.parseDouble(format.format(d));
            System.out.println(d);
        }

        System.out.println("d is 1");
    }
}
