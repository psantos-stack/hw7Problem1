import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayDictionaryTest {
    @Test
    public void demo() {
        int testSize = 5;
        ArrayDictionary dict = new ArrayDictionary(testSize);
        assertTrue(dict.add(2, 82));
        assertTrue(dict.add(4, 84));
        assertTrue(dict.add(7, 87));
        System.out.println(dict);
    }

    @Test
    public void remove() {
        // homework
        ArrayDictionary a = new ArrayDictionary(0);
        assertFalse(a.remove(0));  // place holder
        a = new ArrayDictionary(1);
        a.add(0, 0);
        assertTrue(a.remove(0));
        assertFalse(a.remove(7));
        a = new ArrayDictionary(4);
        a.add(0, 0);
        a.add(1, 0);
        assertTrue(a.remove(0));
        assertFalse(a.remove(7));
        a.add(2, 2);
        assertTrue(a.remove(2));

    }

    @Test
    public void contains() {
        // homework
        ArrayDictionary a = new ArrayDictionary(0);
        for(int i = -1; i <= 1; i++){
            assertFalse(a.contains(i));
        }
        ArrayDictionary b = new ArrayDictionary(1);
        for(int i = 1; i <= 3; i++){
            int val = (i==2)? 0:i;
            b.add(0, val);
        }
        assertFalse(b.contains(2));
        assertTrue(b.contains(0));  // place holder
        b.add(1, 1);
        b.add(1, 0);
        b.add(1, 5);
        for(int i = 0; i < 4; i++){
            if(i < 2) {
                assertTrue(b.contains(i));
            }
            else{
                assertFalse(b.contains(i));
            }
        }
        b.add(2, 2);
        b.add(2, 0);
        b.add(2, 6);
        assertFalse(b.contains(3));
        assertTrue(b.contains(1));
        b.add(4, 4);
        b.add(4, 0);
        b.add(4, 7);
        assertTrue(b.contains(1));
        assertTrue(b.contains(4));
        assertFalse(b.contains(7));
        assertFalse(b.contains(8));
    }
}