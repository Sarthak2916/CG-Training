package feature_8_2_26;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ListManagerTest {

    private ListManager manager;
    private List<Integer> list;

    @BeforeEach
    void setup() {
        manager = new ListManager();
        list = new ArrayList<>();
        list.add(10);
        list.add(20);
    }

    @Test
    void testAddElement() {
        manager.addElement(list, 30);

        assertTrue(list.contains(30));
        assertEquals(3, manager.getSize(list));
    }

    @Test
    void testRemoveElement() {
        boolean removed = manager.removeElement(list, 10);

        assertTrue(removed);
        assertFalse(list.contains(10));
        assertEquals(1, manager.getSize(list));
    }

    @Test
    void testRemoveElementNotPresent() {
        boolean removed = manager.removeElement(list, 99);

        assertFalse(removed);
        assertEquals(2, manager.getSize(list));
    }

    @Test
    void testGetSize() {
        assertEquals(2, manager.getSize(list));
    }
}

class ListManager {

    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    public boolean removeElement(List<Integer> list, int element) {
        return list.remove(Integer.valueOf(element));
    }

    public int getSize(List<Integer> list) {
        return list.size();
    }
}


