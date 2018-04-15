
import javax.ejb.Local;
import javax.ejb.Stateful;
import java.io.Serializable;

@Stateful(name = "converterEJB")
@Local(value = TemperatureConverter.class)
public class ConverterBean implements TemperatureConverter,Serializable{
    public ConverterBean() {
    }


    public double Fahr2Cels(double temp) {
        return 5/9*(temp - 32);
    }

    public double Cels2Fahr(double temp) {
        return 9/5*(temp + 32);
    }
}
