package weather.uint;

import interfaces.DisplayElement;
import interfaces.Observer;
import interfaces.Subject;

public class StatisticDisplay implements Observer, DisplayElement {
private Subject weatherData;
private float temperature;
private float humidity;
private float pressure;
	public StatisticDisplay(WeatherData weatherData) {
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("StatisticDisplay: ");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		display();
	}

	
}
