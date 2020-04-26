import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MyArraysTest {

    @Test
    void search() {
        int[] array = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int number = 10;
        boolean expect = true;
        boolean result = MyArrays.search(array, number);
        assertEquals(expect, result);
    }
    @Test
    void search2() {
        int[] array = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int number = 2;
        boolean expect = true;
        boolean result = MyArrays.search(array, number);
        assertEquals(expect, result);
    }
    @Test
    void search3() {
        int[] array = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int number = 78;
        boolean expect = false;
        boolean result = MyArrays.search(array, number);
        assertEquals(expect, result);
    }
    @Test
    void search4() {
        int[] array = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int number = 79;
        boolean expect = true;
        boolean result = MyArrays.search(array, number);
        assertEquals(expect, result);
    }
    @Test
    void search5() {
        int[] array = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79, 88, 100};
        int number = 101;
        boolean expect = false;
        boolean result = MyArrays.search(array, number);
        assertEquals(expect, result);
    }
}