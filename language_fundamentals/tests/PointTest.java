import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    public void PointXGetterReturnsXValue() {
        var point = new Point(1,1);
        assertEquals(1, point.getX());
    }

    @Test
    public void PointYGetterReturnsYValue() {
        var point = new Point(1,1);
        assertEquals(1, point.getY());
    }
}