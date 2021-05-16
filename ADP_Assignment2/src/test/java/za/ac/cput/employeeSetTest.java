package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/*
    Ameer Dollie - 218336934
    This is the test class for Set
 */

class employeeSetTest {

    @Test //add from List
    void testAddSet(){
        Set<employee> employeeSet = new HashSet<>();
        for(int i = 0; i < 10; i++){
            String firstName = "Ameer" + 1;
            employee e = new employee(firstName);
            employeeSet.add(e);
        }
        assertEquals(10 ,employeeSet.size());
    }

    @Test //remove from Set
    void testRemoveSet(){
        Set<employee> employeeSet = new HashSet<>();
        for(int i = 0; i < 10; i++){
            String firstName = "Ameer" + 1;
            employee e = new employee(firstName);
            employeeSet.remove(e);
        }
        assertEquals(0, employeeSet.size());
    }

    @Test //find in Set
    void testFindSet(){
        Set<employee> employeeSet = new HashSet<>();
        for(int i = 0; i < 10; i++){
            String firstName = "Ameer" + 1;
            int id = 1;
            employee e = new employee(firstName, id);
            employeeSet.add(e);
        }
        assertEquals(1, employeeSet.size());
    }
}