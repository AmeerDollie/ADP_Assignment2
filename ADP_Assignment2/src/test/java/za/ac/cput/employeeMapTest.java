package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


/*
    Ameer Dollie - 218336934
    This is the test class for Map
 */

class employeeMapTest {

    @Test //add from Map
    void testAddMap(){
        Map<Integer, employee> employeeMap = new HashMap<>();
        for(int i = 0; i < 10; i++){
            String firstName = "Ameer" + 1;
            employee e = new employee(firstName);
            employeeMap.put(1, e);
        }
        assertEquals(1 ,employeeMap.size());
    }

    @Test //remove from Map
    void testRemoveMap(){
        Map<Integer, employee> employeeMap = new HashMap<>();
        for(int i = 0; i < 10; i++){
            String firstName = "Ameer" + 1;
            employee e = new employee(firstName);
            employeeMap.remove(e);
        }
        assertEquals(0, employeeMap.size());
    }

    @Test //find in Map
    void testFindMap(){
        Map<Integer, employee> employeeMap = new HashMap<>();
        for(int i = 0; i < 10; i++){
            String firstName = "Ameer" + 1;
            int id = 1;
            employee e = new employee(firstName, id);
            employeeMap.put(1, e);
        }
        assertEquals(1, employeeMap.size());
    }
}