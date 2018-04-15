import javax.ejb.Local;

@Local
public interface TemperatureConverter {

    double Fahr2Cels(double temp);
    double Cels2Fahr(double temp);
}
