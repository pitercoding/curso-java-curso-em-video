package exercicios.ConversorTemperatura;

public class ConversorTemperatura {
    // Converte Celsius para Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Converte Fahrenheit para Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
