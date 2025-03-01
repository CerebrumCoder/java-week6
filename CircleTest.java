import static org.junit.Assert.*;
import org.junit.Test;  

public class CircleTest {

    @Test
    public void getAreaTest1(){
           Circle c1 = new Circle(10);
           assertEquals(314.0, c1.getArea(), 0.2);
           
           c1.setRadius(20);
           assertEquals(1257.0, Math.round(c1.getArea()), 0.001); 
    }
    @Test
    public void getAreaTest2(){
           Circle c1 = new Circle();
           assertEquals(1,c1.getRadius(),0.2);
    }  
}