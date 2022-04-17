/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Test.com;

import com.bantinas.mycicd.Employee;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class EmployeeTest {
    
    Employee emp;
    
    public EmployeeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
         //Employee  emp = new Employee(1,"Tom");
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
         
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testEmployee() {
    
        emp = new Employee(1,"Tom");
        assertEquals(1,emp.getId());
        assertEquals("Tom",emp.getName());
    }
}
