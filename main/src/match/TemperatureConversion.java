package match;

/**
 * 温度转换：2469
 */
public class TemperatureConversion {
    public static void main(String[] args) {

    }

    private double[] temperatureConversion(double celsius) {
        double kaihuashi = (celsius + 273.15);
        double huashidu = (celsius * 1.80 + 32.00);
        return new double[]{kaihuashi, huashidu};
    }
}
