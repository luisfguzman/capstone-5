import com.example.Application;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    // simple test
    @Test
    public void testApp() {
        Application myApp = new Application();

        String result = myApp.getStatus();

        assertEquals("OK", result);
    }

}