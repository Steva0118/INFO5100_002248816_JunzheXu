import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

// Singleton Pattern
        class WeatherStation {
            private static WeatherStation instance = new WeatherStation();

            private WeatherStation() {}

            public static WeatherStation getInstance() {
                return instance;
            }

            public String getWeatherUpdate() {
                // In a real scenario, this method would get real weather data
                return "Sunny, 75 degrees";
            }
        }

// Observer Pattern
        interface WeatherObserver {
            void update(String weather);
        }

        class WeatherDisplay implements WeatherObserver {
            private String name;

            public WeatherDisplay(String name) {
                this.name = name;
            }

            @Override
            public void update(String weather) {
                System.out.println(name + " display: Weather is " + weather);
            }
        }

        class WeatherBroadcaster {
            private List<WeatherObserver> observers = new ArrayList<>();

            public void addObserver(WeatherObserver observer) {
                observers.add(observer);
            }

            public void removeObserver(WeatherObserver observer) {
                observers.remove(observer);
            }

            public void notifyObservers(String weather) {
                for (WeatherObserver observer : observers) {
                    observer.update(weather);
                }
            }
        }

// Factory Method Pattern
        abstract class WeatherEvent {
            public abstract String getWeather();
        }

        class SunnyWeather extends WeatherEvent {
            @Override
            public String getWeather() {
                return "Sunny, 75 degrees";
            }
        }

        class RainyWeather extends WeatherEvent {
            @Override
            public String getWeather() {
                return "Rainy, 60 degrees";
            }
        }

        class WeatherEventFactory {
            public static WeatherEvent getWeatherEvent(String weatherType) {
                switch (weatherType) {
                    case "sunny":
                        return new SunnyWeather();
                    case "rainy":
                        return new RainyWeather();
                    default:
                        throw new IllegalArgumentException("Unknown weather type");
                }
            }
        }

         class DesignPatternDemo {
            public static void main(String[] args) {
                WeatherStation station = WeatherStation.getInstance();
                String weatherUpdate = station.getWeatherUpdate();

                WeatherBroadcaster broadcaster = new WeatherBroadcaster();
                broadcaster.addObserver(new WeatherDisplay("Display 1"));
                broadcaster.addObserver(new WeatherDisplay("Display 2"));

                // Factory Method usage
                WeatherEvent weatherEvent = WeatherEventFactory.getWeatherEvent("sunny");
                broadcaster.notifyObservers(weatherEvent.getWeather());
            }
        }

    }
}