import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import weather.WeatherReporter;
import weather.WeatherService;

import java.util.Iterator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.*;
public class Seminar4Test3 {

    @Test
    public  void WeatherTest() {

        WeatherService mockWeatherService = mock(WeatherService.class);
        when(mockWeatherService.getCurrentTemperature()).thenReturn(22);

        WeatherReporter reporter =new WeatherReporter(mockWeatherService);

        String result = reporter.generateReport();

        assertThat(result).isEqualTo( "Текущая температура: " + "21" + " градусов.");
    }

}
