import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;
public class RemoteControlTest {
	private Device mockDevice;
    private RemoteControl remoteControl;
    private AdvancedRemoteControl advancedRemoteControl;

    @Before
    public void setUp() {
        mockDevice = mock(Device.class);
        remoteControl = new RemoteControl(mockDevice);
        advancedRemoteControl = new AdvancedRemoteControl(mockDevice);
    }

    @Test
    public void testRemoteControlTurnOn() {
        remoteControl.turnOn();
        verify(mockDevice).turnOn();
    }

    @Test
    public void testRemoteControlTurnOff() {
        remoteControl.turnOff();
        verify(mockDevice).turnOff();
    }

    @Test
    public void testRemoteControlSetVolume() {
        remoteControl.setVolume(60);
        verify(mockDevice).setVolume(60);
    }

    @Test
    public void testAdvancedRemoteControlMute() {
        advancedRemoteControl.mute();
        verify(mockDevice).setVolume(0);
    }

}
