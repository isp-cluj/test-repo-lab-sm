package isp.lab4.exercise1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TemperatureSensorTest {
    
    @Test
    public void testConstructor(){
        TemperatureSensor t1 = new TemperatureSensor(10, "Plant_B");
        assertEquals(10, t1.getValue());
        assertEquals("Plant_B", t1.getLocation());
        
    }
}
