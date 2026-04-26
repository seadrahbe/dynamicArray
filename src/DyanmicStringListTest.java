import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;


public class DyanmicStringListTest {

    @Test
    public void testGet() {
        //arrange
        DynamicStringList list = new DynamicStringList();
        //act
        list.add("hello");
        list.add("world");
        
        //assert
        assertEquals("hello", list.get(0));
        assertEquals("world", list.get(1));

    }
    @Test
    public void testAdd() {
        //arrange
        DynamicStringList list = new DynamicStringList();
        //act
        list.add("hello");
        //assert
        assertEquals(1, list.size());
    }

    

    
}