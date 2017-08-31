package weather.uint;

import interfaces.DisplayElement;
import interfaces.Observer;
import interfaces.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
	private Subject weatherData;
	private float pressure;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Forecast:"+pressure);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.pressure = pressure;
		display();
	}

}
