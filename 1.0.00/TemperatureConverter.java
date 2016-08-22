import java.awt.EventQueue;
public class TemperatureConverter {
	
	int temperature;
	char convertTo;

	public String convertTemperature(int temperature, char convertTo) {

		switch (convertTo) {
		case 'F':
			temperature = (9 * temperature / 5) + 32;
			break;
		case 'C':
			temperature = 5 /9 * (temperature  - 32);
			break;
		}
		return ("Температура " + temperature + convertTo);
	}

	public static void main(String[] args) {
		TemperatureConverter OneTemperatureConverter = new TemperatureConverter();
		System.out.println(OneTemperatureConverter.convertTemperature(0, 'C'));

	}

}
