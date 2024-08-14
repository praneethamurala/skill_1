import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class DeviceTest {
	private Device tv;
    private Device radio;

    @Before
    public void setUp() {
        tv = new TV();
        radio = new Radio();
    }

    @Test
    public void testTVTurnOn() {
        tv.turnOn();
        // Assume that turnOn will set some internal state indicating the device is on.
        // Simulate this check, e.g., by checking the output or internal state.
    }

    @Test
    public void testTVTurnOff() {
        tv.turnOn();
        tv.turnOff();
        // Similarly, assume that turnOff will set some internal state indicating the device is off.
    }

    @Test
    public void testTVSetVolume() {
        tv.setVolume(50);
        // You would check if the volume is set correctly, e.g., by inspecting internal state or output.
    }

    @Test
    public void testRadioTurnOn() {
        radio.turnOn();
    }

    @Test
    public void testRadioTurnOff() {
        radio.turnOn();
        radio.turnOff();
    }

    @Test
    public void testRadioSetVolume() {
        radio.setVolume(75);
    }

}
