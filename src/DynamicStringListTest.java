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

    @Test
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
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(3);
        });
    }

    @Test
    public void testSize() {
        // arrange + act
        DynamicStringList list = new DynamicStringList();
        list.add("hi");
        list.add("hey");
        list.add("hello");

        DynamicStringList list2 = new DynamicStringList();
        list2.add("hi");

        DynamicStringList list3 = new DynamicStringList();


        // assert
        assertEquals(3, list.size());
        assertEquals(1, list2.size());
        assertEquals(0, list3.size());
    }

    @Test
    public void testCapacity() {

        DynamicStringList list = new DynamicStringList();
        list.add("hi");
        list.add("hey");
        list.add("hello");

        DynamicStringList list2 = new DynamicStringList();
        list2.add("hi");
        list2.add("hey");
        list2.add("hello");
        list2.add("hi");
        list2.add("hey");
        list2.add("hello");
        list2.add("hi");
        list2.add("hey");
        list2.add("hello");
        list2.add("hi");
        list2.add("hey");
        list2.add("hello");

        assertEquals(10, list.capacity());
        assertEquals(20, list2.capacity());

    }
    
}