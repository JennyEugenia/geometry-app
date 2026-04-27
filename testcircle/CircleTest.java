import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    //add delta- tolerance værdi
    @Test
    public void testCalculateArea() {
        Circle c = new Circle( 1);
       assertEquals(3.14, c.calculateArea(), 0.01);
    }
    @Test
    //C= 2 *Pi*2 = 4Pi, dvs C = 4 * 3.1416 = 12.5664, estimate 13
    public void testCalculateCircumference() {
        Circle c = new Circle(2);
        assertEquals(12.5, c.calculateCircumference(), 0.1);

    }

}