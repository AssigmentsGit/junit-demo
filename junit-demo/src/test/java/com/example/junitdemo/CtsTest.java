package com.example.junitdemo;

import com.example.junitdemo.model.Address;
import com.example.junitdemo.model.Cts;
import com.example.junitdemo.model.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Arrays;

public class CtsTest {

    Cts cts;
    Employee employee;

    @Mock
    Address address;

    @BeforeEach
    public void fillCtsProjectData() {
        address = Mockito.spy(new Address());
        employee = new Employee();
        employee.setAddresses(Arrays.asList(address));
        cts = new Cts();
        cts.setEmployees(Arrays.asList(employee));
    }

    @Test
    public void test() {
        Assertions.assertEquals(1, cts.getNumberOfEmployees());
    }

    @Test
    public void testEmployeeAddress() {
        Address test = employee.getAddresses().get(0);
        Mockito.doReturn("Hyd").when(address).getCity();
        Assertions.assertEquals("Hyd", test.getCity());
    }
}
