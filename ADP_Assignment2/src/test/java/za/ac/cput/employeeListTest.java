package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/*
    Ameer Dollie - 218336934
    This is the test class for List
 */
class employeeListTest {

    @Test //add from List
    void testAddList(){
        List<employee> employeeList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            String firstName = "Ameer" + 1;
            employee e = new employee(firstName);
            employeeList.add(e);
        }
        assertEquals(10 ,employeeList.size());
    }

    @Test //remove from List
    void testRemoveList(){
        List<employee> employeeList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            String firstName = "Ameer" + 1;
            employee e = new employee(firstName);
            employeeList.remove(e);
        }
        assertEquals(0, employeeList.size());
    }

    @Test //find in list
    void testFindList(){
        List<employee> employeeList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            String firstName = "Ameer" + 1;
            int id = 1;
            employee e = new employee(firstName, id);
            employeeList.add(e);
        }
        assertEquals(10, employeeList.size());
    }
}