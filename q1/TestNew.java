package q1;

import static org.junit.Assert.*;
import org.junit.Test;


public class TestNew {
    @Test
    public void testCount() {
        Counter c = new Counter();
        assertTrue(c.getCount() == 0);
    }

}
