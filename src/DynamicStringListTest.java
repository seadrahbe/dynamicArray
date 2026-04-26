import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.*;


public class DynamicStringListTest {

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

    public void testRemove() {
        
        //arrange
        DynamicStringList list = new DynamicStringList();
        list.add("hi");
        list.add("hey");
        list.add("hello");

        //act
        list.remove(1);

        //assert
        assertEquals("hello", list.get(1));
        assertEquals("hi", list.get(0));
    }


    

    
}